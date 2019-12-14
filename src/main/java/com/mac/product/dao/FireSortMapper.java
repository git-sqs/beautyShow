package com.mac.product.dao;

import com.mac.product.entity.FireSort;
import com.mac.product.entity.MacGoods;

import java.util.List;

public interface FireSortMapper {

    int insert(FireSort record);

    List<FireSort> queryAllFireSort();

    List<MacGoods> queryAllFireGoods();

    int delFireSaleSort(int id);

    int goodBecomeFire(int goodId, int sortId);

    int fireBecomeGood(int goodId);
}