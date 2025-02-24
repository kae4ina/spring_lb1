package org.one;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class OrganizationDataRepository {
    private final List<OrganizationData> organizationDataList = new ArrayList<>();
    private static final Logger logger = LoggerFactory.getLogger(OrganizationDataRepository.class);

    // Сохранение данных
    public void save(OrganizationData organizationData) {
        organizationDataList.add(organizationData);
        logger.info("OrganizationData added: {}", organizationData);
    }


    public List<OrganizationData> findAll() {
        return new ArrayList<>(organizationDataList);
    }

    // Поиск по employeeId
    public OrganizationData findByEmployeeId(int employeeId) {
        return organizationDataList.stream()
                .filter(od -> od.getEmployeeId() == employeeId)
                .findFirst()
                .orElse(null);
    }


    public void update(OrganizationData organizationData) {
        OrganizationData existingData = findByEmployeeId(organizationData.getEmployeeId());
        if (existingData != null) {
            existingData.setDepartmentId(organizationData.getDepartmentId());
            existingData.setPositionId(organizationData.getPositionId());
            existingData.setSalary(organizationData.getSalary());
            logger.info("OrganizationData updated: {}", existingData);
        } else {
            logger.warn("OrganizationData with employeeId={} not found for update.", organizationData.getEmployeeId());
        }
    }


    public void delete(int employeeId) {
        OrganizationData organizationData = findByEmployeeId(employeeId);
        if (organizationData != null) {
            organizationDataList.remove(organizationData);
            logger.info("OrganizationData deleted: {}", organizationData);
        } else {
            logger.warn("OrganizationData with employeeId={} not found for deletion.", employeeId);
        }
    }
}