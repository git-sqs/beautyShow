package com.mac.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author: sqs
 * @Date: 2019/12/10 17:12
 * @Description: 分页展示
 * @Version: 1.0
 */
@Data
public class PageBean<T> {

    /**
     * 当前页数
     */
    private int page;

    /**
     * 总数
     */
    private long total;

    /**
     * 每页数据条数
     */
    private int size;

    /**
     * 总页数
     */
    private long totalPage;

    /**
     * 页面展示的数据
     */
    private List<T> data;
}
