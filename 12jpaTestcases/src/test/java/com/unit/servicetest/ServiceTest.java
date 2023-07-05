package com.unit.servicetest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.unit.entity.Emply;
import com.unit.service.Serviceimpl;

@SpringBootTest
public class ServiceTest {

	@Autowired
	public Serviceimpl si;

	@Test
	public void test1() {
		assertNotNull(si);
	}

	@Test
	public void saveTest() {
		Emply e=new Emply("beemudu", 55000.00);
		assertNull(e.getId());
		si.Esave(e);
		assertNotNull(e.getId());
	}
	
	@Test
	public void findAllTest() {
		List<Emply> all = si.EgetAll();
		assertThat(all, hasSize(13));
	}

	@Test
	public void getByidTest() {
		Emply e = si.getbyid3(4);
		assertEquals("laxmana", e.getName());
	}

	@Test
	public void deleteTest() {
		int i = 2;
		si.Edelete(i);
		// internally it uses hibernate get method and it provides
//		proxy object while getting the values from DB
//		instead of getting null you will get object not found exception
		// so it returns false
		assertNotNull(si.getbyid2(60));
	}
	
	@Test
	public void updateTest() {
		Emply e=new Emply(3, "prabhas", 85.00);
		si.Eupdate(e);
		Emply o = si.getbyid3(3);
		assertEquals("prabhas", o.getName());
	}
}
