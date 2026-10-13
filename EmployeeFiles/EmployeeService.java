import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public void addEmployee(String employeeName) {
        System.out.println("Employee added: " + employeeName);
    }

    public void displayEmployee(int employeeId, String employeeName) {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }

    public void calculateSalary(double salary) {
        System.out.println("Employee Salary: " + salary);
    }
}
