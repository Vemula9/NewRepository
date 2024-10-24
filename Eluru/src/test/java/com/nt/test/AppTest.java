package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Arithmatic;

public class AppTest {

	@Test
	public void testWithPositives() {
		Arithmatic a=new Arithmatic();
		 int expected=40;
		 int  actual=a.sum(20, 20); 
		 assertEquals(expected, actual);
	}
}
