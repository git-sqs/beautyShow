package com.mac.pay.service;

import com.alipay.api.AlipayApiException;
import com.mac.common.vo.ResultVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * @author weining
 * @date 2019/12/14 19:22
 */
public interface AlipayService {
    ResultVo pay(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException;

    ResultVo fastPay(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException;

    ResultVo notify(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException;

    ResultVo returnurl(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException;

    ResultVo close(String widtCout_trade_no, String widtCtrade_no)throws UnsupportedEncodingException, AlipayApiException;

    ResultVo refund(String widtRout_trade_no, String widtRtrade_no, String widtRrefund_amount, String widtRrefund_reason, String widtRout_request_no) throws AlipayApiException, UnsupportedEncodingException;

    ResultVo query(String widtQout_trade_no, String widtQtrade_no) throws AlipayApiException, UnsupportedEncodingException;
}