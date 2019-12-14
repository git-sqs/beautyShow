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
    ResultVo close(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException;

    ResultVo refund(HttpServletRequest request, HttpServletResponse response) throws AlipayApiException, UnsupportedEncodingException;

    ResultVo query(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException;

    ResultVo pay(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException;

    ResultVo fastPay(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException;

    ResultVo notify(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException;

    ResultVo returnurl(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, AlipayApiException;
}