package com.mac.order.service.impl;

import com.mac.common.vo.ResultVo;
import com.mac.dto.MacAllInformationDto;
import com.mac.order.dao.MacOrderMapper;
import com.mac.order.entity.MacOrder;
import com.mac.order.service.OrderService;
import com.mac.product.dao.MacGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weining
 * @date 2019/12/14 9:44
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private MacOrderMapper macOrderMapper;
    @Autowired
    private MacGoodsMapper macGoodsMapper;

    /**
     * 添加订单G
     * @param gid 订单的详细信息
     * @return 返回R
     */
    @Override
    public ResultVo insert(Integer gid) {

        /**
         * 将商品数量*商品价格 获取总价钱
         */
        MacAllInformationDto goods = macGoodsMapper.findByGoodsId(gid);
        System.out.println(goods.toString());
        MacOrder record = new MacOrder();
        record.setOPrice(goods.getMPrice());
        record.setAmount(1);
        record.setCId(goods.getCId());
        record.setMId(goods.getMId());
        record.setTId(goods.getTId());
        //********************************
        record.setUId(1);
        System.out.println(record.toString());
       if ( macOrderMapper.insert(record)>0){
           return ResultVo.Ok("添加成功");
       }else {
           return ResultVo.Ok("添加失败");
       }
    }

    /**
     * 删除订单
     * @param oid 订单id
     * @return R
     */
    @Override
    public ResultVo delOrder(Integer oid) {
        if (macOrderMapper.delOrder(oid)>0){
            return ResultVo.Ok("删除订单成功");
        }else {
            return ResultVo.fail("删除订单失败");
        }
    }

    /**
     * 查询所有订单
     * @return 所有订单
     */
    @Override
    public ResultVo findAllOrder(Integer uid) {
        return ResultVo.Ok( macOrderMapper.findAllByUid(uid));
    }

    @Override
    public ResultVo findAllOrder() {
        return ResultVo.Ok( macOrderMapper.findAll());
    }

    @Override
    public ResultVo updateOrder(Integer oid,Integer sid) {
        return ResultVo.Ok(macOrderMapper.updateOrder(oid,sid));
    }

    @Override
    public ResultVo findOrderByGoodName(String goodName) {
        if (goodName!=null) {
            return ResultVo.Ok(macOrderMapper.findOrderByGoodsName(goodName));
        }else {
            return ResultVo.fail("请输入你想要查的订单名字");
        }
    }


}
