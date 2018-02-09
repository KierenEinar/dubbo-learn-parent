package dubbo.learn.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kieren on 18/2/7.
 */
public class App {

    public static void main (String args[]) throws Exception {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext ("classpath*:conf/application-context.xml");
        classPathXmlApplicationContext.start();
        System.in.read();
    }

}
