# Student Club Project

## Overview

This Java-based Tarmeez Club Management System includes various entity classes with specified data types to manage University data. It allows you to manage students, courses, teachers, assignments, exams, library books, attendance records, projects, employees, events, and inventory items.

## Entity Classes

1. **Student Class**: 
   `String studentID`, `String firstName`, `String lastName`, `String dateOfBirth`, `String email`
2. **Course Class**: 
   `String courseID`, `String name`, `String teacher`, `int credits`
3. **Teacher Class**: 
   `String teacherID`, `String firstName`, `String lastName`, `String email`
4. **Assignment Class**: 
   `String assignmentID`, `String title`, `String deadline`
5. **Exam Class**: 
   `String examID`, `String subject`, `String date`
6. **LibraryBook Class**: 
   `String ISBN`, `String title`, `String author`
7. **AttendanceRecord Class**: 
   `String recordID`, `String studentName`, `String date`, `String status`
8. **Project Class**: 
   `String projectID`, `String name`, `String description`
9. **Employee Class**: 
   `String employeeID`, `String firstName`, `String lastName`, `String department`
10. **Event Class**: 
   `String eventID`, `String name`, `String date`
11. **InventoryItem Class**: 
   `String itemID`, `String name`, `int quantity`
12. **CourseRegistration Class**:
   - `String registrationID`, `String studentID`, `String courseID`, `String registrationDate`
13. **AssignmentSubmission Class**:
   - `String submissionID`, `String assignmentID`, `String studentID`, `String submissionDate`
14. **ExamResult Class**:
   - `String resultID`, `String examID`, `String studentID`, `int score`
15. **LibraryMember Class**:
   - `String memberID`, `String studentID`, `String issueDate`, `String returnDate`
16. **AttendanceStatistics Class**:
   - `String statisticsID`, `String courseID`, `String date`, `int presentCount`, `int absentCount`
17. **ProjectTeam Class**:
   - `String teamID`, `String projectID`, `String studentIDs[]`
18. **EmployeeSalary Class**:
   - `String salaryID`, `String employeeID`, `double amount`, `String paymentDate`
19. **EventParticipant Class**:
   - `String participantID`, `String eventID`, `String participantName`, `String registrationDate`
20. **InventoryCategory Class**:
   - `String categoryID`, `String categoryName`
21. **InventoryItemLocation Class**:
   - `String locationID`, `String itemID`, `String locationName`, `int quantity`
22. **StudentClubMembership Class**:
   - `String membershipID`, `String studentID`, `String clubName`, `String joinDate`
23. **CourseSchedule Class**:
   - `String scheduleID`, `String courseID`, `String dayOfWeek`, `String time`
24. **TeacherAssignment Class**:
   - `String teacherAssignmentID`, `String teacherID`, `String assignmentID`, `String assignedDate`
25. **EmployeeLeave Class**:
   - `String leaveID`, `String employeeID`, `String startDate`, `String endDate`, `String leaveType`
26. **EventAttendance Class**:
   - `String eventAttendanceID`, `String eventID`, `String participantID`, `String attendanceDate`
27. **LibraryTransaction Class**:
   - `String transactionID`, `String studentID`, `String ISBN`, `String transactionDate`, `String transactionType`
28. **ProjectTask Class**:
   - `String taskID`, `String projectID`, `String taskName`, `String description`, `String deadline`
29. **CourseMaterial Class**:
   - `String materialID`, `String courseID`, `String materialName`, `String uploadDate`
30. **EmployeeTraining Class**:
   - `String trainingID`, `String employeeID`, `String trainingName`, `String trainingDate`

These are the inline instance variables for each of the additional entity classes. You can use these as a reference to implement the entity classes in your project.
## Manager Classes

Each manager class provides methods for `adding()`, `updating()`, `deleting()`, and `listing()` records of the respective entity type.

## Tester Class

The `Tester` class demonstrates the usage of entity and manager classes with sample data. You can customize it to test the functionality of your specific implementation.

## Getting Started

1. Clone this repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Customize the entity classes, manager classes, and tester class with your specific data and functionality.
4. Run the `Tester` class to test your project's functionality.

Good Luck.!
