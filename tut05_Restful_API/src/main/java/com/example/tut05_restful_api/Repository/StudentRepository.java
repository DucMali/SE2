package com.example.tut05_restful_api.Repository;

import com.example.tut05_restful_api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
