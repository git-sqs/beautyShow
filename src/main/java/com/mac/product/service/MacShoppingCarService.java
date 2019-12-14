package com.mac.product.service;

import com.mac.common.vo.ResultVo;

/**
 * @author weining
 * @date 2019/12/12 22:31
 */
public interface MacShoppingCarService {
    ResultVo findByGoodsId(Integer id);

    ResultVo findColorByGoodsId(Integer id);

    ResultVo findTypeByGoodsId(Integer id);
}
