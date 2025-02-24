package org.one;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class EmployeeRepository implements IRepository <Employee>{
    private final List<Employee> employees = new ArrayList<>();
    private static final Logger logger = LoggerFactory.getLogger(DepartmentRepository.class);

    public void save(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> findAll() {
        return new ArrayList<>(employees);
    }

    public Employee findById(int id) {
        return employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public void update(Employee employee) {
        Employee existingEmployee = findById(employee.getId());

        if (existingEmployee != null) {
            existingEmployee.setFullName(employee.getFullName());
            logger.info("Department updated: {}", existingEmployee);
        }
    }

    public void delete(int id) {
        Employee employee = findById(id);
        if (employee != null) {
            employees.remove(employee);
            logger.info("Department deleted: {}", employee);
        }
    }
}

