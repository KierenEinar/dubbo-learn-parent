package dubbo.learn.web.controller.api;

import dubbo.learn.api.modules.admin.AdminService;
import dubbo.learn.api.modules.constant.Api;
import dubbo.learn.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kieren on 18/2/12.
 */
@RestController
@RequestMapping(Api.API_V1)
public class AdminApiController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admins/{id}")
    public Admin findOne (@PathVariable Long id) {
        return adminService.findOne(id);
    }
}
