package com.example.tut5_restfulapi.repository;

import com.example.tut5_restfulapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
