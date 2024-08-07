import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {
    @Bean
    public CollectionBean getCollectionBean(){
        return new CollectionBean();
    }
    @Bean
    public List<String> addStrings(){
        return Arrays.asList("John","Adam","Harry");
    }
}
