package dubbo.learn.mongo;

import dubbo.learn.collection.Users;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kieren on 18/3/1.
 */
public interface MgUserRepository extends CrudRepository<Users, String> {

}
