package com.mac.product.service;

import com.mac.common.vo.ResultVo;
import com.mac.product.entity.FireSort;

/**
 * @Author: sqs
 * @Date: 2019/12/14 11:17
 * @Description: 热卖商品
 * @Version: 1.0
 */
public interface IMacFireSaleService {

    ResultVo queryAllFireSort();

    ResultVo queryAllFireGoods();

    ResultVo saveFireSaleSort(FireSort fireSort);

    ResultVo delFireSaleSort(int id);

    ResultVo goodBecomeFire(int goodId,int sort);

    ResultVo fireBecomeGood(int goodId);
}
