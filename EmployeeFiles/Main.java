import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {
            EmployeeService employeeService = context.getBean(EmployeeService.class);
            employeeService.addEmployee("Sathya");
            employeeService.displayEmployee(101, "Sathya");
            employeeService.calculateSalary(25000.0);
        }
    }
}
