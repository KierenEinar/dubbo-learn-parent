package dubbo.learn.entity;

import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component
public class User implements java.io.Serializable{

    private String name;

    private Integer age;

    private Long uid;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
