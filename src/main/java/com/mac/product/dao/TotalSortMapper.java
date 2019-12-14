package com.mac.product.dao;

import com.mac.product.entity.TotalSort;

import java.util.List;

public interface TotalSortMapper {

    int insert(TotalSort record);

    List<TotalSort> queryAllSort();

    List<TotalSort> querySortByUp(int sortId);
}