package com.mac.product.dao;

import com.mac.dto.*;

import com.mac.product.entity.MacGoods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MacGoodsMapper {

    //后台添加商品
   int addGoods(MacGoods MacGoods);

   //查询指定商品
   MacAllInformationDto findByGoodsId(Integer id);

   //查询指定种类商品
   List<MacGoodsDto> findByKind(int kid);

    List<MacGoodsDto> findGoodsByKeyWord(String keyWord);

    List<BackGoodsListDto> backGoodsList(GoodsQueryDto goodsQueryDto);

    int deleteGood(int id);

    int updateGood(MacGoods macGoods);
}