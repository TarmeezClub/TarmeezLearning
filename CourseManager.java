import java.util.ArrayList;
import java.util.List;

public class CourseManager implements Manageable<Course> {
    private List<Course> courseList;

    public CourseManager() {
        // Initialize the studentList as an empty list
        courseList = new ArrayList<>();
    }

    @Override
    public void add(Course course) {
        courseList.add(course);
        System.out.println("[+] Course added: " + course.getCourseID() + " " + course.getName());
    }

    @Override
    public void update(Course course) {
        // Assuming student information can be updated based on some criteria, implement the update logic here.
        // You might want to find the student in the list and update their information.
        // No Need to implement this method .!
    }

    @Override
    public void delete(Course course) {
        courseList.remove(course);
        System.out.println("[-] Student deleted: " + course.getCourseID() + " " + course.getName());
    }

    @Override
    public List<Course> list() {
        return courseList;
    }
}

class Course {

    private String courseID;
    private String name;
    private String teacher;
    private int credits;
    
    public Course(String courseID, String name, String teacher, int credits) {
        this.courseID = courseID;
        this.name = name;
        this.teacher = teacher;
        this.credits = credits;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "ID: " + courseID + "\n" +
               "Name: " + name + "\n";
    }
}