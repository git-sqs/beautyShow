package com.mac.product.web;

import com.mac.common.vo.ResultVo;
import com.mac.product.service.IMacGoodsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sqs
 * @Date: 2019/12/14 15:41
 * @Description:
 * @Version: 1.0
 */
@Api(value = "全部产品",tags = "全部产品")
@RestController
public class MacGoodsController {

    @Autowired
    IMacGoodsService macGoodsService;






}
