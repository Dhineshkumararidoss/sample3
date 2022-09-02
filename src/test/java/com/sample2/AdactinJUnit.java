package com.sample2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AdactinJUnit {
	      
	  static  WebDriver driver;
	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://adactinhotelapp.com/"); 
		
	}
	@Test
	public void locators() {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Dhinesh1999");
		java.lang.String string = txtUserName.getAttribute("value");
		Assert.assertEquals("verify User Name", "Dhinesh1999", string);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("87VY28");
		java.lang.String string2 = txtPass.getAttribute("value");
		Assert.assertEquals("verify password", "87VY28", string2);
		WebElement btnClick = driver.findElement(By.id("login"));
		btnClick.click();
		java.lang.String title = driver.getTitle();
		boolean b = title.contains("Search Hotel");
		Assert.assertTrue("verifyTitle", b);
    }
	
	@Before
	public void printUserName() {
		System.out.println("Dhinesh1999");

	}
	@After
	public void passWord() {
		System.out.println("87VY28");

	}
	//@AfterClass
	//public static void quite() {
		//driver.quit();

	//}

}
