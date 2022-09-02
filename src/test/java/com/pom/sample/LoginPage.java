package com.pom.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample2.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username")
	private WebElement txtUserName;
	@FindBy(id="password")
	private WebElement txtPassword;
	@FindBy(id="login")
	private WebElement btnClick;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnClick() {
		return btnClick;
	}

	public  void login(String username,String Password) {
		methodUsingSendKeys(getTxtUserName(), username);
		methodUsingSendKeys(getTxtPassword(), Password);
		methodUsingClick(getBtnClick());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
  
