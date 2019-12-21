package com.mac.product.entity;

import lombok.Data;

@Data
public class MacGoods {
    private Integer mId;

    private String mName;

    private Integer mWeight;

    private Integer mPrice;

    private String mImgUrl;

    private String mDesc;

    private Integer cId;

    private Integer tId;

    private Integer fId;

    private Integer vId;

    private Integer kId;
}