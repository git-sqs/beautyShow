package com.mac.video.dao;

import com.mac.dto.GoodsVideoDto;
import com.mac.video.entity.MacVideo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZY
 * @version 1.0
 * @description:
 * @date 2019/12/14 11:27
 */
@Repository
public interface MacVideoMapper {
    int insert(MacVideo macVideo);
    List<MacVideo> selectAll();
    MacVideo queryVideoById(int vid);
    List<GoodsVideoDto> queryGoodsVideoById(int vid);
    int delVideoById(Integer vid);
    int updateVideoById(MacVideo macVideo);
}
