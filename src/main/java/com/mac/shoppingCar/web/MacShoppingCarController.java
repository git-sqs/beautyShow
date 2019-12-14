package com.mac.shoppingCar.web;

import com.mac.common.vo.ResultVo;
import com.mac.shoppingCar.entity.MacShoppingCar;
import com.mac.shoppingCar.service.MacShoppingCarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weining
 * @date 2019/12/12 22:29
 */
@Api(value = "购物车的实现",tags = "购物车的实现")
@RestController
public class MacShoppingCarController {

    @Autowired
    private MacShoppingCarService macShoppingCarService;

    /**
     *添加购物车
     * @param macShoppingCar 购物车的详细信息
     * @return 返回int类型的数据
     */
    @ApiOperation(value = "将商品添加到购物车中(前台)",notes ="将商品添加到购物车中" )
    @PostMapping("/mac/shoppingCar/insertShoppingCar.do")
    ResultVo insertShoppingCar(MacShoppingCar macShoppingCar){
        return macShoppingCarService.insertShoppingCar(macShoppingCar);
    }

    /**
     * 删除购物车
     * @param scid 商品id
     * @return 返回int类型
     */
    @ApiOperation(value = "将商品从购物车中删除(前台)",notes = "通过Id查询指定商品颜色")
    @DeleteMapping("/mac/shoppingCar/delShoppingCarById.do")
    ResultVo delShoppingCarById(Integer scid){
        return macShoppingCarService.delShoppingCar(scid);
    }

    @ApiOperation(value = "查询所有在购物车中的商品(前台)",notes = "查询所有在购物车中的商品")
    @GetMapping("/mac/shoppingCar/findAllShoppingCar.do")
    public ResultVo findAllShoppingCar(){
        return macShoppingCarService.findAllShoppingCar();
    }
}
