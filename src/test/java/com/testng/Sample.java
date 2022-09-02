package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	
	
	@BeforeSuite
	private void m1() {
		System.out.println("print one ");

	}
	@BeforeTest
	private void m2() {
		System.out.println("print two");

	}
	@BeforeClass
	private void m3() {
		System.out.println("print three");

	}
	@BeforeMethod
	private void m4() {
		System.out.println("before test");

	}
	@Test
	private void m5() {
		System.out.println("print 5");

	}
	@Test
	private void m10() {
		System.out.println("one more task");

	}
	@AfterMethod
	private void m6() {
		System.out.println("after test");

	}
	@AfterClass
	private void m7() {
		System.out.println("print 7");

	}
	@AfterTest
	private void m8() {
		System.out.println("print 8");

	}
	@AfterSuite
	private void m9() {
		System.out.println(" after test 9");

	}


}
