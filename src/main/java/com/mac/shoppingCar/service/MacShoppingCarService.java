package com.mac.shoppingCar.service;

import com.mac.common.vo.ResultVo;
import com.mac.shoppingCar.entity.MacShoppingCar;

/**
 * @author weining
 * @date 2019/12/12 22:31
 */
public interface MacShoppingCarService {

    /**
     *添加购物车
     * @param record 购物车的详细信息
     * @return 返回int类型的数据
     */
    ResultVo insertShoppingCar(MacShoppingCar record);

    /**
     * 删除购物车
     * @param oid 商品id
     * @return 返回int类型
     */
    ResultVo delShoppingCar(Integer oid);

    /**
     * 查询所有购物车的东西
     * @return 返回所有购物车的商品
     */
   ResultVo findAllShoppingCar(Integer uid);

}
