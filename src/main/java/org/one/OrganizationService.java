package org.one;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class OrganizationService {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final PositionRepository positionRepository;
    private final OrganizationDataRepository organizationDataRepository;
    private static final Logger logger = LoggerFactory.getLogger(OrganizationService.class);

    @Autowired
    public OrganizationService(DepartmentRepository departmentRepository,
                               EmployeeRepository employeeRepository,
                               PositionRepository positionRepository,
                               OrganizationDataRepository organizationDataRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.positionRepository = positionRepository;
        this.organizationDataRepository = organizationDataRepository;
    }


    public void addDepartment(Department department) {
        departmentRepository.save(department);
        logger.info("Department added: {}", department);
    }

    public void updateDepartment(Department department) {
        departmentRepository.update(department);
        logger.info("Department updated: {}", department);
    }

    public void deleteDepartment(int id) {
        departmentRepository.delete(id);
        logger.info("Department deleted with id: {}", id);
    }

    public List<Department> getADepartmentRepository() {
        return departmentRepository.findAll();
    }


    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
        logger.info("Employee added: {}", employee);
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.update(employee);
        logger.info("Employee updated: {}", employee);
    }

    public void deleteEmployee(int id) {
        employeeRepository.delete(id);
        logger.info("Employee deleted with id: {}", id);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    public void addPosition(Position position) {
        positionRepository.save(position);
        logger.info("Position added: {}", position);
    }

    public void updatePosition(Position position) {
        positionRepository.update(position);
        logger.info("Position updated: {}", position);
    }

    public void deletePosition(int id) {
        positionRepository.delete(id);
        logger.info("Position deleted with id: {}", id);
    }

    public List<Position> getAllPositions() {
        return positionRepository.findAll();
    }

    // Методы для OrganizationData
    public void addOrganizationData(OrganizationData organizationData) {
        organizationDataRepository.save(organizationData);
        logger.info("OrganizationData added: {}", organizationData);
    }

    public void updateOrganizationData(OrganizationData organizationData) {
        organizationDataRepository.update(organizationData);
        logger.info("OrganizationData updated: {}", organizationData);
    }

    public void deleteOrganizationData(int employeeId) {
        organizationDataRepository.delete(employeeId);
        logger.info("OrganizationData deleted for employeeId: {}", employeeId);
    }

    public List<OrganizationData> getAllOrganizationData() {
        return organizationDataRepository.findAll();
    }
}
