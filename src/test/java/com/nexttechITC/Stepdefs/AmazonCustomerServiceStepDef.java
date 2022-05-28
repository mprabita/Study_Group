package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.nexttechITC.PageObjectModel.AmazonCustomerServicePOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonCustomerServiceStepDef {
	WebDriver driver;
	
	@Given("user visits Amazon Home Page")
	public void user_visits_amazon_home_page() {
	   
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("User Clicks on Customer Service Tab")
	public void user_clicks_on_customer_service_tab() {
		AmazonCustomerServicePOM az_customer = new AmazonCustomerServicePOM(driver);

		az_customer.click_amz_customer_service().click();
	   
	}

	@Then("User will be redirected to Customer Service Page")
	public void user_will_be_redirected_to_customer_service_page() {
	    System.out.println(driver.getTitle());
	    
	    Assert.assertEquals(driver.getTitle(), "Help & Customer Service - Amazon Customer Service");
	}

}
