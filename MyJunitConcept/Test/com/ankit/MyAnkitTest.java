package com.ankit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyAnkitTest {

	Ankit obj=new Ankit();
	
	
	
	@Test
	public void test1() {
int result=obj.sum(new int[] {1,2,3});
assertEquals(6,result);
System.out.println("test1");
	}
	
	//Test Case Going to be passed
	@Test
	public void test2() {
		int result=obj.sum(new int[] {2,3});
		
		assertEquals(5,result);
		System.out.println("test2");
	}
	
	//Test Case Going to be Failed
	@Test
	public void test3() {
		int result=obj.sum(new int[] {1,2,3,3});
		assertEquals(6,result);
		System.out.println("test3");
	}
	
	@AfterEach
	public void test5() {
		System.out.println("in AfterEach");	}


	@BeforeEach
	public void before() {
 System.out.println("in BeforeEach");
	}
}
