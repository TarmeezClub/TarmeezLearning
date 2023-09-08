import java.util.ArrayList;
import java.util.List;

 class EmployeeManager implements Manageable<Employee> {
    private List<Employee> employeeList;

    public EmployeeManager() {
        // Initialize the employeeList as an empty list
        employeeList = new ArrayList<>();
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
        System.out.println("[+] Employee added: " + employee.getEmployeeID() + " " + employee.getFirstName() + " " + employee.getLastName());
    }

    @Override
    public void update(Employee employee) {
        // Assuming employee information can be updated based on some criteria, implement the update logic here.
        // You might want to find the employee in the list and update their information.
        // No need to implement this method in this example.
    }

    @Override
    public void delete(Employee employee) {
        employeeList.remove(employee);
        System.out.println("[-] Employee deleted: " + employee.getEmployeeID() + " " + employee.getFirstName() + " " + employee.getLastName());
    }

    @Override
    public List<Employee> list() {
        return employeeList;
    }
}


 class Employee {
    private String employeeID;
    private String firstName;
    private String lastName;
    private String department;

    public Employee(String employeeID, String firstName, String lastName, String department) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ID: " + employeeID + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Department: " + department + "\n";
    }
}





