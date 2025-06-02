package com.enesbayram.spring_data_jpa.repository;

import com.enesbayram.spring_data_jpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
