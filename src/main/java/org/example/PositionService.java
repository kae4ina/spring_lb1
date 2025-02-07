package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PositionService {
    private List<Position> positions=new ArrayList<>();

    private final Position position;

    public void initPosition() {
        Position position1 = new Position();
        position1.setName("Recruter");
        addPosition(position1);

        Position position2 = new Position();
        position2.setName("Developer");
        addPosition(position2);
    }
    @Autowired
    public PositionService(Position position) {
        this.position = position;
    }



    public void addPosition(Position position){
        positions.add(position);
    }
    public List<Position> getAllPositions(){
        return positions;
    }
}
