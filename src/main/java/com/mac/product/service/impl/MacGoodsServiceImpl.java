package com.mac.product.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mac.common.vo.ResultVo;
import com.mac.dto.BackGoodsListDto;
import com.mac.dto.GoodsQueryDto;
import com.mac.dto.MacProductDto;
import com.mac.oss.service.IOssUrlService;
import com.mac.product.dao.MacGoodsMapper;
import com.mac.product.entity.MacGoods;
import com.mac.product.service.IMacGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

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
    private IOssUrlService ossUrlService;
    //后台添加商品
    @Override
    public ResultVo addGoods(MacGoods macGoods, MultipartFile img) {

        String upload = ossUrlService.upload(img);
        macGoods.setMImgUrl(upload);
        if (goodsMapper.addGoods(macGoods) > 0) {
            return ResultVo.Ok();
        } else {
            return ResultVo.fail();
        }
    }

    @Override
    public ResultVo queryGoods() {
        return ResultVo.Ok(goodsMapper.queryGoods());
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
        return ResultVo.Ok(goodsMapper.findGoodsByKeyWord(keyWord));
    }

    @Override
    public ResultVo backGoodsList(GoodsQueryDto goodsQueryDto) {
        PageHelper.startPage(goodsQueryDto.getPage(),goodsQueryDto.getLimit());
        List<BackGoodsListDto> backGoodsListDtos = goodsMapper.backGoodsList(goodsQueryDto);
        return ResultVo.Ok(backGoodsListDtos);
    }

    @Override
    public ResultVo deleteGood(int id) {
        if(goodsMapper.deleteGood(id)>0) {
            return ResultVo.Ok();
        } else {
            return ResultVo.fail();
        }

    }

    @Override
    public ResultVo updateGood(MacGoods macGoods, MultipartFile img) {
        if(img!=null){
            macGoods.setMImgUrl(ossUrlService.upload(img));
        }
        System.out.println(macGoods);
        if (goodsMapper.updateGood(macGoods) > 0) {
            return ResultVo.Ok();
        } else {
            return ResultVo.fail();
        }
    }


}
