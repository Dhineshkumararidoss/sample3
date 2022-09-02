package com.sample2;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitClassB {
	@Test
	public void tc04() {
		
		System.out.println(" test case four");

	}
	@Ignore
    @Test
	public void tc05() {
		System.out.println("test case five ");

	}
    @Test
    
	public void tc06() {
		System.out.println("test case six");

	}
}
