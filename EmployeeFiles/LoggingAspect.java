import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* EmployeeService.*(..))")
    public void logBeforeServiceMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();

        switch (methodName) {
            case "addEmployee":
                System.out.println("Logging: Adding employee");
                break;
            case "displayEmployee":
                System.out.println("Logging: Displaying employee");
                break;
            case "calculateSalary":
                System.out.println("Logging: Calculating salary");
                break;
            default:
                System.out.println("Logging: Executing " + methodName);
        }
    }
}
