package com.piiit.session2020.Amazon1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	public static WebDriver driver;
	
	@FindBy (id="homeval")
	WebElement homevalue;
	
	@FindBy (id="downpayment")
	WebElement downpayment;
	
	@FindBy (id = "loanamt")
	WebElement loanamount;
	
	@FindBy(id ="intrstsrate")
	WebElement rate;
	
	@FindBy (name = "ratebutton")
	WebElement buttom;
	
	public Home (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterhomevalue() {
		homevalue.sendKeys("8000000");
	}
	
	public void enterdownpayment() {
		downpayment.sendKeys("80000");
	}
	
	public void enterloanamount() {
		loanamount.sendKeys("30000");
	}
	
	public void interestrate() {
		rate.sendKeys("28.5");
	}
	
	public void ratebutton() {
		buttom.click();
	}
}
