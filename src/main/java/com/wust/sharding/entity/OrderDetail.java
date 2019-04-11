package com.wust.sharding.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class OrderDetail {
    private Integer id;
    private Long orderId;
    private Long goodsId;
    private Integer amount;
    private Integer price;
}
