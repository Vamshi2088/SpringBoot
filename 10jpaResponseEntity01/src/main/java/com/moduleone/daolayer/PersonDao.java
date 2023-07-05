package com.moduleone.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.moduleone.entity.Emply;

@Repository
public interface  PersonDao extends JpaRepository<Emply, Integer>{

}
