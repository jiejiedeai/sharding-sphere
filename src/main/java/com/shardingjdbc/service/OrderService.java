package com.shardingjdbc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shardingjdbc.model.Order;

public interface OrderService extends IService<Order> {
    void testShard();

}
