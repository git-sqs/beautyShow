package com.mac.product.web;

import com.mac.common.vo.ResultVo;
import com.mac.product.entity.FireSort;
import com.mac.product.service.IMacFireSaleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: sqs
 * @Date: 2019/12/14 11:46
 * @Description:
 * @Version: 1.0
 */
@Api(value = "热卖产品",tags = "热卖产品")
@RestController
@CrossOrigin
public class FireSaleController {

    @Autowired
    private IMacFireSaleService macFireSaleService;

    @ApiOperation(value = "热卖商品显示",notes = "前台热卖商品显示")
    @GetMapping("/api/mac/product/fireSale/fireSaleGoods.do")
    public ResultVo queryFireSaleGoods() {
       return macFireSaleService.queryAllFireGoods();
    }

    @ApiOperation(value = "热卖商品类型显示",notes = "前台热卖商品类型显示")
    @GetMapping("/api/mac/product/fireSale/fireSaleSort.do")
    public ResultVo queryFireSaleSort() {
        return macFireSaleService.queryAllFireSort();
    }

    @ApiOperation(value = "热卖商品类型的添加",notes = "后台热卖商品类型的添加")
    @PostMapping("/api/mac/product/fireSale/saveFireSaleSort.do")
    public ResultVo saveFireSaleSort(@RequestBody  FireSort fireSort) {
        return macFireSaleService.saveFireSaleSort(fireSort);
    }

    @ApiOperation(value = "热卖商品类型的删除",notes = "后台热卖商品类型的删除")
    @DeleteMapping("/api/mac/product/fireSale/delFireSaleSort.do")
    public ResultVo delFireSaleSort(int id) {
        return macFireSaleService.delFireSaleSort(id);
    }

    @ApiOperation(value = "添加为热卖商品",notes = "后台添加商品为热卖商品")
    @PostMapping("/api/mac/product/fireSale/goodBecomeFire.do")
    public ResultVo goodBecomeFire(int goodId,int sortId) {
        return macFireSaleService.goodBecomeFire(goodId,sortId);
    }

    @ApiOperation(value = "商品取消成为热卖商品",notes = "后台商品取消成为热卖商品")
    @PostMapping("/api/mac/product/fireSale/fireBecomeGood.do")
    public ResultVo fireBecomeGood(int goodId) {
        return macFireSaleService.fireBecomeGood(goodId);
    }



}
