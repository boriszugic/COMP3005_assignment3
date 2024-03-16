package com.example.assignment3.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private Date enrollmentDate;

    public Student(){}
    public Student(String firstName, String lastName, String email, Date enrollmentDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.enrollmentDate = enrollmentDate;
    }
}