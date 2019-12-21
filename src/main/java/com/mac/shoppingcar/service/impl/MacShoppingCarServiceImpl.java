package com.mac.shoppingCar.service.impl;

import com.mac.common.vo.ResultVo;
import com.mac.shoppingCar.dao.MacShoppingCarMapper;
import com.mac.shoppingCar.entity.MacShoppingCar;
import com.mac.shoppingCar.service.MacShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author weining
 * @date 2019/12/12 22:33
 */
@Service
public class MacShoppingCarServiceImpl implements MacShoppingCarService {

    @Autowired
    private MacShoppingCarMapper macShoppingCarMapper;

    @Override
    public ResultVo insertShoppingCar(MacShoppingCar record) {
        if (macShoppingCarMapper.insertShoppingCar(record) > 0) {
            return ResultVo.Ok("商品已经添加到购物车");
        } else {
            return ResultVo.fail("添加购物车失败");
        }
    }

    @Override
    public ResultVo delShoppingCar(Integer scid) {
        if (macShoppingCarMapper.delShoppingCar(scid) > 0) {
            return ResultVo.Ok("商品已经从购物车中移除");
        }else {
            return ResultVo.fail("删除购物车失败");
        }
    }

    @Override
    public ResultVo findAllShoppingCar(Integer uid) {
        return ResultVo.Ok(macShoppingCarMapper.findAll(uid));
    }
}
