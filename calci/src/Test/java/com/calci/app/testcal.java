package com.calci.app;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.calci.app.calci;

class testcal {

	@Test
	void testAdd() {
		double res=calci.add(10.0, 20.0);
		assertEquals(30,res);
		//assertEquals(30,calculator.add(20, 20));
		
	}
	@Test
	void testmul() {
		double res=calci.mul(3, 20);
		assertEquals(60,res);
	}
	@Test  
	void testdiv() {
		double res=calci.div(40.00, 20.00);
		assertEquals(2.00,res);
	}
	@Test
	void testsub() {
		double res=calci.sub(30, 20);
		assertEquals(10,res);
	}
	@Test
	void testrem() {
		int res=calci.rem(30, 20);
		assertEquals(10,res);
	}
	

}