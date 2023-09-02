
import java.util.ArrayList;
import java.util.List;

public class StudentManager implements Manageable<Student> {
    private List<Student> studentList;

    public StudentManager() {
        // Initialize the studentList as an empty list
        studentList = new ArrayList<>();
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
        System.out.println("[+] Student added: " + student.getFirstName() + " " + student.getLastName());
    }

    @Override
    public void update(Student student) {
        // Assuming student information can be updated based on some criteria, implement the update logic here.
        // You might want to find the student in the list and update their information.
        // No Need to implement this method .!
    }

    @Override
    public void delete(Student student) {
        studentList.remove(student);
        System.out.println("[-] Student deleted: " + student.getFirstName() + " " + student.getLastName());
    }

    @Override
    public List<Student> list() {
        return studentList;
    }
}

class Student {
    private String studentID;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;

    public Student(String studentID, String firstName, String lastName, String dateOfBirth, String email) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Date of Birth: " + dateOfBirth + "\n" +
               "Email: " + email + "\n";
    }
}
