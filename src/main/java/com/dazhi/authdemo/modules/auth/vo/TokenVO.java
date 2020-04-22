package com.dazhi.authdemo.modules.auth.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TokenVO {
    private String token;
    private LocalDateTime expireTime;
}
