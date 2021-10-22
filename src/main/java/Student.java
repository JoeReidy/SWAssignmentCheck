import java.util.ArrayList;

/**
 *
 * @author joepr
 */
public class Student {
    private String studentName;
    private int studentAge;
    private String studentDOB;
    private int studentID;
    private ArrayList<Course> studentCourse = new ArrayList<Course>();
    private ArrayList<Module> studentModules = new ArrayList<Module>();

    public Student (String studentName, int studentAge, String studentDOB, int studentID){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentDOB = studentDOB;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getUsername(){
        String studentUsername = getStudentName() + getStudentAge();
        return studentUsername;
    }

    public void setStudentModule(Module mod){
        mod.addStudent(this);
        studentModules.add(mod);
    }

    public ArrayList<Module> getStudetModules(){
        return studentModules;
    }

    public void setStudentCourse(Course c){
        c.addStudent(this);
        studentCourse.add(c);
    }

    public ArrayList<Course> getStudentCourse(){
        return studentCourse;
    }

    @Override
    public String toString(){
        String str = "";
        str+= "\n Student Name " +getStudentName();
        str+= "\n Student Age " + getStudentAge();
        str+= "\n Student Username " + getUsername();
        str+= "\n Student DOB " + getStudentDOB();
        str+= "\n Student ID " + getStudentID();

        str += "\n Student Course(s) ";
        for (int i = 0; i < getStudentCourse().size();i++){
            str+= getStudentCourse().get(i).getCourseName();
        }
        for (int i = 0; i < getStudentCourse().size();i++){
            str+= "\n Student Module(s) " + getStudetModules().get(i).getModuleName();
        }

        return str;
    }


}