package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCustomerServicePOM {
	WebDriver driver;
	
	public AmazonCustomerServicePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath="//a[text()='Customer Service']")
	WebElement amazon_customer_Service;
	public WebElement click_amz_customer_service() {
		return amazon_customer_Service;
	}
}
