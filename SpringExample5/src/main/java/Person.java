import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Person(){
        System.out.println("Person Object Created");
    }
    public void printName(){
        System.out.println(name);
    }
}
