package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageObjectModel.CostcoDropdownPOM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CostcoDropdownStepdef {
	
	
	WebDriver driver;
	
	@Given("user visit Costco Homepage")
	public void user_visit_costco_homepage() {
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.costco.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@When("user types {string} and clicks search button")
	public void user_types_and_clicks_search_button(String string) throws  Throwable {
		
		CostcoDropdownPOM CD= new CostcoDropdownPOM(driver);
		CD.edit_Searchbox().sendKeys(string);
		CD.click_searchbutton().click();
		Thread.sleep(3000);
	    
	}

	@When("user clicks sort by dropdown and select one of the sort option")
	public void user_clicks_sort_by_dropdown_and_select_one_of_the_sort_option() throws  Throwable{
		
		CostcoDropdownPOM CD1 = new CostcoDropdownPOM(driver);
		
		//Select dropdown= new Select(CD1.click_sort);
		Select dropdown = new Select(CD1.click_sort);
		dropdown.deselectByIndex(3);
		Thread.sleep(3000);
		
	    
	}

	@Then("user will be able to see the results sorted out successfully")
	public void user_will_be_able_to_see_the_results_sorted_out_successfully() {
	   
	}

	
	

}
