package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageObjectModel.FacebookSignupPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookSignup {
	WebDriver driver;
	
	@Given("user visiting facebook url")
	public void user_visiting_facebook_url()  throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.Facebook.com/r.php");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
			 
	}
	@When("user enter {string} and\"Bari\" and valid {string} and {string}")
	public void user_enter_and_bari_and_valid_and(String string, String string2, String string3,String string4 ) {
		
		FacebookSignupPOM obj=new FacebookSignupPOM(driver);
	    
		
		
		obj.Firstname().sendKeys(string);
		obj.Lastname().sendKeys(string2);
		obj.email().sendKeys(string3);
		obj.password().sendKeys(string4);
		string2=string3;
		
	}
		
		@Then("user select dropdown Month and dropdown Day and dropdown Year")
		public void user_select_dropdown_month_and_dropdown_day_and_dropdown_year(CharSequence string2) {
		   
		FacebookSignupPOM obj2=new FacebookSignupPOM (driver);
		
		Select dropdown =new Select(obj2.month());
		dropdown.selectByIndex(0);//jan
		
		
		Select dropdown1=new Select(obj2.day());
		dropdown1.selectByValue("2");//2
		
		Select dropdown2=new Select(obj2.year());
		dropdown2.selectByVisibleText("1987");
		
		
		obj2.femaleradio().click();
		obj2.submitbutton().click();
		
		
		obj2.reenteremail().sendKeys(string2);
		obj2.submitbutton().click();	
		
		
		}
		
	}



