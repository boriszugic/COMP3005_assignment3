package com.example.assignment3.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

// Entity class representing a student with various attributes.
@Entity
@Getter
@Setter
@ToString
@Table(name = "students") // Specifies the table name in the database.
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generated primary key.
    private Integer studentId;

    @Column(nullable = false) // Marks the column as not nullable.
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(unique = true, nullable = false) // Ensures email is unique and not nullable.
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