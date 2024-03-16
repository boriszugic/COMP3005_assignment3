package com.example.assignment3.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Repository interface for Student entity, extends CrudRepository for CRUD operations.
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}