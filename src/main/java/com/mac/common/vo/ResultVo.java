package com.mac.common.vo;

import com.mac.common.result.ResultCode;
import lombok.Data;

/**
 * @Author: sqs
 * @Date: 2019/12/10 13:50
 * @Description: 后台传递给前台的数据格式
 * @Version: 1.0
 */
@Data
public class ResultVo {

    /**
     * 结果码
     */
    private int code;

    /**
     * 字符串
     */
    private String msg;

    /**
     * 携带数据
     */
    private Object data;

    /**
     *  定义set方法
     * @param code 结果码
     * @param msg 结果码说明
     * @param data 携带的数据
     * @return ResultVo 对象
     */
    public static ResultVo setResultVo(int code,String msg,Object data) {
        ResultVo r = new ResultVo();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    /**
     * 状态码为200的带数据的静态返回结果方法
     * @param data 从数据库查询的需要展示的数据
     * @return ResultVo对象
     */
    public static ResultVo Ok(Object data){
        return setResultVo(ResultCode.OK.getVal(),"OK",data);
    }

    /**
     * 状态码为200的无数据的静态返回结果方法
     * @return ResultVo对象
     */
    public static ResultVo Ok(){
        return setResultVo(ResultCode.OK.getVal(),"OK",null);
    }

    /**
     * 状态码为400的带数据的静态返回结果方法
     * @param data 从数据库查询的需要展示的数据
     * @return ResultVo对象
     */
    public static ResultVo fail(Object data){
        return setResultVo(ResultCode.ERROR.getVal(),"ERROR",data);
    }

    /**
     * 状态码为200的无数据的静态返回结果方法
     * @return ResultVo对象
     */
    public static ResultVo fail(){
        return setResultVo(ResultCode.ERROR.getVal(),"ERROR",null);
    }
}
