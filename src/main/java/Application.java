import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //SpeakerService speakerService = new SpeakerServiceImpl();
        SpeakerService speakerService = applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(speakerService);
        System.out.println(speakerService.findAll().get(0).getFirstName());

        // There will be a single instance created per spring container (since we assigned the bean to singleton scope)
        // Directs to same pointer of the already created instance
        SpeakerService speakerService1 = applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(speakerService1);

    }
}
