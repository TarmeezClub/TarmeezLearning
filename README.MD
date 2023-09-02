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
