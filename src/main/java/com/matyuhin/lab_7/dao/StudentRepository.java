package com.matyuhin.lab_7.dao;

import com.matyuhin.lab_7.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
