package dubbo.learn.collection;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by kieren on 18/3/1.
 */
@Document(collection = "users")
public class Users implements java.io.Serializable{

    @Field
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
