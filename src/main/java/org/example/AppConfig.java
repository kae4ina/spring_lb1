package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

    /*  @Bean
    public DepartmentService departmentService(){
       return new DepartmentService();

   }
  @Bean
    public EmployeeService employee(){
        return new EmployeeService();

    }
    @Bean
    public PositionService position(){
        return new PositionService();

    }
    @Bean
    public OrganizationService organizationData(){
        return new OrganizationService();

    }*/
}
