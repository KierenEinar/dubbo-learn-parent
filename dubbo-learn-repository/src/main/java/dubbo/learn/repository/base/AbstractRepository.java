package dubbo.learn.repository.base;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by kieren on 18/2/11.
 */
public abstract class AbstractRepository <Entity, ID> implements BaseRepository <Entity, ID> {

    @PersistenceContext
    private EntityManager entityManager;


    protected Class<Entity> getEntityClass () {
        ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
        return (Class<Entity>) type.getActualTypeArguments()[0];
    }


    @Override
    public Entity findOne(ID id) {
        Entity entity = entityManager.find(this.getEntityClass(), id);
        return entity;
    }

    @Override
    public List<Entity> findAll() {
        return null;
    }
}
