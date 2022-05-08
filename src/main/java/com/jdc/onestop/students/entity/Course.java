package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    private String name;
    private int hours;
    private String level;
    private int onlineFees;
    private int offlineFees;

    public Course(){

    }

    public Course(String name, int hours, String level, int onlineFees, int offlineFees) {
        this.name = name;
        this.hours = hours;
        this.level = level;
        this.onlineFees = onlineFees;
        this.offlineFees = offlineFees;
    }
}
