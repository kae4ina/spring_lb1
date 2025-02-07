package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class OrganizationData {
    private int employeeId;
    private int departmentId;
    private int positionId;
    private double salary;

    // Конструкторы, геттеры и сеттеры
    public OrganizationData(int employeeId, int departmentId, int positionId, double salary) {
        this.employeeId = employeeId;
        this.departmentId = departmentId;
        this.positionId = positionId;
        this.salary = salary;
    }
    public OrganizationData(){

    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Value("1")
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getDepartmentId() {
        return departmentId;
    }
    @Value("1")
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getPositionId() {
        return positionId;
    }
    @Value("1")
    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public double getSalary() {
        return salary;
    }
    @Value("1000")
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "OrganizationData{employeeId=" + employeeId + ", departmentId=" + departmentId + ", positionId=" + positionId + ", salary=" + salary + "} \n";
    }
}
