package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechITC.PageObjectModel.DellactionPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DellactionStepDef {
	WebDriver driver;
	
	
	@Given("user visits Dell homepage")
	public void user_visits_dell_homepage() {
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dell.com");
		driver.manage().window().maximize();

		
	    
	}

	@When("user go to solution dropdown menu and able to see view all solutions")
	public void user_go_to_solution_dropdown_menu_and_able_to_see_view_all_solutions() throws Throwable {
	   Actions mouse = new Actions (driver);
	   DellactionPOM dell= new DellactionPOM (driver);
	   mouse.moveToElement(dell.hover_solutions_button()).build().perform();
	   dell.click_all_solutions().click();
	   Thread.sleep(5000);
	
	}

	@Then("user redirected to solution portfolio succesfully.")
	public void user_redirected_to_solution_portfolio_succesfully() {
		
		
	    
	}

}
