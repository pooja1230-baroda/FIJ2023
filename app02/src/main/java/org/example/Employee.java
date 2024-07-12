package org.example;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "myGen")
    @SequenceGenerator(name = "myGen",sequenceName = "mySeq",initialValue = 5)
    private Integer id;

    @Column
    private String name;
    @Column
    private Float salary;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
