package com.pom.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample2.BaseClass;

public class CancelBookingPage extends BaseClass{
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
 @FindBy(xpath="//a[text()='Booked Itinerary']")
 private WebElement btnClick;
 @FindBy(xpath="(//input[contains(@type,'checkbox')])[2]")
 private WebElement checkBox;
 @FindBy(xpath="//input[contains(@id,'btn')]")
 private WebElement btnCancel;
 
 
 


public WebElement getBtnClick() {
	return btnClick;
}





public WebElement getCheckBox() {
	return checkBox;
}





public WebElement getBtnCancel() {
	return btnCancel;
	
	
}



public void cancelBooking(){
	methodUsingClick(getBtnClick());
	methodUsingClick(getCheckBox());
	methodUsingClick(getBtnCancel());
	simpleAlert();
	
} 












 
}
