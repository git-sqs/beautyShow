package com.mac.product.dao;

import com.mac.dto.MacGoodsDto;
import com.mac.product.entity.FireSort;

import java.util.List;

public interface FireSortMapper {

    int insert(FireSort record);

    List<FireSort> queryAllFireSort();

    List<MacGoodsDto> queryAllFireGoods();

    int delFireSaleSort(int id);

    int goodBecomeFire(int goodId, int sortId);

    int fireBecomeGood(int goodId);
}