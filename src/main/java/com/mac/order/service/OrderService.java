package com.mac.order.service;

import com.mac.common.vo.ResultVo;
import com.mac.order.entity.MacOrder;


/**
 * @author weining
 * @date 2019/12/14 9:28
 */
public interface OrderService {
    /**
     *添加订单
     * @param gid 订单的详细信息
     * @return 返回R
     */
    ResultVo insert(Integer gid);

    /**
     * 删除订单
     * @param oid 订单id
     * @return 返回R
     */
    ResultVo delOrder(Integer oid);

    /**
     * 查询所有订单
     * @return R
     */
    ResultVo findAllOrder(Integer uid);

    /**
     * 查询所有订单
     * @return R
     */
    ResultVo findAllOrder();

    ResultVo updateOrder(Integer oid,Integer sid);

    ResultVo findOrderByGoodName(String goodName);
}
