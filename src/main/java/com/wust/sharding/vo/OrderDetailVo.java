package com.wust.sharding.vo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class OrderDetailVo {
    private Integer id;
    private Long orderId;
    private Long goodsId;
    private Integer amount;
    private Integer price;
}
