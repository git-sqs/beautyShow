package com.mac.shoppingcar.service.impl;

import com.mac.common.vo.ResultVo;
import com.mac.product.dao.MacColorMapper;
import com.mac.product.dao.MacGoodsMapper;
import com.mac.product.dao.MacTypeMapper;
import com.mac.product.entity.MacGoods;
import com.mac.shoppingcar.service.MacShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weining
 * @date 2019/12/12 22:33
 */
@Service
public class MacShoppingCarServiceImpl implements MacShoppingCarService {

    @Autowired
    private MacGoodsMapper macGoodsMapper;
    @Autowired
    private MacColorMapper macColorMapper;
    @Autowired
    private MacTypeMapper macTypeMapper;

    @Override
    public ResultVo findByGoodsId(Integer id) {
        return ResultVo.Ok(macGoodsMapper.findByGoodsId(id));
    }

    @Override
    public ResultVo findColorByGoodsId(Integer id) {
        MacGoods goodsId = macGoodsMapper.findByGoodsId(id);
        System.out.println(goodsId.getCId());
        System.out.println(macColorMapper.findColorByGoodsId(goodsId.getCId()));
        return ResultVo.Ok(macColorMapper.findColorByGoodsId(goodsId.getCId()));
    }

    @Override
    public ResultVo findTypeByGoodsId(Integer id) {
        MacGoods goodsId = macGoodsMapper.findByGoodsId(id);
        System.out.println(goodsId.getTId());
        System.out.println(macTypeMapper.findTypeByGoodsId(goodsId.getTId()));
        return ResultVo.Ok(macTypeMapper.findTypeByGoodsId(goodsId.getTId()));
    }
}
