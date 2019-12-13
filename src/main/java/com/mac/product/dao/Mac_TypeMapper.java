package com.mac.product.dao;

import com.mac.product.entity.Mac_Type;
import org.springframework.stereotype.Repository;

@Repository
public interface Mac_TypeMapper {
    Mac_Type findTypeByGoodsId(Integer tid);
}