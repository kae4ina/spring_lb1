package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class DepartmentService {
    private final List<Department> departments = new ArrayList<>();


    private final Department department;

    public void initDepartments() {
        Department hrDepartment = new Department();
        hrDepartment.setName("HR");
        addDepartment(hrDepartment);

        Department itDepartment = new Department();
        itDepartment.setName("IT");
        addDepartment(itDepartment);
    }


    @Autowired
    public DepartmentService(Department department) {
        this.department = department;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getAllDepartments() {
        return departments;
    }



}
