package org.one;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

//@Configuration
//@ComponentScan(basePackages = "org.one")
public class ProjectConfig {
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
