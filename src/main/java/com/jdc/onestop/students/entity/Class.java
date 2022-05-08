package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Getter
@Setter
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String classType;
    private String startDate;
    private String months;
    private Time timeFrom;
    private Time timeTo;

    @ManyToOne
    private Course course;

    @OneToOne
    private Employee employee;

    public Class(){

    }

    public Class(String classType, String startDate, String months, Time timeFrom, Time timeTo){
        this.classType = classType;
        this.startDate = startDate;
        this.months = months;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
    }
}
