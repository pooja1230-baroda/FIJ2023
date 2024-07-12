package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToOne
    private Passport passport;

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
