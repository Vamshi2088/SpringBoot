package com.rest.servicetest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.unit.daolayer.PersonDao;
import com.unit.pojo.Person;
import com.unit.service.Serviceimpl;
@SpringBootTest
public class PersonServiceTest {
	
	@Mock
	private PersonDao d;
	
	@InjectMocks
	private Serviceimpl sr;
	
	@Test
	public void instanceTest() {
		
		assertNotNull(d);
	}
	

	
}
