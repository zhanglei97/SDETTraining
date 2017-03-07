package com.fannie.testcase;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase01 {
	  private WebDriver driver;
	  private String baseUrl;


	  @Before
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\gitworks\\SDETTraining\\chromedriver.exe");
	    driver = new ChromeDriver();
	    baseUrl = "http://www.google.com";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void navigateTest() throws Exception {
	    driver.get(baseUrl);
	    System.out.println("title "+driver.getTitle());
	    String currentURL = driver.getCurrentUrl();
	    System.out.println("current URL: "+currentURL);
	    
	    driver.navigate().to("http://naveenks.com/selenium/RegForm.html");
	    Thread.sleep(2500);
	    
	    driver.navigate().back();
	    currentURL = driver.getCurrentUrl();
	    System.out.println("current URL: "+currentURL);
	    
	    Thread.sleep(2500);
	    driver.navigate().refresh();
	    
	    System.out.println("page "+driver.getCurrentUrl()+" refreshed.");
	    
	    driver.navigate().forward();
	    
	    System.out.println("after forward "+driver.getCurrentUrl()+" is here.");
	    
	    System.out.println("pagesource: "+driver.getPageSource());
	    
//	    driver.findElement(By.id("lst-ib")).clear();
//	    driver.findElement(By.id("lst-ib")).sendKeys("the best place to visit in USA");
//	    driver.findElement(By.id("_fZl")).click();
//	    driver.findElement(By.xpath("//g-scrolling-carousel[@id='uid_WL24uQAAO3MKJuVFjg4Fqw_0']/div/div/div[2]/div/div[3]/a/div[2]/div/div/div")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	   
	  }
}
