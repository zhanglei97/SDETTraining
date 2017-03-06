package com.fannie.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest02 {
	public static void main(String[] args){
		WebDriver driver;
		String baseUrl = "http://google.com";
		
		//"\" is the escape sequence, so put \\
		
		//webdriver.chrome.driver variable is from selenium official site
		//https://sites.google.com/a/chromium.org/chromedriver/getting-started
		System.setProperty("webdriver.chrome.driver", "C:\\gitworks\\SDETTraining\\chromedriver.exe");
		
		
		// to test chrome driver
		//type chro, hit ctl+space to see all selections
		driver = new ChromeDriver();
		

		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("lst-ib")).sendKeys("best place to visit");
		driver.findElement(By.id("_fZl")).click();;
		
		try{
			Thread.sleep(2000);
		}catch (InterruptedException e){
			e.printStackTrace();			
		}
		
		driver.quit();
	}
}