package com.dazhi.authdemo.modules.auth.dto;

import lombok.Data;

/**
 * 新增验证码传输类
 */
@Data
public class LoginDTO {

    private String username;
    private String password;
}
