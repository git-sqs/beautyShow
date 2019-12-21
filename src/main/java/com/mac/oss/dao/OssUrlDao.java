package com.mac.oss.dao;

import com.mac.oss.entity.OssUrl;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: sqs
 * @Date: 2019/12/12 19:46
 * @Description:
 * @Version: 1.0
 */

public interface OssUrlDao {

    @Insert("insert into oss_url(objname,url,ctime,endtime) values(#{objname},#{url},now(),#{endtime})")
    int insertOssUrl(OssUrl ossUrl);
    
    @Select("select id,objname,url,ctime,endtime from oss_url")
    @ResultType(OssUrl.class)
    List<OssUrl> selectOssUrlAll();
    
    @Delete("delete from oss_url where objname=#{objname}")
    int delOssUrl(String objname);
}
