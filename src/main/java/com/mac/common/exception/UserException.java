package com.mac.common.exception;

/**
 * @Author: sqs
 * @Date: 2019/12/10 13:46
 * @Description: 用户自定义异常
 * @Version: 1.0
 */
public class UserException extends Exception {

    /**
     * 目的：为了以后报错时，能够及时的发现是什么错误
     */
    public UserException() {
        super();
    }

    public UserException(String msg){
        super(msg);
    }
}
