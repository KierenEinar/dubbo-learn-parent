package dubbo.learn.api.modules.base;

import java.util.List;

/**
 * Created by kieren on 18/2/12.
 */
public interface BaseService <ID extends java.io.Serializable, Entity>{
    List<Entity> findAll ();
    Entity findOne(ID id);
}
