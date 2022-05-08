package com.jdc.onestop.students.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class StudentRegistrationId implements Serializable {

    private Integer studentId;
    private Integer classId;
}
