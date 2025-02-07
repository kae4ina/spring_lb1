package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    private final Employee employee;

    public void initEmployee() {
        Employee employee1 = new Employee();
        employee1.setFullName("Petrov Vladimir Vladimirovich");
        addEmployee(employee1);

        Employee employee2 = new Employee();
        employee2.setFullName("Petrova Anna Vladimirovna");
        addEmployee(employee2);
    }
    @Autowired
    public EmployeeService(Employee employee) {
        this.employee = employee;
    }





    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }



}
