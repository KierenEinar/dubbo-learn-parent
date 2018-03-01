package dubbo.learn.api.modules.user;

import dubbo.learn.api.modules.base.BaseService;
import dubbo.learn.collection.Users;
import dubbo.learn.entity.User;
import java.util.List;

/**
 * Hello world!
 *
 */
public interface UserService extends BaseService<Long, User> {
    Long count();
}
