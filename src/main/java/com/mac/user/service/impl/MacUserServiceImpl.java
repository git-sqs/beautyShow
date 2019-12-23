package com.mac.user.service.impl;

import com.mac.common.result.ResultCode;
import com.mac.common.vo.ResultVo;
import com.mac.config.RedisKeyConfig;
import com.mac.dto.MemberQueryDto;
import com.mac.user.dao.MacUserMapper;
import com.mac.user.entity.MacUser;
import com.mac.user.service.MacUserService;
import com.mac.utils.JedisUtil;
import com.mac.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class MacUserServiceImpl implements MacUserService {

    @Autowired
    private MacUserMapper macUserMapper;

    @Autowired
    private JedisUtil jedisUtil;

    @Override
    public ResultVo queryByMsg(String msg) {
        MacUser macUser = macUserMapper.selectByMsg(msg);

        if (macUser == null) {
            // 名称不存在 可用
            return ResultVo.Ok();
        } else {
            return ResultVo.fail("用户名已存在");
        }
    }

    @Override
    public ResultVo register(MacUser macUser) {
        // 1.校验是否存在
        if (queryByMsg(macUser.getUsername()).getCode() == ResultCode.OK.getVal()){
            // 2.不存在 再新增
            int c = macUserMapper.insert(macUser);
            if (c>0) {
                return ResultVo.Ok();
            } else {
                return ResultVo.fail();
            }
        } else {
            return ResultVo.fail("用户名已经被注册");
        }
    }

    @Override
    public ResultVo login(String name, String pass) {
        // 1.根据用户名查询用户信息
        MacUser m = macUserMapper.selectByMsg(name);
        // 2.校验用户是否存在
        if (m!=null) {
            // 3.校验密码是否正确
            if (m.getPassword().equals(pass)) {
                // 4.成功 生成令牌 存储为当前会员的id信息
                String token = JwtUtil.createJWT(m.getId() + "");
                // 5.令牌 Token 有效期 Redis有效期
                jedisUtil.addStr(RedisKeyConfig.TOKEN_KEY +name,token,RedisKeyConfig.TOEKN_TIME);
                return ResultVo.Ok(token);
            }
        }
        return ResultVo.fail("用户名或密码错误");
    }

    @Override
    public ResultVo search(MemberQueryDto memberQueryDto) {
        return null;
    }

    @Override
    public ResultVo all() {
        List<MacUser> userList =  macUserMapper.all();
        if (userList != null) {
            return ResultVo.Ok(userList);
        } else {
            return ResultVo.fail();
        }
    }
}
