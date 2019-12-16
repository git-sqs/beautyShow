package com.mac.api;

import com.alipay.api.AlipayApiException;
import com.mac.common.vo.ResultVo;
import com.mac.pay.service.AlipayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * @author weining
 * @date 2019/12/13 14:02
 */
@Api(value = "支付宝支付页面",tags = "支付功能的实现")
@RestController
public class PayController {

    @Autowired
    private AlipayService alipayService;

    @ApiOperation("取消支付")
    ResultVo close(String WIDTCout_trade_no,String WIDTCtrade_no) throws UnsupportedEncodingException, AlipayApiException{
        return alipayService.close(WIDTCout_trade_no,WIDTCtrade_no);
    }

    ResultVo refund(String WIDTRout_trade_no,String WIDTRtrade_no,String WIDTRrefund_amount, String WIDTRrefund_reason,String WIDTRout_request_no) throws AlipayApiException, UnsupportedEncodingException{
        return alipayService.refund(WIDTRout_trade_no,WIDTRtrade_no,WIDTRrefund_amount,WIDTRrefund_reason,WIDTRout_request_no);
    }

    ResultVo query(String WIDTQout_trade_no,String WIDTQtrade_no) throws UnsupportedEncodingException, AlipayApiException{
        return alipayService.query(WIDTQout_trade_no,WIDTQtrade_no);
    }

    ResultVo pay(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException{
        return alipayService.pay(request,response);
    }

    ResultVo fastPay(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException{
        return alipayService.fastPay(request,response);
    }

    ResultVo notify(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException{
        return alipayService.notify(request,response);
    }

    ResultVo returnurl(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException{
        return alipayService.returnurl(request,response);
    }

}
