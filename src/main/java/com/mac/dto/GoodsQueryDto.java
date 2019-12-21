package com.mac.dto;

import lombok.Data;

/**
 * @Author: sqs
 * @Date: 2019/12/21 16:10
 * @Description:
 * @Version: 1.0
 */
@Data
public class GoodsQueryDto {
    private int page;
    private int limit;
    private String goodsName;
}
