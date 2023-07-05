package com.unit.servicetest;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.unit.daolayer.PersonDao;
import com.unit.entity.Emply;
import com.unit.service.Serviceimpl;

@ExtendWith(SpringExtension.class)
public class EmployeServiceTest {

	@Mock
	private  PersonDao pd;

	@InjectMocks
	private  Serviceimpl sr;  
//	private  ;

//	@BeforeAll
	public  List<Emply> values() {
		List<Emply> l = new ArrayList<>();
		l.add(new Emply(1, "rama", 25000.00));
		l.add(new Emply(2, "seeta", 35000.00));
		l.add(new Emply(3, "laxmana", 75000.00));
		l.add(new Emply(5, "hunuma", 65000.00));
		l.add(new Emply(4, "sugreeva", 96000.00));
		return l;
	}
	@BeforeEach
	public  void init() {
		when(pd.findAll()).thenReturn(values());
	}
	@Test
	public void instaTest() {
		assertNotNull(sr);
	}
	@Test
	public void findAllTest() {
		List<Emply> all = sr.EgetAll();
		System.out.println(all);
	}

}
