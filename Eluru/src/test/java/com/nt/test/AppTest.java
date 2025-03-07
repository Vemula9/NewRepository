package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Arithmatic;

public class AppTest {

	@Test
	public void testWithPositives() {
		Arithmatic a=new Arithmatic();

		 int expected=80;
		 int  actual=a.sum(40, 40); 
 assertEquals(expected, actual);
	}
	@Test
	public void testWithNegaives() {
		Arithmatic a=new Arithmatic();
		 int expected=-40;
		 int  actual=a.sum(-20, -20); 
		 assertEquals(expected, actual);
	}
	@Test
	public void testWithZeros() {
		Arithmatic a=new Arithmatic();
		 int expected=0;
		 int  actual=a.sum(0, 0); 
		 assertEquals(expected, actual);
	}
}
