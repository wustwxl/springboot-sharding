package com.wust.sharding.controller;

import com.wust.sharding.entity.User;
import com.wust.sharding.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //测试
    @PostMapping(value="User")
    public String updateTransactional(@RequestBody User user) {

        //分库： OrderId % 2 = 0的数据存储到sharding_0 ，为1的数据存储到sharding_1
        //分表： GoodsId % 2 = 0的数据存储到 order_detail_0，为1的数据存储到order_detail_1

        userService.insert(user);

        return "success";
    }

}
