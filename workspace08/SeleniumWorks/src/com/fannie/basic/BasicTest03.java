package com.fannie.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest03 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver;
		String baseUrl = "http://naveenks.com/selenium/RegForm.html";
		
		//"\" is the escape sequence, so put \\
		
		System.setProperty("webdriver.chrome.driver", "C:\\gitworks\\SDETTraining\\chromedriver.exe");
		
		
		// to test chrome driver
		driver = new ChromeDriver();
		

		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputEmail")).sendKeys("Lei Zhang");
		driver.findElement(By.id("firstName")).sendKeys("Lei");
		
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).clear();
		
		
		
	}
}
