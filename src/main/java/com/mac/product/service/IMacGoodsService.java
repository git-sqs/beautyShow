package com.mac.product.service;

import com.mac.common.vo.ResultVo;
import com.mac.product.entity.MacGoods;

/**
 * @Author: sqs
 * @Date: 2019/12/14 15:30
 * @Description:
 * @Version: 1.0
 */
public interface IMacGoodsService {

    ResultVo saveGoods(MacGoods macGoods);

    ResultVo queryGoods();

}
