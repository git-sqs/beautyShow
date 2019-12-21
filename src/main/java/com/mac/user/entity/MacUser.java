package com.mac.user.entity;

import lombok.Data;

/**
 * @author weining
 * @date 2019/12/12 11:22
 */
@Data
public class MacUser {
    private Integer id;         // 用户ID
    private String username;    // 用户名
    private String password;    // 密码
    private Byte source;        // 状态
}
