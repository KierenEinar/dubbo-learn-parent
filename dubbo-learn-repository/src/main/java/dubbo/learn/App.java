package dubbo.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException{
        System.setProperty("spring.profiles.active","dev");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:conf/application-context.xml");
        context.start();
        System.out.println("dubbo-learn-repository started !");
        System.in.read();
    }
}
