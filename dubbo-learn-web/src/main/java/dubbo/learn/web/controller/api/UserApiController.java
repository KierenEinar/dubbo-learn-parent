package dubbo.learn.web.controller.api;

import dubbo.learn.api.modules.constant.Api;
import dubbo.learn.api.modules.user.UserService;
import dubbo.learn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kieren on 18/2/9.
 */
@RestController
@RequestMapping(Api.API_V1)
public class UserApiController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{uid}")
    public User findOne (@PathVariable("uid") Long uid) {
        return userService.findOne(uid);
    }

}
