package com.mac.product.service;

import com.mac.common.vo.ResultVo;
import com.mac.product.entity.Mac_Color;
import com.mac.product.entity.Mac_Goods;
import com.mac.product.entity.Mac_Type;

/**
 * @author weining
 * @date 2019/12/12 22:31
 */
public interface Mac_ShoppingCarService {
    ResultVo findByGoodsId(Integer id);

    ResultVo findColorByGoodsId(Integer id);

    ResultVo findTypeByGoodsId(Integer id);
}
