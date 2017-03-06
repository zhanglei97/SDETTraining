package com.fannie.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest04 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver;
		String baseUrl = "https://demostore.x-cart.com/";
		
		//"\" is the escape sequence, so put \\
		
		System.setProperty("webdriver.chrome.driver", "C:\\gitworks\\SDETTraining\\chromedriver.exe");
		
		
		// to test chrome driver
		driver = new ChromeDriver();
		

		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.findElement(By.linkText("Shipping")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.partialLinkText("Contact")).click();
		
		driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("firstName")).clear();
		
		
		
	}
}