package com.mac.order.entity;

import lombok.Data;

/**
 * @author weining
 * @date 2019/12/14 10:42
 */
@Data
public class MacOrderVo {
    private Integer oId;

    private String mName;

    private String cName;

    private String tName;

    private Integer oPrice;

    private Integer amount;
}
