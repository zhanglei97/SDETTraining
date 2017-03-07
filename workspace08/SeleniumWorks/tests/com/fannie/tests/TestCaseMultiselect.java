package com.fannie.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseMultiselect {
	 private WebDriver driver;
	  private String baseUrl;
	  private String baseURLMulti;


	  @Before
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\gitworks\\SDETTraining\\chromedriver.exe");
	    driver = new ChromeDriver();
	    baseUrl = "https://www.expedia.com/";
	    baseURLMulti = "http://html.com/attributes/select-multiple/";
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  
		@Ignore
		public void singleSelect() throws InterruptedException {
			driver.get(baseUrl);
		    System.out.println("title "+driver.getTitle());
		    String currentURL = driver.getCurrentUrl();
		    System.out.println("current URL: "+currentURL);
		    
		    WebElement element1 = driver.findElement(By.id("package-rooms-hp-package"));
		    Select select1 = new Select(element1);


		    List<WebElement> options = select1.getOptions();
		    
		    System.out.println("number of option for element 1-> "+options.size());
		    
		    for (int i=0;i<options.size(); i++){
		    	System.out.println(select1.getOptions().get(i).getText());
		    }
		    
		    select1.selectByValue("2");
		    Thread.sleep(2500);
		    select1.selectByIndex(2);
		    
	
		    Thread.sleep(2500);
		    
		    
		    }
		@Test
		public void multileSelect() throws InterruptedException {
			driver.get(baseURLMulti);
		    System.out.println("title "+driver.getTitle());
		    String currentURL = driver.getCurrentUrl();
		    System.out.println("current URL: "+currentURL);
		    
		    
		    // xpath: //*[@id="wrapper"]/article/section/div[2]/select
		    // for xpath, no difference in " or ', so for syntax change " to ' 
		    WebElement element1 = driver.findElement(By.xpath("//*[@id='wrapper']/article/section/div[2]/select"));
		    Select select1 = new Select(element1);


		    List<WebElement> options = select1.getOptions();
		    
		    System.out.println("number of option: "+options.size());
		    	    
		    Thread.sleep(2500);
		    select1.selectByValue("American");
		    select1.selectByIndex(2);		    
		    select1.selectByIndex(4);
		    select1.selectByValue("Lesser");
		    select1.deselectByValue("American");
		    
		    for (int i=0;i<options.size(); i++){
		    	System.out.println(select1.getOptions().get(i).getText()+" is "+ select1.getOptions().get(i).isSelected());
		    }
		    Thread.sleep(2500);
		    
		    
		    }
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	   
	  }
}
