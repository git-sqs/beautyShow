package com.mac.user.service;

import com.mac.common.vo.ResultVo;
import com.mac.dto.MemberQueryDto;
import com.mac.user.entity.MacUser;

/**
 * @author Administrator
 */
public interface MacUserService {
    ResultVo queryByMsg(String msg);
    ResultVo register(MacUser macUser);
    ResultVo login(String name, String pass);
    ResultVo search(MemberQueryDto memberQueryDto);

    ResultVo all();
}
