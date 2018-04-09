package dubbo.learn.web.service.order;

import dubbo.learn.entity.Admin;

/**
 * Created by kieren on 18/4/3.
 */
public interface OrderService {
    void createOrder (Long adminId, String alias);
}

