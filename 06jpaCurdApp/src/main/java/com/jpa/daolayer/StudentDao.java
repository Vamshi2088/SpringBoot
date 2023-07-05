package com.jpa.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpa.entity.Person;

@Repository
public interface StudentDao extends JpaRepository<Person, Integer> {

	@Query("from Student where name=?1 and salary=?2")
	Person SgetbynameAndsalary(String name,double salary);
	

}
