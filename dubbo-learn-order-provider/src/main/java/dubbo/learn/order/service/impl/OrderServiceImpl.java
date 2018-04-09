package dubbo.learn.order.service.impl;

import dubbo.learn.api.modules.order.OrderService;
import dubbo.learn.entity.Admin;
import dubbo.learn.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by kieren on 18/4/2.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void createOrder() {
        orderMapper.insertOne();
    }
}
