package com.mac.oss.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: sqs
 * @Date: 2019/12/12 19:46
 * @Description:
 * @Version: 1.0
 */
@Data
public class OssUrl {
    private int id;
    private String objname;
    private String url;
    private Date ctime;
    private Date endtime;

    public OssUrl() {
    }

    public OssUrl(String objname, String url, Date endtime) {
        this.objname = objname;
        this.url = url;
        this.endtime = endtime;
    }

}
