package com.wust.sharding.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class User {

    private Integer id;
    private Integer userId;
    private String username;
    private String pwd;
    private String phone;
    private String email;
    private Integer age;
    private Integer sex;
    private Integer status;
    private String accessToken;
    private String refreshToken;
    private Date createTime;
    private Date updateTime;
    private Integer version;
    private Integer deleted;
}
