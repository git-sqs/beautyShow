package com.mac.video.web;

import com.mac.common.vo.ResultVo;
import com.mac.video.entity.MacVideo;
import com.mac.video.service.MacVideoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZY
 * @version 1.0
 * @description:
 * @date 2019/12/14 11:40
 */
@Api(value = "商品视频的操作功能实现",tags = "商品视频的操作功能实现")
@RestController
public class MacVideoController {
    @Autowired
    private MacVideoService macVideoService;

    @ApiOperation(value = "商品视频的添加实现",notes = "商品视频的添加实现")
    @PostMapping("/mac/video/insertVideo.do")
    public ResultVo insertVideo(@RequestParam MacVideo macVideo) {
        return macVideoService.insert(macVideo);
    }

    @ApiOperation(value = "商品所有视频的展示",notes = "商品所有视频的展示")
    @PostMapping("/mac/video/selectAll.do")
    public ResultVo selectAll() {
        return macVideoService.selectAll();
    }

    @ApiOperation(value = "根据视频id查询对应的视频",notes = "根据视频id查询对应的视频")
    @PostMapping("/mac/video/queryVideoById.do")
    public ResultVo queryVideoById(int vid) {
        return macVideoService.queryVideoById(vid);
    }

}
