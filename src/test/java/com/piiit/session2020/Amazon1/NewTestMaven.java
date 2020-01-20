package com.piiit.session2020.Amazon1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class NewTestMaven {
	
	public static WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  Home ui = new Home(driver);
	  ui.enterhomevalue();
	  Thread.sleep(2000);
	  ui.enterdownpayment();
	  Thread.sleep(2000);
	  ui.enterloanamount();
	  Thread.sleep(2000);
	  ui.interestrate();
	  Thread.sleep(2000);
	  ui.ratebutton();
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\anamb\\eclipse-workspace\\selenium_automation\\drivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.navigate().to("https://www.mortgagecalculator.org/");
  }

  
  
  
    @AfterClass
  public void afterClass() {
  }

}
