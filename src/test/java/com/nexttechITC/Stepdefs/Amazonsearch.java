package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.Amazonsearchpom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Amazonsearch {
	WebDriver driver;
	
	@Given("user visit amazon homepage")
	public void user_visit_amazon_home_page() {
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
	}
	
	@Given("user search by {string}")
	
	public void user_search_by(String string) {
		Amazonsearchpom obj = new Amazonsearchpom (driver);
		obj.Search().sendKeys("iphone 12 pro max");
		
		

		
		 
	    
	}
	@Then("user click on search button")
	public void user_click_on_search_button() {
	    
		Amazonsearchpom obj = new Amazonsearchpom (driver);
		obj.searchbutton().click();
		
		
		
	}

}
