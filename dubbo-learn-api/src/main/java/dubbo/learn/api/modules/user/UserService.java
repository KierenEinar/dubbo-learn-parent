package dubbo.learn.api.modules.user;

import dubbo.learn.entity.User;
import java.util.List;

/**
 * Hello world!
 *
 */
public interface UserService {
    List<User> findAll ();
    User findOne (Long uid);
}
