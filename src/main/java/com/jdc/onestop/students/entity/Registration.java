package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EmbeddedId
    private StudentRegistrationId studentRegistrationId;
    private Date registerDate;
    private String status;
    private int fees;
    private int discount;
    private short paid;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Class aClass;

    public Registration(){

    }

    public Registration(Date registerDate, String status, int fees, int discount, short paid) {
        this.registerDate = registerDate;
        this.status = status;
        this.fees = fees;
        this.discount = discount;
        this.paid = paid;
    }
}
