package com.wust.sharding.service;

import com.wust.sharding.entity.OrderDetail;
import com.wust.sharding.mapper.OrderDetailMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class OrderDetailService {

    @Resource
    private OrderDetailMapper orderDetailMapper;

    public List<OrderDetail> getOrderDetails() {
        return orderDetailMapper.getOrderDetails();
    }

    public void insert(OrderDetail orderDetail) {
        orderDetailMapper.insert(orderDetail);
    }
}
