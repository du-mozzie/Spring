import com.du.config.springConfig;
import com.du.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl bean = (UserServiceImpl) context.getBean("serviceImpl");
        bean.getUser();*/

        ApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);
        UserServiceImpl getUser = (UserServiceImpl) context.getBean("UserServiceImpl");
        getUser.getUser();
    }

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);
        UserServiceImpl userService = (UserServiceImpl) context.getBean("UserServiceImpl");
        userService.getUser();
    }
}