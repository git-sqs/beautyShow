package com.mac.product.dao;

import com.mac.product.entity.MacType;
import org.springframework.stereotype.Repository;

@Repository
public interface MacTypeMapper {
    MacType findTypeByGoodsId(Integer tid);
}