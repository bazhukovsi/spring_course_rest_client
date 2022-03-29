package spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.rest.configuration.MyConfig;
import spring.rest.entity.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);
        System.out.println("-----------------------------");
        Employee employee = communication.getEmployee(2);
        System.out.println(employee);
        System.out.println("-----------------------------");
//        Employee employee1 = new Employee("Sveta", "Sokolova", "Sales", 1200);
//        communication.saveEmployee(employee1);
//        Employee employee1 = new Employee("Sveta", "Sokolova", "HR", 1300);
//        employee1.setId(11);
//        communication.saveEmployee(employee1);
//        System.out.println(employee1);
        communication.deleteEmployee(11);


    }
}
