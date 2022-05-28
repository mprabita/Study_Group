package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.BestsellerPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BestsellerStepDefs {
	
	WebDriver driver;
	
	@Given("User have acces in amazon Home page")
	public void user_have_acces_in_amazon_home_page() {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	    
	}

	@When("user user click on best seller tab")
	public void user_user_click_on_best_seller_tab() {
		BestsellerPOM objbs = new BestsellerPOM(driver);
		objbs.Bestseller().click();
		
		
	     
	}

	@Then("user will be redirected to best seller page")
	public void user_will_be_redirected_to_best_seller_page() {
	    
	}

	
	
	

}
