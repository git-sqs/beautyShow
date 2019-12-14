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
     * @param record 订单的详细信息
     * @return 返回R
     */
    @ApiOperation(value = "添加订单",notes = "添加订单")
    @PostMapping("mac/order/insertOrder.do")
    ResultVo insertOrder(MacOrder record){
       return orderService.insert(record);
    }

    /**
     * 删除订单
     * @param oid 订单id
     * @return 返回R
     */
    @ApiOperation(value = "删除订单",notes = "删除订单")
    @DeleteMapping("mac/order/delOrder.do")
    ResultVo delOrder(Integer oid){
        return orderService.delOrder(oid);
    }

    /**
     * 查询所有订单
     * @return R
     */
    @ApiOperation(value = "查看所有订单",notes = "查看所有订单")
    @GetMapping("mac/order/findAllOrder.do")
    ResultVo findAllOrder(){
        return orderService.findAll();
    }
}
