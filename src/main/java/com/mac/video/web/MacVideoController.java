package com.mac.video.web;

import com.mac.common.vo.ResultVo;
import com.mac.video.entity.MacVideo;
import com.mac.video.service.MacVideoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

    @ApiOperation(value = "商品视频的添加实现(后台)",notes = "商品视频的添加实现(后台)")
    @PostMapping("/mac/video/insertVideo.do")
    public ResultVo insertVideo(MacVideo macVideo, MultipartFile multipartFile1 , MultipartFile multipartFile2) {
        return macVideoService.insert(macVideo,multipartFile1,multipartFile2);
    }

    @ApiOperation(value = "根据视频id删除视频(后台)",notes = "根据视频id删除视频(后台)")
    @DeleteMapping("/mac/video/delVideoById.do")
    public ResultVo delVideoById(Integer vid) {
        return macVideoService.delVideoById(vid);
    }

    @ApiOperation(value = "根据视频id修改视频内容(后台)",notes = "根据视频id修改视频内容(后台)")
    @PostMapping("/mac/video/updateVideoById.do")
    public ResultVo updateVideoById(MacVideo macVideo) {
        return macVideoService.updateVideoById(macVideo);
    }

    @ApiOperation(value = "视频展示列表(后台)",notes = "视频展示列表(后台)")
    @GetMapping("/mac/video/queryVideoAll.do")
    public ResultVo queryVideoAll() {
        return macVideoService.selectAll();
    }

    @ApiOperation(value = "商品所有视频的展示(前台)",notes = "商品所有视频的展示(前台)")
    @GetMapping("/mac/video/selectAll.do")
    public ResultVo selectAll() {
        return macVideoService.selectAll();
    }

    @ApiOperation(value = "根据视频id查询对应的视频(前台)",notes = "根据视频id查询对应的视频(前台)")
    @GetMapping("/mac/video/queryVideoById.do")
    public ResultVo queryVideoById(Integer vid) {
        return macVideoService.queryVideoById(vid);
    }

    @ApiOperation(value = "根据视频id查询对应的商品(前台)",notes = "根据视频id查询对应的商品(前台)")
    @GetMapping("/mac/video/queryGoodsVideoById.do")
    public ResultVo queryGoodsVideoById(Integer vid) {
        return macVideoService.queryGoodsVideoById(vid);
    }
}
