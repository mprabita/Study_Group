package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.AmazonBasicsPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonBasicsStepDefs {
	
	WebDriver driver;
	
	
	@Given("User have acces in Amazon Homepage")
	public void user_have_acces_in_amazon_home_page() {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	    
	}
	
	
	
	
	@When("user click on Amazon Basics  tab")
	public void user_click_on_amazon_basics_tab() {
		
		AmazonBasicsPOM AB =new AmazonBasicsPOM (driver);
		AB.AmazonBasics().click();
		
		
	    
	}

	@Then("user will be redirected to Amazon Basics  page")
	public void user_will_be_redirected_to_amazon_basics_page() {
	    
	}


}
