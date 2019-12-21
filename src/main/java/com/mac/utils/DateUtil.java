package com.mac.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: sqs
 * @Date: 2019/12/12 19:35
 * @Description: 获取指定时间
 * @Version: 1.0
 */
public class DateUtil {

    public static Date addYear(int year) {
        //日历类 完成实例化
        Calendar calendar = Calendar.getInstance();
        //计算日期
        calendar.add(Calendar.YEAR, year);
        return calendar.getTime();
    }

    public static int creatDayTime() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        // Calendar.HOUR 如果当前时间超过中午12：00，则返回的结果是当前时间到第二天中午12：00的秒数；
        //如果当前时间不超过中午12：00，则返回的结果是到第二天凌晨的秒数 所以用HOUR_OF_DAY
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return (int)(cal.getTimeInMillis() - System.currentTimeMillis())/1000;
    }

}
