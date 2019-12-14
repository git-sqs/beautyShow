package com.mac.dto;

import lombok.Data;

/**
 * @author weining
 * @date 2019/12/14 11:56
 */
@Data
public class MacProductDto {
    private Integer scId;

    private String mName;

    private String cName;

    private String mUrl;

    private String tName;

    private Integer amount = 1;

    private Integer mPrice;
}
