package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostcoDropdownPOM {
	WebDriver driver;
	
	
	public CostcoDropdownPOM (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
	
	@FindBy(id="search-field")
	WebElement edit_Searchbox;
	public WebElement edit_Searchbox() {
	return  edit_Searchbox;
	}
	
	@FindBy(xpath="//i[@automation-id='searchWidgetButton']")
	WebElement click_searchbutton;
	public WebElement click_searchbutton() {
		return  click_searchbutton;
	
	}
	
	@FindBy(id="sort_by")
	public WebElement click_sort;

	
	

}
