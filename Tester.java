public class Tester {
    public static void main(String[] args) {

        // --------- Create instances of entity classes ---------
        Student student1 = new Student("S1", "John", "Doe", "1995-01-15", "john@example.com");
        Student student2 = new Student("S2", "Alice", "Smith", "1998-05-20", "alice@example.com");

        Course course1 = new Course("C1", "Introduction to Programming", "Dr. Smith", 3);
        Course course2 = new Course("C2", "Database Management", "Prof. Johnson", 4);

        // Teacher teacher1 = new Teacher("T1", "Professor A", "profA@example.com");
        // Teacher teacher2 = new Teacher("T2", "Professor B", "profB@example.com");

        // Assignment assignment1 = new Assignment("A1", "Java Homework", "2023-09-15");
        // Assignment assignment2 = new Assignment("A2", "Database Project",
        // "2023-10-10");

        // Exam exam1 = new Exam("E1", "Midterm Exam", "2023-09-25");
        // Exam exam2 = new Exam("E2", "Final Exam", "2023-12-15");

        // LibraryBook book1 = new LibraryBook("B1", "Introduction to Java", "John
        // Smith");
        // LibraryBook book2 = new LibraryBook("B2", "Database Design", "Alice
        // Johnson");

        // AttendanceRecord attendance1 = new AttendanceRecord("AR1", "Student1",
        // "2023-09-01", "Present");
        // AttendanceRecord attendance2 = new AttendanceRecord("AR2", "Student2",
        // "2023-09-01", "Absent");

        Project project1 = new Project("P1", "Project A", "Description A");
        Project project2 = new Project("P2", "Project B", "Description B");

        Employee employee1 = new Employee("E1", "John", "Doe", "HR");
        Employee employee2 = new Employee("E2", "Alice", "Smith", "IT");

        // Event event1 = new Event("E1", "Conference", "2023-09-15");
        // Event event2 = new Event("E2", "Workshop", "2023-10-10");

        // InventoryItem item1 = new InventoryItem("I1", "Laptop", 5);
        // InventoryItem item2 = new InventoryItem("I2", "Projector", 3);

        // --------- Create instances of manager classes ---------
        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();
        // TeacherManager teacherManager = new TeacherManager();
        // AssignmentManager assignmentManager = new AssignmentManager();
        // ExamManager examManager = new ExamManager();
        // LibraryManager libraryManager = new LibraryManager();
        // AttendanceManager attendanceManager = new AttendanceManager();
       ProjectManager projectManager = new ProjectManager();
        EmployeeManager employeeManager = new EmployeeManager();
        // EventManager eventManager = new EventManager();
        // InventoryManager inventoryManager = new InventoryManager();

        // --------- Add entities using manager classes ---------
        studentManager.add(student1);
        studentManager.add(student2);

        courseManager.add(course1);
        courseManager.add(course2);

        // teacherManager.add(teacher1);
        // teacherManager.add(teacher2);

        // assignmentManager.add(assignment1);
        // assignmentManager.add(assignment2);

        // examManager.add(exam1);
        // examManager.add(exam2);

        // libraryManager.add(book1);
        // libraryManager.add(book2);

        // attendanceManager.add(attendance1);
        // attendanceManager.add(attendance2);

        projectManager.add(project1);
        projectManager.add(project2);

        employeeManager.add(employee1);
        employeeManager.add(employee2);

        // eventManager.add(event1);
        // eventManager.add(event2);

        // inventoryManager.add(item1);
        // inventoryManager.add(item2);

        // --------- List entities using manager classes ---------
        System.out.println("\nList of Students:");
        studentManager.list().forEach(System.out::println);

        System.out.println("\nList of Courses:");
        courseManager.list().forEach(System.out::println);

        // System.out.println("\nList of Teachers:");
        // teacherManager.list().forEach(System.out::println);

        // System.out.println("\nList of Assignments:");
        // assignmentManager.list().forEach(System.out::println);

        // System.out.println("\nList of Exams:");
        // examManager.list().forEach(System.out::println);

        // System.out.println("\nList of Library Books:");
        // libraryManager.list().forEach(System.out::println);
        
        // System.out.println("\nList of Attendance Records:");
        // attendanceManager.list().forEach(System.out::println);

        System.out.println("\nList of Projects:");
        projectManager.list().forEach(System.out::println);

        System.out.println("\nList of Employees:");
        employeeManager.list().forEach(System.out::println);

        // System.out.println("\nList of Events:");
        // eventManager.list().forEach(System.out::println);

        // System.out.println("\nList of Inventory Items:");
        // inventoryManager.list().forEach(System.out::println);
    }
}