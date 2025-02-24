package org.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrganizationData {
    private int employeeId;
    private int departmentId;
    private int positionId;
    private double salary;

    // Конструкторы
    public OrganizationData(int employeeId, int departmentId, int positionId, double salary) {
        this.employeeId = employeeId;
        this.departmentId = departmentId;
        this.positionId = positionId;
        this.salary = salary;
    }

    public OrganizationData() {
        this.employeeId = 0;
        this.departmentId = 0;
        this.positionId = 0;
        this.salary = 0;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "OrganizationData{employeeId=" + employeeId + ", departmentId=" + departmentId + ", positionId=" + positionId + ", salary=" + salary + "} \n";
    }
}