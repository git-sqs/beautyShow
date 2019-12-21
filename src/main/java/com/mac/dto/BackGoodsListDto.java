package com.mac.dto;

import lombok.Data;

/**
 * @Author: sqs
 * @Date: 2019/12/21 16:33
 * @Description:
 * @Version: 1.0
 */
@Data
public class BackGoodsListDto {
    private Integer mId;

    private String mName;

    private Integer mWeight;

    private Integer mPrice;

    private String mImgUrl;

    private String mDesc;

    private Integer cId;

    private String cName;

    private Integer tId;

    private String tName;

    private Integer kId;

    private String kName;

    private Integer fId;

    private Integer vId;

    private String vUrl;

    private String vImgUrl;
}
