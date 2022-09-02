package com.pom.sample;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample2.BaseClass;

public class BookingConfirmPage extends BaseClass {
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement attribute;

	
	
	public WebElement getAttribute() {
		return attribute;
	}



	public void orderId() throws IOException  {
	  String usingGetAttribute = usingGetAttribute(getAttribute());
	  System.out.println(usingGetAttribute);
	  createCell("adactin", 1, 21, usingGetAttribute);
	 
	
		
	}



	



	
	



	
	

}
