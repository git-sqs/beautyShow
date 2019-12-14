package com.mac.product.dao;

import com.mac.dto.MacProductDto;
import com.mac.common.vo.ResultVo;
import com.mac.product.entity.MacGoods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MacGoodsMapper {

   MacProductDto findByGoodsId(Integer id);
    MacGoods findByGoodsId(Integer id);

   //查询指定种类商品
   List<MacProductDto> findByKind(int kid);

}