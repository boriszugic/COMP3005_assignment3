package com.example.assignment3.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

@org.springframework.stereotype.Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudentEmail(Long studentId, String newEmail) {
        Student student = studentRepository.findById(studentId).get();
        student.setEmail(newEmail);
        return studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
    @Bean
    public ApplicationRunner applicationRunner(StudentRepository studentRepository){
        return args -> {

        };
    }
}