package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String password;
    private short activated;
    private Date registerAt;
    private Date retireAt;


    public Account(){

    }

    public Account(String userName, String password, short activated, Date registerAt, Date retireAt) {
        this.userName = userName;
        this.password = password;
        this.activated = activated;
        this.registerAt = registerAt;
        this.retireAt = retireAt;
    }
}
