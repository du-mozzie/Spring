import com.du.pojo.MyConfig;
import com.du.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) context.getBean("user");
        user.show();
        System.out.println(user.toString());
    }
}