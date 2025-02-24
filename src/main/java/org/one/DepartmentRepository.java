package org.one;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Repository
public class DepartmentRepository implements IRepository <Department>  {
    private final List<Department> departments = new ArrayList<>();
    private static final Logger logger = LoggerFactory.getLogger(DepartmentRepository.class);

    public void save(Department department) {
        departments.add(department);
    }

    public List<Department> findAll() {
        return new ArrayList<>(departments);
    }

    public Department findById(int id) {
        return departments.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void update(Department department) {
        Department existingDepartment = findById(department.getId());
        if (existingDepartment != null) {
            existingDepartment.setName(department.getName());
            logger.info("Department updated: {}", existingDepartment);
        }
    }

    public void delete(int id) {
        Department department = findById(id);
        if (department != null) {
            departments.remove(department);
            logger.info("Department deleted: {}", department);
        }
    }
}
