import org.springframework.context.annotation.*;

@Configuration
public class ProjectConfig {
    @Bean
    @Lazy
    Person person(){
        Person p1=new Person();
        p1.setName("XXXX");
        return p1;

    }
}
