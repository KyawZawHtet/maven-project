package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paidDate;
    private int toPaid;
    private int paidAmount;

    @ManyToOne
    private Registration registration;

    public Payments(){

    }

    public Payments(int toPaid, int paidAmount) {
        this.toPaid = toPaid;
        this.paidAmount = paidAmount;
    }
}
