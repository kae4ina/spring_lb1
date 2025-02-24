package org.one;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class PositionRepository implements IRepository <Position>{
    private final List<Position> positions = new ArrayList<>();
    private static final Logger logger = LoggerFactory.getLogger(DepartmentRepository.class);

    public void save(Position position) {
        positions.add(position);
    }

    public List<Position> findAll() {
        return new ArrayList<>(positions);
    }

    public Position findById(int id) {
        return positions.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public void update(Position position) {
        Position existingPosition= findById(position.getId());

        if (existingPosition != null) {
            existingPosition.setName(position.getName());
            logger.info("Department updated: {}", existingPosition);
        }
    }

    public void delete(int id) {
        Position position = findById(id);
        if (position != null) {
            positions.remove(position);
            logger.info("Department deleted: {}", position);
        }
    }
}
