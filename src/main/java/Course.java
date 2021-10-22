

import org.joda.time.DateTime;
import java.util.ArrayList;

/**
 *
 * @author joepr
 */
public class Course {
    private String courseName;
    private ArrayList<Module> moduleList;
    private ArrayList<Student> studentList;
    private DateTime startDate;
    private DateTime endDate;


    public Course(String courseName,DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        studentList = new ArrayList<Student>();
        moduleList = new ArrayList<Module>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void addModule(Module module) {
        moduleList.add(module);
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }

    public ArrayList<Module> getModuleList(){
        return moduleList;
    }


}