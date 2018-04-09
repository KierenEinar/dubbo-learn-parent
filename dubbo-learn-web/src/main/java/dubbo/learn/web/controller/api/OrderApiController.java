package dubbo.learn.web.controller.api;

import dubbo.learn.api.modules.constant.Api;
import dubbo.learn.web.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kieren on 18/4/3.
 */
@RestController
@RequestMapping(Api.API_V1)
public class OrderApiController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.GET, value = "/order/{admin_id}/{alias}")
    public void createOrder (@PathVariable Long admin_id, @PathVariable String alias) {
        orderService.createOrder(admin_id,alias);
    }

}
