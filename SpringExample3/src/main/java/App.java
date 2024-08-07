import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        CollectionBean cb=context.getBean(CollectionBean.class);
        cb.printNameList();
    }
}
