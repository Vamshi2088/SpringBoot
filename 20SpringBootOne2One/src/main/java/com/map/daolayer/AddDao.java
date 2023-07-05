package com.map.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.entity.Address;

public interface AddDao extends JpaRepository<Address, Integer> {

}
