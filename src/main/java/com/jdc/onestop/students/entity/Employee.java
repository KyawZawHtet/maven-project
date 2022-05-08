package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.Set;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String phone;
    private String email;

    @ManyToOne
    private Account account;


    public Employee(){

    }

    public Employee(String name, Role role, String phone, String email, Student student, Employee employee) {
        this.name = name;
        this.role = role;
        this.phone = phone;
        this.email = email;
    }
}
