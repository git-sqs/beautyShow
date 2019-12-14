package com.mac.product.dao;

import com.mac.common.vo.ResultVo;
import com.mac.product.entity.MacGoods;
import org.springframework.stereotype.Repository;

@Repository
public interface MacGoodsMapper {

    MacGoods findByGoodsId(Integer id);


}