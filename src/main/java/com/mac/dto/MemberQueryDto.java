package com.mac.dto;

import lombok.Data;

/**
 * @Author: sqs
 * @Date: 2019/12/10 17:51
 * @Description: 用于用户条件查询的实体类
 * @Version: 1.0
 */
@Data
public class MemberQueryDto {

    /**
     * 当前页数
     */
    private int page;

    /**
     * 每页展示条数
     */
    private int size;
}
