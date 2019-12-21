package com.mac.oss.service.impl;


import com.mac.common.vo.ResultVo;
import com.mac.oss.dao.OssUrlDao;
import com.mac.oss.entity.OssUrl;
import com.mac.oss.service.IOssUrlService;
import com.mac.utils.AliOssUtil;
import com.mac.utils.DateUtil;
import com.mac.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;


/**
 * @Author: sqs
 * @Date: 2019/12/12 19:47
 * @Description:
 * @Version: 1.0
 */
@Service
public class OssUrlServiceImpl implements IOssUrlService {

    @Autowired
    private OssUrlDao ossUrlDao;

    @Override
    public String upload(MultipartFile multipartFile) {
        if (!multipartFile.isEmpty()) {
            //1、获取文件名
            String filename = multipartFile.getOriginalFilename();
            //2、如果长度过长进行截取
            if (filename.length() > 40) {
                filename = filename.substring(filename.length() - 40);
            }
            //3、重命名
            filename = UUIDUtils.getUUID() + "_"+filename;
            //4、上传到OSS服务器上
            try {
                //5、定义上传保存的时效
                Date date = DateUtil.addYear(3);
                //6、上传到OSS服务器
                String uploadUrl = AliOssUtil.upload(filename, multipartFile.getBytes(), date);
                //7、上传到数据库
                ossUrlDao.insertOssUrl(new OssUrl(filename,uploadUrl,date));
                return uploadUrl;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public ResultVo selectOssUrlAll() {
        List<OssUrl> ossUrls = ossUrlDao.selectOssUrlAll();
        return ResultVo.Ok(ossUrls);
    }

    @Override
    public ResultVo selectFromOss() {
        List<String> list = AliOssUtil.list();
        return ResultVo.Ok(list);
    }

    @Override
    public ResultVo delOssUrl(String objname) {
        if(AliOssUtil.del(objname) && ossUrlDao.delOssUrl(objname)!=0) {
            return ResultVo.Ok();
        }
        return ResultVo.fail();
    }
}
