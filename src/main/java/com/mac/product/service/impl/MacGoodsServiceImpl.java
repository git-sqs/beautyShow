package com.mac.product.service.impl;

import com.mac.common.vo.ResultVo;
import com.mac.product.entity.MacGoods;
import com.mac.product.service.IMacGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: sqs
 * @Date: 2019/12/14 15:31
 * @Description:
 * @Version: 1.0
 */
@Service
public class MacGoodsServiceImpl implements IMacGoodsService {

    @Autowired
    private MacGoodsMapper goodsMapper;
    @Autowired
    private MacGoodsMapper macGoodsMapper;


    @Override
    public ResultVo saveGoods(MacGoods macGoods) {

        return null;
    }

    @Override
    public ResultVo queryGoods() {
        return null;
    }

    //指定类型的商品
    @Override
    public ResultVo queryByKind(int kid) {
        return ResultVo.Ok(goodsMapper.findByKind(kid));
    }

    @Override
    public ResultVo findByGoodsId(int id) {
        return ResultVo.Ok(goodsMapper.findByGoodsId(id));
    }


}
