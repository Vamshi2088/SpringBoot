package com.moduletwo.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moduletwo.entity.Person;

@Repository
public interface  PersonDao extends JpaRepository<Person, Integer>{

}
