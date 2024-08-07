import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String sname;

    @Autowired
    @Qualifier("c2")
    private Course course;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void getStudentDetails(){
        System.out.println("Student Name:-"+sname);
        System.out.println("Course Name:-"+course.getCname());
        System.out.println("Course ID:-"+course.getCid());
        System.out.println("Course Fees:-"+course.getFees());

    }
}
