package com.mac.product.dao;


import com.mac.product.entity.Mac_Color;
import org.springframework.stereotype.Repository;

@Repository
public interface Mac_ColorMapper {
    Mac_Color findColorByGoodsId(Integer id);
}