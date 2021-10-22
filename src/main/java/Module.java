
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author joepr
 */
public class Module {
    private String moduleName;
    private int moduleId;
    private ArrayList<Student> studentList;
    private ArrayList<Course> courseList;


    public Module(String moduleName, int moduleId){
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        studentList = new ArrayList<Student>();
        courseList = new ArrayList<Course>();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }
    public void addCourse(Course course){
        courseList.add(course);
    }

    public ArrayList<Course> getCourseList(){
        return courseList;
    }




}