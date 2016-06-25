import exceptions.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import performers.Performer;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        try{
            Performer performer = (Performer) context.getBean("duke");
            performer.perform();
        } catch (PerformanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
