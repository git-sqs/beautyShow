package com.mac.shoppingCar.dao;

import com.mac.dto.MacProductDto;
import com.mac.shoppingCar.entity.MacShoppingCar;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author weining
 * @date 2019/12/14 11:46
 */
@Repository
public interface MacShoppingCarMapper {

 /**
 *添加购物车
 * @param record 购物车的详细信息
 * @return 返回int类型的数据
 */
    int insertShoppingCar(MacShoppingCar record);

    /**
     * 删除购物车
     * @param scid 商品id
     * @return 返回int类型
     */
    int delShoppingCar(Integer scid);

    /**
     * 查询所有购物车的东西
     * @return 返回所有购物车的商品
     */
    List<MacProductDto> findAll(Integer uid);
}
