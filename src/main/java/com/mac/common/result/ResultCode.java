package com.mac.common.result;

/**
 * @Author: sqs
 * @Date: 2019/12/10 16:59
 * @Description: 用于自定义状态码的枚举类
 * @Version: 1.0
 * 首先枚举是一个特殊的class
 * 这个class相当于final static修饰，不能被继承
 * 他的构造方法强制被私有化，下面有一个默认的构造方法private ColorEnum();
 * 所有的枚举都继承自java.lang.Enum类。由于Java 不支持多继承，所以枚举对象不能再继承其他类
 */

public enum ResultCode {
    /**
     * OK ：后面的数据相当于直接把值赋值为OK、
     */
    OK(0),ERROR(400),NOTFOUNT(404);

    private int val;

    /**
     * 私有构造,防止被外部调用
     * @param v
     */
    private ResultCode(int v){ this.val=v;}


    public int getVal() {
        return val;
    }
}
