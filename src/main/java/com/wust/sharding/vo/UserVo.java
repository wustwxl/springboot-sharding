package com.wust.sharding.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class UserVo {

    private Integer userId;
    private String username;
    private String pwd;
    private String phone;
    private String email;
    private Integer age;
    private Integer sex;
}
