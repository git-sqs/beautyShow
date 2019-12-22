package com.mac.order.web;

import com.mac.common.vo.ResultVo;
import com.mac.order.entity.MacOrder;
import com.mac.order.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weining
 * @date 2019/12/14 9:29
 */
@RestController
@Api(value = "订单的管理",tags = "订单的管理")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     *添加订单
     * @param id 订单的详细信息
     * @return 返回R
     */
    @ApiOperation(value = "添加订单(前台)",notes = "添加订单")
    @PostMapping("mac/order/insertOrder.do")
    ResultVo insertOrder(Integer id){
        System.out.println(0);
       return orderService.insert(id);
    }

    /**
     * 删除订单
     * @param oid 订单id
     * @return 返回R
     */
    @ApiOperation(value = "删除订单(前台)",notes = "删除订单")
    @DeleteMapping("mac/order/delOrder.do")
    ResultVo delOrder(Integer oid){
        return orderService.delOrder(oid);
    }

    /**
     * 查询所有订单
     * @return R
     */
    @ApiOperation(value = "通过用户id查看所有订单(前台)",notes = "查看所有订单")
    @GetMapping("mac/order/findAllOrderByUid.do")
    ResultVo findAllOrderByUid(Integer uid){
        return orderService.findAllOrder(uid);
    }

    /**
     * 查询所有订单
     * @return R
     */
    @ApiOperation(value = "查看所有订单(后台)",notes = "查看所有订单")
    @GetMapping("mac/order/findAllOrder.do")
    ResultVo findAllOrder(){
        return orderService.findAllOrder();
    }


    @ApiOperation(value = "通过订单id修改订单的状态(后台)",notes = "修改订单")
    @PostMapping("mac/order/updateOrder.do")
    ResultVo updateOrder(Integer oid,Integer sid){
        return orderService.updateOrder(oid,sid);
    }

    @ApiOperation(value = "通过商品名字查询所有订单(后台)",notes = "通过商品名字查询所有订单")
    @PostMapping("mac/order/findOrderByGoodName.do")
    ResultVo findOrderByGoodsName(String goodName){
        return orderService.findOrderByGoodName(goodName);
    }
}
