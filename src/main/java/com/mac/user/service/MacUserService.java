package com.mac.user.service;

import com.mac.common.vo.ResultVo;
import com.mac.dto.MemberQueryDto;
import com.mac.user.entity.MacUser;

public interface MacUserService {
    //查询
    ResultVo queryByMsg(String msg);
    //注册
    ResultVo register(MacUser macUser);
    //登录
    ResultVo login(String name, String pass);
    //后台管理系统 搜索接口 分页
    ResultVo search(MemberQueryDto memberQueryDto);
}
