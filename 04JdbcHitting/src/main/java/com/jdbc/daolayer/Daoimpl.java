package com.jdbc.daolayer;

import java.io.IOException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.model.Employe;

@Repository
public class Daoimpl implements Dao {

	@Autowired
	private JdbcTemplate jt;

	@Override
	public List<Employe> getAll() {
		String getAll = "SELECT * FROM employee";

		return jt.query(getAll, new BeanPropertyRowMapper<Employe>(Employe.class));
	
	}

	@Override
	public int save(Employe e) {
		String insert = "insert into employee values(?,?,?)";

		return jt.update(insert, new Object[] { e.getId(), e.getName(), e.getSalary() });
	}

	@Override
	public int delete(int id) {
		String delete = "delete from employee where id=?";
		return jt.update(delete, new Object[] { id });
	}

//	@Override
//	public Employe getbyid(int id) {
//		String getbyid="select * from employee where id=?";
//		Employe object = jt.queryForObject(getbyid, 
//				new BeanPropertyRowMapper<Employe>(Employe.class),
//				new Object[] {id});
//		
//		return object;
//	}
	
	public List<Employe> getbyid(int id) {
		String getbyid="select * from employee where id=?";
		
	  List<Employe> list = jt.query(getbyid, 
				new BeanPropertyRowMapper<Employe>(Employe.class),
				new Object[] {id});

		return list;
	}

	@Override
	public int updatebyid(Employe e) {
		String update="update employee set name=?,salary=? where id=?";
		int i = jt.update(update,new Object[] {e.getName(),e.getSalary(),e.getId()});
		return i;
	}
	
	@Override
	public List<Employe> getbyid() {
		
		
		return null;
	}

	

}
