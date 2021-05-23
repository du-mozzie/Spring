import com.du.pojo.hello;
import com.du.pojo.springConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        /*//获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //现在的对象都在spring中管理了，需要使用对象从里面直接取出
        hello hello = (hello) context.getBean("hello");
        System.out.println(hello.toString());*/

        ApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);
        hello bean = context.getBean("getHello",hello.class);
        System.out.println(bean.getStr());

    }
}