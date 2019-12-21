package com.mac.user.dao;

import com.mac.user.entity.MacUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MacUserMapper {
    int insert(MacUser record);
    MacUser selectByMsg(String msg);
}
