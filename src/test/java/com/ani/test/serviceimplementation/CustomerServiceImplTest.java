package com.ani.test.serviceimplementation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ani.test.model.Customer;
import com.ani.test.model.Movie;

@SpringBootTest
class CustomerServiceImplTest {
	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@Test
	void testAddCustomer() {
		Movie objMovie = new Movie(150,"mahe","horror","4pm-6pm");
		Customer objStudent = new Customer(190,"ANI","65","23/10",objMovie);
		assertEquals("success",customerServiceImpl.addCustomer(objStudent) );
	}

}
