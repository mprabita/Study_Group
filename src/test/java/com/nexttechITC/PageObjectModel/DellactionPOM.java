package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellactionPOM {
	
	
	WebDriver driver;
	
	
	public DellactionPOM (WebDriver driver) {
		
		this.driver=driver;
	    PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath="//span[text()='Solutions']")
	WebElement hover_solutions_button;
	public WebElement hover_solutions_button() {
		return	 hover_solutions_button;
		
	}
	
	
	
	
	@FindBy(xpath="//a[text()='View All Solutions']")
	WebElement click_all_solutions;
	public WebElement click_all_solutions() {
		return click_all_solutions;
		
	}
	
	

}
