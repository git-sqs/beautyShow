package com.mac.product.service.impl;

import com.mac.common.vo.ResultVo;
import com.mac.dto.MacProductDto;
import com.mac.product.dao.MacGoodsMapper;
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



    //后台添加商品
    @Override
    public ResultVo addGoods(MacGoods macGoods) {

        if (goodsMapper.addGoods(macGoods) > 0) {
            return ResultVo.Ok();
        } else {
            return ResultVo.fail();
        }
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

    //指定商品信息
    @Override
    public ResultVo findByGoodsId(int id) {
        return ResultVo.Ok(goodsMapper.findByGoodsId(id));
    }

    @Override
    public ResultVo findGoodsByKeyWord(String keyWord) {
        return null;
    }


}
