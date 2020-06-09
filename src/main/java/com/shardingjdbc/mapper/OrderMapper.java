package com.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shardingjdbc.model.Order;

public interface OrderMapper extends BaseMapper<Order> {
    boolean testShard();
}
