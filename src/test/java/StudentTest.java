import org.joda.time.DateTime;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student = new Student("John",21,"30-01-2000",1534);
    Module md0 = new Module("EE123", 1023);
    DateTime cr0StartDate = new DateTime(2021,9,05,0,0);
    DateTime cr0EndDate = new DateTime(2022,5,10,0,0);
    Course cr0 = new Course("Electronic & Computer Engineering", cr0StartDate, cr0EndDate);


    //Testing some methods From the Student Class
    @Test
    public void getStudentName() {
        String result = student.getStudentName();
        assertTrue(result.equals("John"));
    }

    @Test
    public void getStudentAge() {
        int result = student.getStudentAge();
        assertTrue(result == 21);
    }

    @Test
    public void getUsername() {
        String result = student.getUsername();
        assertTrue(result.equals("John21"));
    }

    //testing some methods from the Module Class
    @Test
    public void getModuleName() {
        String result = md0.getModuleName();
        assertTrue(result =="EE123");
    }

    @Test
    public void getStudentList() {
        md0.addStudent(student);
        Student result = md0.getStudentList().get(0);
        assertTrue(result == student);
    }

    @Test
    public void getCourseList() {
        md0.addCourse(cr0);
        Course result = md0.getCourseList().get(0);
        assertTrue(result == cr0);
    }

    //testing some methods from the Course Class
    @Test
    public void getCourseName() {
        String result = cr0.getCourseName();
        assertTrue(result == "Electronic & Computer Engineering");
    }

    @Test
    public void addModule() {
        cr0.addModule(md0);
        Module result = cr0.getModuleList().get(0);
        assertTrue(result == md0);
    }

    @Test
    public void getModuleList() {
        cr0.addModule(md0);
        Module result = cr0.getModuleList().get(0);
        assertTrue(result == md0);
    }
}