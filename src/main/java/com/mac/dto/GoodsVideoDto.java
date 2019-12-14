package com.mac.dto;

import lombok.Data;

/**
 * @author ZY
 * @version 1.0
 * @description:
 * @date 2019/12/14 14:18
 */
@Data
public class GoodsVideoDto {

    private Integer vId;

    private String vTitle;

    private String vDesc;

    private String vUrl;

    private String vImgUrl;

    private Integer mId;

    private String mName;

    private Integer mPrice;

    private String mImgUrl;

    private String tName;

    private String cName;
}
