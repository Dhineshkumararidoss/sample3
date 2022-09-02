package com.sample2;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({JUnitClassA.class,JUnitClassB.class,JUnitClassC.class})

public class SuitClass {
	
	public static void main(String[] args) {
		Result run = JUnitCore.runClasses(JUnitClassA.class,JUnitClassB.class,JUnitClassC.class);
	     int ignoreCount = run.getIgnoreCount();
	     System.out.println(ignoreCount);
	     int runCount = run.getRunCount();
	     System.out.println(runCount);
	     int failureCount = run.getFailureCount();
	     System.out.println(failureCount);
	     List<Failure> failures = run.getFailures();
	     for (int i=0; i<failures.size(); i++) {
	    	 Failure failure = failures.get(i);
	    	 java.lang.String string = failure.toString();
	    	 System.out.println(string);
	     }
		
	}

}
