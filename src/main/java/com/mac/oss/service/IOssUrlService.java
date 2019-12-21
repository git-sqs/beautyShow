package com.mac.oss.service;

import com.mac.common.vo.ResultVo;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: sqs
 * @Date: 2019/12/12 19:47
 * @Description:
 * @Version: 1.0
 */
public interface IOssUrlService {

    String upload(MultipartFile multipartFile);

    ResultVo selectOssUrlAll();

    ResultVo selectFromOss();

    ResultVo delOssUrl(String objname);
}
