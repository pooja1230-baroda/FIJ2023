import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CollectionBean {
    @Autowired
    private List<String> nameList;

    public void printNameList(){
        System.out.println(nameList);
    }
}
