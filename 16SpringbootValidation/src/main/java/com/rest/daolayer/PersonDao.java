package com.rest.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.pojo.Person;

public interface  PersonDao extends JpaRepository<Person, Integer>{

}
