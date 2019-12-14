package com.mac.product.dao;

import com.mac.product.entity.Mac_Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Mac_GoodsMapper {

   Mac_Goods findByGoodsId(Integer id);

   List<Mac_Goods> findByKind(String kind);

}