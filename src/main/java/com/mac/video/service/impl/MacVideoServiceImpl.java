package com.mac.video.service.impl;

import com.mac.common.vo.ResultVo;
import com.mac.dto.GoodsVideoDto;
import com.mac.oss.service.IOssUrlService;
import com.mac.video.dao.MacVideoMapper;
import com.mac.video.entity.MacVideo;
import com.mac.video.service.MacVideoService;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author ZY
 * @version 1.0
 * @description:
 * @date 2019/12/14 11:32
 */
@Service
public class MacVideoServiceImpl implements MacVideoService {

    @Autowired
    private MacVideoMapper macVideoMapper;

    @Autowired
    private IOssUrlService iOssUrlService;
    @Override
    public ResultVo insert(MacVideo macVideo, MultipartFile vImgUrl, MultipartFile vUrl) {

        String img = iOssUrlService.upload(vImgUrl);
        String url = iOssUrlService.upload(vUrl);

        macVideo.setVImgUrl(img);
        macVideo.setVUrl(url);
        int c = macVideoMapper.insert(macVideo);

        if (c > 0) {
            return ResultVo.Ok();
        } else {
            return ResultVo.fail("商品视频添加失败");
        }
    }

    @Override
    public ResultVo selectAll() {
        List<MacVideo> videos = macVideoMapper.selectAll();
        if (null != videos) {
            return ResultVo.Ok(videos);
        } else {
            return ResultVo.fail();
        }
    }

    @Override
    public ResultVo queryVideoById(int vid) {
        MacVideo macVideo = macVideoMapper.queryVideoById(vid);

        if (null != macVideo) {
            return ResultVo.Ok(macVideo);
        } else {
            return ResultVo.fail();
        }
    }

    @Override
    public ResultVo queryGoodsVideoById(int vid) {
        GoodsVideoDto videoDto = macVideoMapper.queryGoodsVideoById(vid);

        System.out.println("我是service--------------"+videoDto);

        if (null != videoDto) {
            return ResultVo.Ok(videoDto);
        } else {
            return ResultVo.fail();
        }
    }

    @Override
    public ResultVo delVideoById(Integer vid) {
        if (macVideoMapper.delVideoById(vid) > 0) {
            return ResultVo.Ok();
        } else {
            return ResultVo.fail();
        }
    }

    @Override
    public ResultVo updateVideoById(MacVideo macVideo) {
        if (macVideoMapper.updateVideoById(macVideo) > 0) {
            return ResultVo.Ok();
        } else {
            return ResultVo.fail();
        }
    }
}
