package com.mac.product.dao;

import com.mac.product.entity.Mac_Goods;
import org.springframework.stereotype.Repository;

@Repository
public interface Mac_GoodsMapper {

   Mac_Goods findByGoodsId(Integer id);

}