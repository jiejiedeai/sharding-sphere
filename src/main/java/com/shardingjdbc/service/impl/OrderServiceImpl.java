package com.shardingjdbc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shardingjdbc.mapper.OrderMapper;
import com.shardingjdbc.model.Order;
import com.shardingjdbc.service.OrderService;
import org.apache.commons.lang3.RandomUtils;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void testShard() {
        Order o = new Order();
        o.setId(RandomUtils.nextInt())
                .setOrderId(RandomUtils.nextInt());
        orderMapper.testShard(o);
    }
}
