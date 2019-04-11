package com.wust.sharding.controller;

import com.wust.sharding.entity.OrderDetail;
import com.wust.sharding.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @GetMapping("/OrderDetails")
    public List<OrderDetail> getOrderDetails() {
        List<OrderDetail> users=orderDetailService.getOrderDetails();
        return users;
    }

    //测试
    @PostMapping(value="OrderDetail")
    public String updateTransactional(@RequestBody OrderDetail orderDetail) {

        //分库： OrderId % 2 = 0的数据存储到sharding_0 ，为1的数据存储到sharding_1
        //分表： GoodsId % 2 = 0的数据存储到 order_detail_0，为1的数据存储到order_detail_1

        orderDetailService.insert(orderDetail);

        return "success";
    }

}
