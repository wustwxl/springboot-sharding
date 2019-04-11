package com.wust.sharding.mapper;

import com.wust.sharding.entity.OrderDetail;

import java.util.List;

public interface OrderDetailMapper {

    List<OrderDetail> getOrderDetails();

    void insert(OrderDetail orderDetail);
}
