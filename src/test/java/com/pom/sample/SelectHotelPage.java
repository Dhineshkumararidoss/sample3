package com.pom.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample2.BaseClass;

public class SelectHotelPage extends BaseClass {
	 public SelectHotelPage() {
	 PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement btnRadioClick;
	
	@FindBy(id="continue")
	private WebElement btnClick;

	public WebElement getBtnRadioClick() {
		return btnRadioClick;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
    
	public void hotelSelected() {
		methodUsingClick(getBtnRadioClick());
		methodUsingClick(getBtnClick());
	
		
	
	}

		


		
	}
	
   
   

