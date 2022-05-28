package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.CostcoSignInPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CostcoSignInStepDef {
	
	WebDriver driver;
	
	@Given("user visit Costco homepage")
	public void user_visit_costco_homepage()  throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.costco.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    
	}

	@When("user click on Sign In option")
	public void user_click_on_sign_in_option()  throws Throwable{
		
		CostcoSignInPOM obj = new CostcoSignInPOM(driver);
		obj.click_Sign_In().click();
	    
	}

	@When("user type invalid {string}, invalid {string}")
	public void user_type_valid_valid(String string , String arg2) {
		
		CostcoSignInPOM obj= new CostcoSignInPOM (driver);
		obj.email().sendKeys("mona@gmail.com"); 
		obj.Password().sendKeys("xyz123");
	    	
	}


	@Then("user will  be able to Sign In succesfully.")
	public void user_will_be_able_to_sign_in_succesfully() {
	    
	}




}
