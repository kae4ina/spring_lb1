package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 /*  1
  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //для 1 и 2 заданий
        DepartmentService departmentService= context.getBean(DepartmentService.class);
        departmentService.addDepartment(new Department("HR"));
        departmentService.addDepartment(new Department("IT"));
        departmentService.addDepartment(new Department("Stuff"));

        System.out.println("Подразделения: " + departmentService.getAllDepartments());
        System.out.println("\n");

        EmployeeService employeeService=context.getBean(EmployeeService.class);
        employeeService.addEmployee(new Employee("Petrov Petr Petrovich","Male", LocalDate.of(1989,5,15)));
        employeeService.addEmployee(new Employee("Petrova Efrosinya Petrovna","Female", LocalDate.of(1999,7,3)));

        System.out.println("Сотрудники: " + employeeService.getAllEmployees());
        System.out.println("\n");

        PositionService positionService=context.getBean(PositionService.class);
        positionService.addPosition(new Position("HR specialist"));
        positionService.addPosition(new Position("Software developer"));
        System.out.println("Позиции: " + positionService.getAllPositions());
        System.out.println("\n");

        OrganizationService organizationService=context.getBean(OrganizationService.class);
        organizationService.addOrganizationData(new OrganizationData(1,1,1,300000));
        organizationService.addOrganizationData(new OrganizationData(2,2,2,500000));
        System.out.println("Организации: " + organizationService.getAllOrganizationData());
        System.out.println("\n");*/

        /* 2  ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем бин DepartmentService
        DepartmentService departmentService = context.getBean(DepartmentService.class);

        // Инициализируем департаменты
        departmentService.initDepartments();
        System.out.println("Департементы:"+departmentService.getAllDepartments());

        EmployeeService employeeService=context.getBean(EmployeeService.class);
        employeeService.initEmployee();
        System.out.println("Сотрудники:"+employeeService.getAllEmployees());


        PositionService positionService = context.getBean(PositionService.class);
        positionService.initPosition();
        System.out.println("Позиции:"+positionService.getAllPositions());

        OrganizationService organizationService=context.getBean(OrganizationService.class);
        organizationService.initOrganizationData();
        System.out.println("Организация:"+organizationService.getAllOrganizationData());

*/

        DepartmentService departmentService = context.getBean(DepartmentService.class);
        departmentService.initDepartments();
        EmployeeService employeeService=context.getBean(EmployeeService.class);
        employeeService.initEmployee();
        PositionService positionService = context.getBean(PositionService.class);
        positionService.initPosition();
        OrganizationService organizationService=context.getBean(OrganizationService.class);
        organizationService.initOrganizationData();

        Supplier <DepartmentService> departmentServiceSupplier = ()-> departmentService;
        context.registerBean("dep", DepartmentService.class,departmentServiceSupplier);
        DepartmentService dep=context.getBean(DepartmentService.class);

        System.out.println("Департаменты: "+ dep.getAllDepartments());

    }
}