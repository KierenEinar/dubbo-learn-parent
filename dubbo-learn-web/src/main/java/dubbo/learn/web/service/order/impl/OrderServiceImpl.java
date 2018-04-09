package dubbo.learn.web.service.order.impl;

import dubbo.learn.api.modules.admin.AdminService;
import dubbo.learn.entity.Admin;
import dubbo.learn.web.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kieren on 18/4/3.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private dubbo.learn.api.modules.order.OrderService orderService;

    @Autowired
    private AdminService adminService;

    @Override
    public void createOrder(Long adminId, String alias) {
        adminService.updateOne(adminId, alias);
        orderService.createOrder();
    }
}
