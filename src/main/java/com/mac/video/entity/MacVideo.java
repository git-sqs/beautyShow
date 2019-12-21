package com.mac.video.entity;

import lombok.Data;

/**
 * @author ZY
 * @version 1.0
 * @description:
 * @date 2019/12/14 10:58
 */
@Data
public class MacVideo {
    private Integer vId;

    private String vTitle;

    private String vDesc;

    private String vUrl = "";

    private String vImgUrl = "";
}
