package com.mac.product.web;

import com.mac.common.vo.ResultVo;
import com.mac.product.service.ITotalSortService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sqs
 * @Date: 2019/12/14 16:38
 * @Description:
 * @Version: 1.0
 */
@CrossOrigin
@Api(value = "商品类型的操作",tags = "商品类型的操作")
@RestController
public class TotalSortController {

    @Autowired
    ITotalSortService totalSortService;

    @ApiOperation(value ="查询所有的商品类型前台",notes = "查询所有的商品类型")
    @GetMapping("/api/mac/product/totalSort/queryAllSort.do")
    public ResultVo queryAllSort() {
        return totalSortService.queryAllSort();
    }

    @ApiOperation(value ="根据上一级类型查询下一级的商品类型（前台,后台）",notes = "根据上一级类型查询下一级的商品类型")
    @GetMapping("/api/mac/product/totalSort/querySortByUp.do")
    public ResultVo querySortByUp(int sortId) {
        return totalSortService.querySortByUp(sortId);
    }


    @ApiOperation(value ="查询所有的商品类型后台",notes = "查询所有的商品类型后台")
    @GetMapping("/api/mac/product/totalSort/backAllSort.do")
    public ResultVo backAllSort() {
        return totalSortService.backAllSort();
    }
}
