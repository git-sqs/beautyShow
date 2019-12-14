package com.mac.product.service.impl;

import com.mac.common.vo.ResultVo;
import com.mac.product.dao.FireSortMapper;
import com.mac.product.entity.FireSort;
import com.mac.product.entity.MacGoods;
import com.mac.product.service.IMacFireSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: sqs
 * @Date: 2019/12/14 11:18
 * @Description:
 * @Version: 1.0
 */
@Service
public class MacFireSaleServiceImpl implements IMacFireSaleService {

    @Autowired
    private FireSortMapper fireSortMapper;

    @Override
    public ResultVo queryAllFireGoods() {
        return ResultVo.Ok(fireSortMapper.queryAllFireGoods());
    }

    @Override
    public ResultVo saveFireSaleSort(FireSort fireSort) {
        if (fireSort != null && fireSortMapper.insert(fireSort) > 0) {
            return ResultVo.Ok();
        }
        return ResultVo.fail();

    }

    @Override
    public ResultVo delFireSaleSort(int id) {
        if (fireSortMapper.delFireSaleSort(id) > 0) {
            return ResultVo.Ok();
        }
        return ResultVo.fail();
    }

    @Override
    public ResultVo goodBecomeFire(int goodId, int sortId) {
        if (fireSortMapper.goodBecomeFire(goodId,sortId) > 0) {
            return ResultVo.Ok();
        }
        return ResultVo.fail();
    }

    @Override
    public ResultVo fireBecomeGood(int goodId) {
        if (fireSortMapper.fireBecomeGood(goodId) > 0) {
            return ResultVo.Ok();
        }
        return ResultVo.fail();
    }

    @Override
    public ResultVo queryAllFireSort() {
        return ResultVo.Ok(fireSortMapper.queryAllFireSort());
    }


}
