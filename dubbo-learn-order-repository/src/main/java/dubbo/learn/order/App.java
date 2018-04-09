package dubbo.learn.order;

import dubbo.learn.order.mapper.OrderMapper;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by kieren on 18/4/2.
 */
public class App {
    public static void main (String args[]) throws IOException{
        System.setProperty("spring.profiles.active","dev");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:conf/application-context.xml");
        context.start();
        System.out.println("order     repository start!");
        System.in.read();
    }
}
