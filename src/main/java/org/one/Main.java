package org.one;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Main {

        public static void main(String[] args) {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      /*   Department department=context.getBean(Department.class);
         System.out.println(department);
;

         Employee employee=context.getBean(Employee.class);
            System.out.println(employee);

         Position position =context.getBean(Position.class);
            System.out.println(position);

         OrganizationData organizationData = context.getBean(OrganizationData.class);
            System.out.println(organizationData);

        }*/

                Department department = new Department();
                department.setName("BUX");
            Supplier <Department> departmentSupplier=()->department;
            context.registerBean("BUX",Department.class, departmentSupplier);

            Department myDepartment=context.getBean(Department.class);
            System.out.println(myDepartment);

            Employee employee = new Employee();
            employee.setFullName("Ivanova Anastasia Ivanovna");
            employee.setBirthYear(LocalDate.of(1879,6,5));
            employee.setGender("Female");
            Supplier <Employee> employeeSupplier=()->employee;
            context.registerBean("myemployee",Employee.class, employeeSupplier);

           Employee myEmployee=context.getBean(Employee.class);
            System.out.println(myEmployee);

            Position position = new Position();
            position.setName("Accounter");
            Supplier <Position> positionSupplier=()->position;
            context.registerBean("Accounter",Position.class, positionSupplier);

            Position myPosition=context.getBean(Position.class);
            System.out.println(myPosition);


            OrganizationData org = new OrganizationData();
            org.setDepartmentId(1);
            org.setEmployeeId(1);
            org.setPositionId(1);
            org.setSalary(178798);
            Supplier <OrganizationData> orgSupplier=()->org;
            context.registerBean("Org",OrganizationData.class, orgSupplier);

            OrganizationData myOrg=context.getBean(OrganizationData.class);
            System.out.println(myOrg);
        }
}

