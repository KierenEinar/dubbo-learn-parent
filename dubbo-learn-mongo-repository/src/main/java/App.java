import dubbo.learn.collection.Users;
import dubbo.learn.mongo.MgUserRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by kieren on 18/3/1.
 */
public class App {

    public static void main (String args[]) throws IOException {
        System.setProperty("spring.profiles.active","dev");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath*:/conf/application-context.xml");
        classPathXmlApplicationContext.start();
        MgUserRepository mgUserRepository = (MgUserRepository)classPathXmlApplicationContext.getBean("mgUserRepository");
        System.out.println("user count => "+ mgUserRepository.count());
        System.in.read();
    }

}
