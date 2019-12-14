package com.mac.shoppingcar.web;

import com.mac.common.vo.ResultVo;
import com.mac.product.service.MacShoppingCarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weining
 * @date 2019/12/12 22:29
 */
@Api(value = "购物车的实现",tags = "购物车的实现")
@RestController
public class MacShoppingCar {

    @Autowired
    private MacShoppingCarService macShoppingCarService;

    @ApiOperation(value = "通过Id查询商品数据",notes ="通过Id查询商品数据" )
    @GetMapping("/mac/shoppingCar/findByGoodsId.do")
    public ResultVo findByGoodsId(Integer id){
        return macShoppingCarService.findByGoodsId(id);
    }

    @ApiOperation(value = "通过Id查询指定商品颜色",notes = "通过Id查询指定商品颜色")
    @GetMapping("/mac/shoppingCar/findColorByGoodsId.do")
    public ResultVo findColorByGoodsId(Integer id){
        return macShoppingCarService.findColorByGoodsId(id);
    }

    @ApiOperation(value = "通过Id查询指定商品类型",notes = "通过Id查询指定商品类型")
    @GetMapping("/mac/shoppingCar/findTypeByGoodsId.do")
    public ResultVo findTypeByGoodsId(Integer id){
        return macShoppingCarService.findTypeByGoodsId(id);
    }
}
