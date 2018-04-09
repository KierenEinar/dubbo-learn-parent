package dubbo.learn.mapper;

import dubbo.learn.entity.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * Created by kieren on 18/2/27.
 */
public interface AdminMapper {

    Admin findOne (Long id);

    int updateOne(@Param("id") Long id, @Param("alias") String alias);

}
