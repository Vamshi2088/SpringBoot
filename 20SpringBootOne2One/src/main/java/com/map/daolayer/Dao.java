package com.map.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.entity.Employe;

public interface Dao extends JpaRepository<Employe, Integer> {
	

}
