package dubbo.learn.order;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by kieren on 18/4/2.
 */
public class App {

    public static void main (String args[]) throws IOException{
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext ("classpath*:conf/application-context.xml");
        classPathXmlApplicationContext.start();
        System.out.println("order provider start !!!");
        System.in.read();
    }


}
