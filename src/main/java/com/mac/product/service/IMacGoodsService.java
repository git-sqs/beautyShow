package com.mac.product.service;

import com.mac.common.vo.ResultVo;
import com.mac.dto.GoodsQueryDto;
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
    ResultVo addGoods(MacGoods macGoods, MultipartFile img);

    ResultVo queryGoods();

    //查询指定类型商品
    ResultVo queryByKind(int kid);

    //查询指定商品信息
    ResultVo findByGoodsId(int id);

    ResultVo findGoodsByKeyWord(String keyWord);

    ResultVo backGoodsList(GoodsQueryDto goodsQueryDto);

    ResultVo deleteGood(int id);

    ResultVo updateGood(MacGoods macGoods, MultipartFile img);
}
