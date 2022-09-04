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
	
	
	@Test(priority=5)
	private void m1() {
		System.out.println("print one ");

	}
	@Test(priority=4)
	private void m2() {
		System.out.println("print two");

	}
	@Test(priority=0)
	private void m5() {
		System.out.println("A");

	}
	@Test(priority=0)
	private void m4() {
		System.out.println("B");

	}
	@Test(priority=0)
	private void m3() {
		System.out.println("C");

	}
	@Test(priority=-1)
	private void m10() {
		System.out.println("one more task");

	}
	@Test(priority=-5)
	private void m6() {
		System.out.println("after test");

	}
	@Test
	private void m7() {
		System.out.println("print 7");

	}
	@Test(priority=6,invocationCount=5)
	private void m8() {
		System.out.println("print 8");

	}
	@Test(enabled=false)
	private void m9() {
		System.out.println(" after test 9");

	}


}
