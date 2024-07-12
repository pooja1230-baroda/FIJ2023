package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Passport {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String passportNumber;

    @OneToOne(mappedBy = "passport")
    private Person person;

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
