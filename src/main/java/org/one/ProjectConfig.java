package org.one;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan(basePackages = "org.one")
public class ProjectConfig {

    @Bean
    @Scope("singleton")
    public Department department() {
        return new Department();
    }

    @Bean
    @Scope("singleton")
    public Employee employee() {
        return new Employee();
    }

    @Bean
    @Scope("singleton")
    public Position position() {
        return new Position();
    }

    @Bean
    @Scope("singleton")
    public OrganizationData organizationData() {
        return new OrganizationData();
    }

    @Bean
    @Scope("singleton")
    public DepartmentRepository departmentRepository() {
        return new DepartmentRepository();
    }

    @Bean
    @Scope("singleton")
    public EmployeeRepository employeeRepository() {
        return new EmployeeRepository();
    }

    @Bean
    @Scope("singleton")
    public PositionRepository positionRepository() {
        return new PositionRepository();
    }

    @Bean
    @Scope("singleton")
    public OrganizationDataRepository organizationDataRepository() {
        return new OrganizationDataRepository();
    }

    @Bean
    @Scope("singleton")
    public OrganizationService organizationService(DepartmentRepository departmentRepository,
                                                   EmployeeRepository employeeRepository,
                                                   PositionRepository positionRepository,
                                                   OrganizationDataRepository organizationDataRepository) {
        return new OrganizationService(departmentRepository, employeeRepository, positionRepository, organizationDataRepository);
    }
















/*   @Bean
    public DepartmentRepository departmentRepository() {
        return new DepartmentRepository();
    }*/

   /* @Bean(name="HR")
    Department department(){
        var hrDepartment=new Department();
        hrDepartment.setName("HR");
        return hrDepartment;
    }

   // @Bean(name="IT")



    @Bean
    Employee employee(){
        var employee= new Employee();
        employee.setFullName("Ivanov Ivan Ivanovich");
        employee.setGender("Male");
        employee.setBirthYear(LocalDate.of(1990,2,7));
        return employee;
    }
    @Bean
    Position position(){
        var position=new Position();
        position.setName("Manager");
        return position;
    }
    @Bean
    OrganizationData organizationData(){
        var org=new OrganizationData(1,1,1,1);
        return org;

    }*/

}
