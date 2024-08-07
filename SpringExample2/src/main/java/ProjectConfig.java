import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

    @Bean
    Student student1(){
        Student  st=new Student();
        st.setSname("Ella");
        return st;
    }
    @Bean
    Student student2(){
        Student  st=new Student();
        st.setSname("Stella");
        return st;
    }
    @Bean
    Course c1(){
        Course coreJava=new Course();
        coreJava.setCid("C-111");
        coreJava.setCname("Core Java");
        coreJava.setFees(4000);
        return coreJava;
    }
    @Bean
    Course c2(){
        Course advJava=new Course();
        advJava.setCid("C-112");
        advJava.setCname("Advanced Java");
        advJava.setFees(5000);
        return advJava;
    }

}
