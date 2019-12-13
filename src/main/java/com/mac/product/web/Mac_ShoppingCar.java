package com.mac.product.web;

import com.mac.common.vo.ResultVo;
import com.mac.product.entity.Mac_Goods;
import com.mac.product.service.Mac_ShoppingCarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weining
 * @date 2019/12/12 22:29
 */
@Api(value = "购物车的实现",tags = "购物车的实现")
@RestController
public class Mac_ShoppingCar {

    @Autowired
    private Mac_ShoppingCarService mac_shoppingCarService;

    @ApiOperation(value = "通过Id查询商品数据",notes ="通过Id查询商品数据" )
    @GetMapping("/api/product/findByGoodsId.do")
    public ResultVo findByGoodsId(Integer id){
        return mac_shoppingCarService.findByGoodsId(id);
    }

    @ApiOperation(value = "通过Id查询指定商品颜色",notes = "通过Id查询指定商品颜色")
    @GetMapping("/api/product/findColorByGoodsId.do")
    public ResultVo findColorByGoodsId(Integer id){
        return mac_shoppingCarService.findColorByGoodsId(id);
    }

    @ApiOperation(value = "通过Id查询指定商品类型",notes = "通过Id查询指定商品类型")
    @GetMapping("/api/product/findTypeByGoodsId.do")
    public ResultVo findTypeByGoodsId(Integer id){
        return mac_shoppingCarService.findTypeByGoodsId(id);
    }
}
