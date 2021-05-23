import com.du.service.MyCRUD;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理的是一个接口
        MyCRUD impl = (MyCRUD) context.getBean("MyCRUDImpl");
        impl.insert();
    }
}