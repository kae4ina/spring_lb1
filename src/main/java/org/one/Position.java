package org.one;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Position {
    private static int idCounter = 0;
    private final int id;

    private String name;


    public Position(String name) {
        this.id = ++idCounter;
        this.name = name;
    }
    public Position(){
        this.id = ++idCounter;

    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Position{id=" + id + ", name='" + name + "'}";
    }
}
