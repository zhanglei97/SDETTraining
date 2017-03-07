package com.fannie.testcase;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase02Test {
	 private WebDriver driver;
	  private String baseUrl;


	  @Before
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\gitworks\\SDETTraining\\chromedriver.exe");
	    driver = new ChromeDriver();
//	    System.setProperty("webdriver.ie.driver", "C:\\gitworks\\SDETTraining\\IEDriverServer.exe");
//	    driver = new InternetExplorerDriver();

	    baseUrl = "http://www.google.com";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  
		@Test
		public void testGoogleSite() throws InterruptedException {
			driver.get(baseUrl);
		    System.out.println("title "+driver.getTitle());
		    String currentURL = driver.getCurrentUrl();
		    System.out.println("current URL: "+currentURL);
		    
		    WebElement e1 = driver.findElement(By.id("lst-ib"));
		    System.out.println(" lst-ib is enabled: "+e1.isEnabled());
		    
		    WebElement e2 = driver.findElement(By.id("gs_taif0"));
		    System.out.println("gs_taif0 is enabled: "+e2.isEnabled());
		    
		    WebElement e3 = driver.findElement(By.id("gs_htif0"));
		    System.out.println("gs_htif0 is enabled: "+e3.isEnabled());
		    
		    e1.sendKeys("best place to live in VA");
		    
		    Thread.sleep(2500);
		    e2.sendKeys("best place to live in MD");
		    
		    Thread.sleep(2500);
		    e3.sendKeys("best place to live in TX");
		    
		    }


	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	   
	  }


}
