package dubbo.learn.provider.service.user;

import dubbo.learn.api.modules.user.UserService;
import dubbo.learn.collection.Users;
import dubbo.learn.entity.User;
import dubbo.learn.mongo.MgUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private MgUserRepository mgUserRepository;

    public List<User> findAll() {
        User user1 = new User();
        user1.setName("kieren");
        user1.setAge(12);
        List<User> users = new ArrayList<User>();
        users.add(user1);
        return users;
    }

    public User findOne(Long uid) {
        User user1 = new User();
        user1.setName("kieren");
        user1.setUid(uid);
        user1.setAge(12);
        return user1;
    }

    @Override
    public Long count() {
        return mgUserRepository.count();
    }
}
