import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Student st=context.getBean("student2",Student.class);
        st.getStudentDetails();
    }
}
