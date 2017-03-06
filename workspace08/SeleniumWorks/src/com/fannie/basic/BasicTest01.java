package com.fannie.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicTest01 {
	public static void main(String[] args){
		WebDriver driver;
		String baseUrl = "http://google.com";
		
		//"\" is the escape sequence, so put \\
		
		//webdriver.chrome.driver variable is from selenium official site
		//https://sites.google.com/a/chromium.org/chromedriver/getting-started
		//System.setProperty("webdriver.chrome.driver", "C:\\gitworks\\SDETTraining\\chromedriver.exe");
		
		System.setProperty("webdriver.ie.driver", "C:\\gitworks\\SDETTraining\\IEDriverServer.exe");
		// to test chrome driver
		//type chro, hit ctl+space to see all selections
		//driver = new ChromeDriver();
		
		driver = new InternetExplorerDriver();
		driver.get(baseUrl);
		
		try{
			Thread.sleep(2000);
		}catch (InterruptedException e){
			e.printStackTrace();
			
		}
		
		driver.quit();
	}

}
