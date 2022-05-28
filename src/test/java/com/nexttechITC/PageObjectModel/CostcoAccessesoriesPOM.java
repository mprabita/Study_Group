package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class CostcoAccessesoriesPOM {
	
      WebDriver driver; 
	

     public CostcoAccessesoriesPOM  (WebDriver driver){
	 this.driver = driver;
	PageFactory.initElements(driver, this);
	
  }
  
  
  
  @FindBy( xpath="//a[@id=\'navigation-dropdown\']") 
		  WebElement act_Shop;
		  public WebElement Shop() {
			return  act_Shop;
			
		  }
		 
		 
 @FindBy(xpath="//div[@id='level1-all-departments']//ul//li//a[text()='Computers']")  
		  WebElement click_Computers;
		public WebElement Computers() {
		return 	click_Computers;
		}	
		
		
		
		@FindBy(xpath="//div[@id='level2-all-departments']//ul//li//a[text()='Computer Accessories']") 
		WebElement click_Computer_Accessesories;
	    public WebElement Computer_Accessesories() {
	    return click_Computer_Accessesories;
	    
	    
	    }
		
			

			  
		  
}
	
			 
	 

	 
	 
	 
	 
	 
	 


