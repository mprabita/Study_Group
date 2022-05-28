package com.nexttechITC.Stepdefs;

//import java.awt.Desktop.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechITC.PageObjectModel.CostcoAccessesoriesPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CostcoAccessories {
	WebDriver driver;
	
	@Given("user have access in  costco Homepage")
	public void user_have_access_in_costco_homepage() {
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.costco.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	    
	}

	@When("use hovers over  Shop and hover over Computers")
	public void use_hovers_over_shop_and_hover_over_computers() throws Throwable {
		
		Actions act =new Actions(driver);
		CostcoAccessesoriesPOM com= new CostcoAccessesoriesPOM(driver);
		act.moveToElement(com.Shop()).build().perform();
		Thread.sleep(2000);
		
		
	   
	}

	@When("user clicks computer Accessories")
	public void user_clicks_computer_accessories() throws Throwable {
	CostcoAccessesoriesPOM com =new CostcoAccessesoriesPOM (driver);
	com.Computers().click();
	Thread.sleep(2000);
		
		
	   
	}

	@Then("user will be redirected successfully.")
	public void user_will_be_redirected_successfully() {
	   
	}


}
