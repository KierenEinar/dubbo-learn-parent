package dubbo.learn.redis;

import dubbo.learn.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by kieren on 18/2/27.
 */
public class App {

    public static void main (String args[]) throws IOException{
        System.setProperty("spring.profiles.active","dev");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath*:/conf/application-context.xml");
        classPathXmlApplicationContext.start();
        System.out.println("redis repository start");
        System.in.read();
    }

}
