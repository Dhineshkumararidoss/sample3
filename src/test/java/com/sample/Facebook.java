package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		
		txtUserName.sendKeys("8754428121");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		
		txtpass.sendKeys("01051999");
		
		Thread.sleep(3000);
		
		WebElement btnClick = driver.findElement(By.xpath("//button[@type='submit']"));
		
		btnClick.click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
