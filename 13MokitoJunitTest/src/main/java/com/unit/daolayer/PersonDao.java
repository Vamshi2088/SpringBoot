package com.unit.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unit.pojo.Person;

@Repository
public interface  PersonDao extends JpaRepository<Person, Integer>{

}
