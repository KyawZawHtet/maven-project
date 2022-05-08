package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String phone;
    private String gmail;

    @ManyToOne
    private Account account;

    public Student(){

    }

    public Student(String name, String phone, String gmail) {
        this.name = name;
        this.phone = phone;
        this.gmail = gmail;
    }
}
