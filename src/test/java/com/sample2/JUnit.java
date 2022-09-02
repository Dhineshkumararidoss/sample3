package com.sample2;

import org.checkerframework.checker.units.qual.m2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit {
	@BeforeClass
	public static void m1() {     //print first
		System.out.println("Start");
		
    }

	
	@Test
	public  void m2() {      // print 3 
		System.out.println("dhinesh");
		System.out.println("kumar");
		//Assert.assertTrue("not verify", false);
		System.out.println("yes");
	}
    
	@Test
	public  void m3() {     // print 6
		System.out.println("8754428121");
    }
	@Test
	public  void m9() {
	 System.out.println("print all no of test");

	}
	
	@Before
	public  void m4() {   // print 2 and 5
		System.out.println("printing ");

	} 
	@After
	public  void m5() {      // print 4 and 7
		System.out.println("printed");

	}
	@AfterClass
	public static void m6() {    // print 8
		System.out.println("End");

	}
	
	
	
	
	
	
	
	
}
