package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
    private static int idCounter = 0;
    private final int id;
    private String name;


    public Department( String name) {
        this.id=++idCounter;
        this.name = name;
    }
    public Department() {
        this.id = ++idCounter;
        this.name = "None";
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }
    @Value("Default Department")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{id=" + id + ", name='" + name + "'} \n";
    }
}
