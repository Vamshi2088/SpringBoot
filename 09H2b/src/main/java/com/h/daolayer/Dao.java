package com.h.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.h.entity.Student;

@Repository
public interface Dao extends JpaRepository<Student, Integer> {

}
