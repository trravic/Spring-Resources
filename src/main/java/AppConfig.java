import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        //SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
        //speakerService.setSpeakerRepository(getSpeakerRepository());
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
     */
}
