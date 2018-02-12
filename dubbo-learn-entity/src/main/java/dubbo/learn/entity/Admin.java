package dubbo.learn.entity;

import javax.persistence.*;

/**
 * Created by kieren on 18/2/11.
 */
@Entity
@Table(name = "intbee_admins")
public class Admin implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "admin_id")
    private Long id;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column

    private String alias;

    @Column
    private String mobile;


}
