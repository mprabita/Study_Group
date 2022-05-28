package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostcoSignInPOM {
	
	WebDriver driver;
	
	 public CostcoSignInPOM (WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	 }
	 
		 
		@FindBy (id="header_sign_in") 
		WebElement click_Sign_In;
		public WebElement click_Sign_In() {
			return click_Sign_In;
		}
			
			
		@FindBy(id="signInName")
			WebElement  type_email;
		public WebElement email(){
			return type_email;
		}
		
		@FindBy (id="password")
		WebElement type_password;
		public WebElement Password(){
			return type_password;
			
			
				
			
		}


	}
