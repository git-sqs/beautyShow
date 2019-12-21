package com.mac.product.service;

import com.mac.common.vo.ResultVo;
import com.mac.dto.MacProductDto;
import com.mac.product.entity.MacGoods;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: sqs
 * @Date: 2019/12/14 15:30
 * @Description:
 * @Version: 1.0
 */
public interface IMacGoodsService {

    //后台添加商品
    ResultVo addGoods(MacGoods macGoods, MultipartFile multipartFile);

    ResultVo queryGoods();

    //查询指定类型商品
    ResultVo queryByKind(int kid);

    //查询指定商品信息
    ResultVo findByGoodsId(int id);

    ResultVo findGoodsByKeyWord(String keyWord);
}
