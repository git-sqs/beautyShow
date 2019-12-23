package com.mac.video.service;

import com.mac.common.vo.ResultVo;
import com.mac.video.entity.MacVideo;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ZY
 * @version 1.0
 * @description:
 * @date 2019/12/14 11:29
 */
public interface MacVideoService {
    ResultVo insert(MacVideo macVideo,MultipartFile vImgUrl, MultipartFile vUrl);

    ResultVo selectAll();

    ResultVo queryVideoById(int vid);

    ResultVo queryGoodsVideoById(int vid);

    ResultVo delVideoById(Integer vid);

    ResultVo updateVideoById(MacVideo macVideo);
}
