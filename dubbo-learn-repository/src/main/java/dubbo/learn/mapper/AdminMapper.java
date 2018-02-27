package dubbo.learn.mapper;

import dubbo.learn.entity.Admin;

/**
 * Created by kieren on 18/2/27.
 */
public interface AdminMapper {

    Admin findOne (Long id);

}
