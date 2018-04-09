package dubbo.learn.api.modules.admin;

import dubbo.learn.api.modules.base.BaseService;
import dubbo.learn.entity.Admin;

/**
 * Created by kieren on 18/2/12.
 */
public interface AdminService extends BaseService<Long, Admin>{
    int updateOne (Long id, String alias);
}
