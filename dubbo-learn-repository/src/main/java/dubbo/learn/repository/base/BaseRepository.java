package dubbo.learn.repository.base;

import java.util.List;

/**
 * Created by kieren on 18/2/11.
 */
public interface BaseRepository <Entity, ID> extends java.io.Serializable  {
    Entity findOne(ID id);
    List<Entity> findAll ();
}
