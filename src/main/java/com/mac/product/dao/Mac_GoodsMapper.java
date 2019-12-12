package com.mac.product.dao;

import com.mac.product.entity.Mac_Goods;

public interface Mac_GoodsMapper {
    int insert(Mac_Goods record);

    int insertSelective(Mac_Goods record);
}