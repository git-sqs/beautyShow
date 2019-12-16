package com.mac.order.dao;

import com.mac.order.entity.MacOrder;
import com.mac.order.entity.MacOrderDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MacOrderMapper {

    /**
     *添加订单
     * @param record 订单的详细信息
     * @return 返回int类型的数据
     */
    int insert(MacOrder record);

    /**
     * 删除订单
     * @param oid 订单id
     * @return 返回int类型
     */
    int delOrder(Integer oid);

    /**
     * 查询所有订单
     * @return 返回所有订单
     */
    List<MacOrderDto> findAllByUid(Integer uid);

    /**
     * 查询所有订单
     * @return 返回所有订单
     */
    List<MacOrderDto> findAll();


    /**
     * 通过商品名字查订单
     */
    List<MacOrderDto> findOrderByGoodsName(String goodName);

    /**
     * 通过订单id 修改订单状态
     * @param sid 订单状态
     * @return int
     */
    int updateOrder(Integer oid,Integer sid);
  }