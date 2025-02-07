package org.example;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
public class Employee {

    private static int idCounter = 0;
    private final int id;
    private String fullName;
    private String gender;
    private LocalDate birthYear;


    public Employee( String fullName, String gender, LocalDate birthYear) {
        this.id = ++idCounter;
        this.fullName = fullName;
        this.gender = gender;
        this.birthYear = birthYear;
    }

    public Employee() {
        this.id = ++idCounter;
    }



    public int getId() {
        return id;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", fullName='" + fullName + "', gender='" + gender + "', birthYear=" + birthYear + "}\n";
    }
}
