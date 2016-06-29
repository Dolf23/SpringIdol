import exceptions.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import performers.Performer;
import performers.PoeticJuggler;
import poems.Poem;
import poems.Sonnet29;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        try {
            System.out.println("Performance №1");
            Performer performer = (Performer) context.getBean("duke");
            performer.perform();
            System.out.println();

            System.out.println("Performance №2");
            Poem sonnet29 = new Sonnet29();
            Performer duke = new PoeticJuggler(15, sonnet29);
            duke.perform();
            System.out.println();

            System.out.println("Performance №3");
            performer = (Performer) context.getBean("kenny");
            performer.perform();
            System.out.println();

            System.out.println("Performance №4");
            performer = (Performer) context.getBean("kenny2");
            performer.perform();
            System.out.println();
        } catch (PerformanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
