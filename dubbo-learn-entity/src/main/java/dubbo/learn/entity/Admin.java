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
    private Long adminId;

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
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
