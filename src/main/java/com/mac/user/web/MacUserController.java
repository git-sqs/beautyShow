package com.mac.user.web;

import com.mac.common.vo.ResultVo;
import com.mac.user.entity.MacUser;
import com.mac.user.service.MacUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 */
@Api(value = "实现会员的相关操作", tags = "实现会员的相关操作")
@CrossOrigin
@RestController
public class MacUserController {
    @Autowired
    private MacUserService macUserService;

    @ApiOperation(value = "校验会员的注册名称是否重复", notes = "校验会员的注册名称是否重复")
    @GetMapping("/api/user/macUser/checkName.do")
    public ResultVo checkMsg(String msg) {
        return macUserService.queryByMsg(msg);
    }

    @ApiOperation(value = "实现会员的注册",notes = "实现会员的注册")
    @PostMapping("/api/user/macUser/register.do")
    public ResultVo register(@RequestBody MacUser macUser){
        return macUserService.register(macUser);
    }

    @ApiOperation(value = "实现会员的登录",notes = "实现会员的登录")
    @GetMapping("/api/user/macUser/login.do")
    public ResultVo login(String name,String password){
        return macUserService.login(name, password);
    }

    @ApiOperation(value = "用户列表",notes = "用户列表")
    @GetMapping("/api/user/macUser/all.do")
    public ResultVo all(){
        return macUserService.all();
    }
}
