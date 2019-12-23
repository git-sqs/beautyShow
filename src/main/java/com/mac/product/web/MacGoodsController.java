package com.mac.product.web;

import com.mac.common.vo.ResultVo;
import com.mac.dto.GoodsQueryDto;
import com.mac.product.entity.MacGoods;
import com.mac.product.service.IMacGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: sqs
 * @Date: 2019/12/14 15:41
 * @Description:
 * @Version: 1.0
 */
@CrossOrigin
@Api(value = "全部产品",tags = "全部产品")
@RestController
public class MacGoodsController {

    @Autowired
    IMacGoodsService macGoodsService;

    @ApiOperation(value ="查询所有商品",notes = "查询所有商品")
    @GetMapping("/api/mac/product/macgoods/queryGoods.do")
    public ResultVo queryGoods(){
        return macGoodsService.queryGoods();
    }

    @ApiOperation(value ="查询指定商品",notes = "查询指定商品")
    @GetMapping("/api/mac/product/macgoods/findByGoodsId.do")
    public ResultVo queryAllSort(int id) {
        return macGoodsService.findByGoodsId(id);
    }

    @ApiOperation(value ="查询指定标签商品",notes = "查询指定标签商品")
    @GetMapping("/api/mac/product/macgoods/queryByKind.do")
    public ResultVo querySortByUp(int kid) {
        return macGoodsService.queryByKind(kid);
    }


    @ApiOperation(value ="关键字搜索商品",notes = "关键字搜索商品")
    @PostMapping("/api/mac/product/macgoods/findGoodsByKeyWord.do")
    public ResultVo findGoodsByKeyWord(String keyWord) {
        return macGoodsService.findGoodsByKeyWord(keyWord);
    }


    @ApiOperation(value ="后台管理添加商品",notes = "后台管理添加商品")
    @PostMapping("/api/mac/background/product/addGoods.do")
    public ResultVo addGoods(@RequestBody  MacGoods macGoods, MultipartFile img) {
        return macGoodsService.addGoods(macGoods,img);
    }

    @ApiOperation(value ="后台商品列表",notes = "后台商品列表")
    @GetMapping("/api/mac/background/product/backGoodsList.do")
    public ResultVo backGoodsList(GoodsQueryDto goodsQueryDto) {
        return macGoodsService.backGoodsList(goodsQueryDto);
    }

    @ApiOperation(value ="后台管理修改商品",notes = "后台管理修改商品")
    @PostMapping("/api/mac/background/product/updateGoods.do")
    public ResultVo updateGood(MacGoods macGoods, MultipartFile img) {
        return macGoodsService.updateGood(macGoods,img);
    }

    @ApiOperation(value ="后台商品删除",notes = "后台商品删除")
    @GetMapping("/api/mac/background/product/deleteGood.do")
    public ResultVo deleteGood(int id) {
        return macGoodsService.deleteGood(id);
    }

}
