package com.mac.product.dao;


import com.mac.product.entity.MacColor;
import org.springframework.stereotype.Repository;

@Repository
public interface MacColorMapper {
    MacColor findColorByGoodsId(Integer id);
}