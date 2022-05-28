package com.nexttechITC.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestNGTestRunner {
	
	
	@CucumberOptions (
		      
		      features = {"Features"},
		      glue = {"com.nexttechITC.Stepdefs"}
		      
		      )

		 public class TestRunner extends AbstractTestNGCucumberTests{}
	

}
