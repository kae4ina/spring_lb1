package org.one;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

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

         /*       Department department = new Department();
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
            System.out.println(myOrg);*/


            OrganizationService organizationService = context.getBean(OrganizationService.class);


            Department department1 = new Department("HR Department");
            organizationService.addDepartment(department1);

            Department department2 = new Department("IT Department");
            organizationService.addDepartment(department2);

            System.out.println("Департаменты:");
            organizationService.getADepartmentRepository().forEach(System.out::println);


            department1.setName("Human Resources");
            organizationService.updateDepartment(department1);


            organizationService.deleteDepartment(department2.getId());

            System.out.println("Департаменты после редактирования и удаления:");
            organizationService.getADepartmentRepository().forEach(System.out::println);


            Employee employee1 = new Employee("John Doe", "Male", LocalDate.of(1990, 5, 15));
            organizationService.addEmployee(employee1);

            Employee employee2 = new Employee("Jane Poe", "Female", LocalDate.of(1985, 3, 21));
            organizationService.addEmployee(employee2);

            System.out.println("Сотрудники:");
            organizationService.getAllEmployees().forEach(System.out::println);


            employee1.setFullName("John Smith");
            organizationService.updateEmployee(employee1);


            organizationService.deleteEmployee(employee2.getId());

            System.out.println("Сотрудники после редактирования и удаления:");
            organizationService.getAllEmployees().forEach(System.out::println);


            Position position1 = new Position("HR Manager");
            organizationService.addPosition(position1);

            Position position2 = new Position("Software Engineer");
            organizationService.addPosition(position2);

            System.out.println("\nДолжности:");
            organizationService.getAllPositions().forEach(System.out::println);


            position1.setName("Senior HR Manager");
            organizationService.updatePosition(position1);


            organizationService.deletePosition(position2.getId());

            System.out.println("\nДолжности после редактирования и удаления:");
            organizationService.getAllPositions().forEach(System.out::println);


            OrganizationData org1 = new OrganizationData(
                    employee1.getId(), department1.getId(), position1.getId(), 50000.0
            );
            organizationService.addOrganizationData(org1);

            OrganizationData org2 = new OrganizationData(
                    employee2.getId(), department2.getId(), position2.getId(), 90000.0
            );
            organizationService.addOrganizationData(org2);

            System.out.println("\nДанные организации:");
            organizationService.getAllOrganizationData().forEach(od -> {
                Employee emp = organizationService.getAllEmployees().stream()
                        .filter(e -> e.getId() == od.getEmployeeId())
                        .findFirst()
                        .orElse(null);

                Department dept = organizationService.getADepartmentRepository().stream()
                        .filter(d -> d.getId() == od.getDepartmentId())
                        .findFirst()
                        .orElse(null);

                Position pos = organizationService.getAllPositions().stream()
                        .filter(p -> p.getId() == od.getPositionId())
                        .findFirst()
                        .orElse(null);

                if (emp != null && dept != null && pos != null) {
                    System.out.println("Employee: " + emp.getFullName() +
                            ", Department: " + dept.getName() +
                            ", Position: " + pos.getName() +
                            ", Salary: " + od.getSalary());
                }
            });


            org1.setSalary(55000.0);
            organizationService.updateOrganizationData(org1);


            organizationService.deleteOrganizationData(org2.getEmployeeId());

            System.out.println("\nДанные организации после редактирования и удаления:");
            organizationService.getAllOrganizationData().forEach(od -> {
                Employee emp = organizationService.getAllEmployees().stream()
                        .filter(e -> e.getId() == od.getEmployeeId())
                        .findFirst()
                        .orElse(null);

                Department dept = organizationService.getADepartmentRepository().stream()
                        .filter(d -> d.getId() == od.getDepartmentId())
                        .findFirst()
                        .orElse(null);

                Position pos = organizationService.getAllPositions().stream()
                        .filter(p -> p.getId() == od.getPositionId())
                        .findFirst()
                        .orElse(null);

                if (emp != null && dept != null && pos != null) {
                    System.out.println("Employee: " + emp.getFullName() +
                            ", Department: " + dept.getName() +
                            ", Position: " + pos.getName() +
                            ", Salary: " + od.getSalary());
                }
            });
        }
}



