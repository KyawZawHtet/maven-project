package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ClassDays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String daysOfWeek;

    @ManyToOne
    private Class aClass;

    public ClassDays(){

    }

    public ClassDays(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }
}
