package com.mac.video.service;

import com.mac.common.vo.ResultVo;
import com.mac.video.entity.MacVideo;

/**
 * @author ZY
 * @version 1.0
 * @description:
 * @date 2019/12/14 11:29
 */
public interface MacVideoService {
    ResultVo insert(MacVideo macVideo);

    ResultVo selectAll();

    ResultVo queryVideoById(int vid);
}
