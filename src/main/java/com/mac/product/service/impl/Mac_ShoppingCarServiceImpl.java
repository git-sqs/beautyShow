package com.mac.product.service.impl;

import com.mac.common.vo.ResultVo;
import com.mac.product.dao.Mac_ColorMapper;
import com.mac.product.dao.Mac_GoodsMapper;
import com.mac.product.dao.Mac_TypeMapper;
import com.mac.product.entity.Mac_Color;
import com.mac.product.entity.Mac_Goods;
import com.mac.product.service.Mac_ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weining
 * @date 2019/12/12 22:33
 */
@Service
public class Mac_ShoppingCarServiceImpl implements Mac_ShoppingCarService {

    @Autowired
    private Mac_GoodsMapper mac_goodsMapper;
    @Autowired
    private Mac_ColorMapper mac_colorMapper;
    @Autowired
    private Mac_TypeMapper mac_typeMapper;

    @Override
    public ResultVo findByGoodsId(Integer id) {
        return ResultVo.Ok(mac_goodsMapper.findByGoodsId(id));
    }

    @Override
    public ResultVo findColorByGoodsId(Integer id) {
        Mac_Goods goodsId = mac_goodsMapper.findByGoodsId(id);
        System.out.println(goodsId.getCId());
        System.out.println(mac_colorMapper.findColorByGoodsId(goodsId.getCId()));
        return ResultVo.Ok(mac_colorMapper.findColorByGoodsId(goodsId.getCId()));
    }

    @Override
    public ResultVo findTypeByGoodsId(Integer id) {
        Mac_Goods goodsId = mac_goodsMapper.findByGoodsId(id);
        System.out.println(goodsId.getTId());
        System.out.println(mac_typeMapper.findTypeByGoodsId(goodsId.getTId()));
        return ResultVo.Ok(mac_typeMapper.findTypeByGoodsId(goodsId.getTId()));
    }
}
