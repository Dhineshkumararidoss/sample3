package com.pom.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample2.BaseClass;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement txtLastName;
	@FindBy(id="address")
	private WebElement txtAddress;
	@FindBy(id="cc_num")
	private WebElement txtCcvNumber;
	@FindBy(id="cc_type")
	private WebElement DdnCardType;
	@FindBy(id="cc_exp_month")
	private WebElement DdnExpirymonth;
	@FindBy(id="cc_exp_year")
    private	WebElement DdnExpYear;
	@FindBy(id="cc_cvv")
	private WebElement ccvnumber;
	@FindBy(id="book_now")
	private WebElement BtnBookingClick;
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCcvNumber() {
		return txtCcvNumber;
	}
	public WebElement getDdnCardType() {
		return DdnCardType;
	}
	public WebElement getDdnExpirymonth() {
		return DdnExpirymonth;
	}
	public WebElement getDdnExpYear() {
		return DdnExpYear;
	}
	public WebElement getCcvnumber() {
		return ccvnumber;
	}
	public WebElement getBtnBookingClick() {
		return BtnBookingClick;
	}
	
	public void bookHotel(String firstName,String lastName,String address,String cardNo,int cardType,int month,int year,String ccvnumber ) {
		methodUsingSendKeys(getTxtFirstName(),firstName);
		methodUsingSendKeys(getTxtLastName(), lastName);
		methodUsingSendKeys(getTxtAddress(), address);
		methodUsingSendKeys(getTxtCcvNumber(), cardNo);
		usingIndex(getDdnCardType(), cardType);
		usingIndex(getDdnExpirymonth(),month);
		usingIndex(getDdnExpYear(),year);
	    methodUsingSendKeys(getCcvnumber(), ccvnumber);
		methodUsingClick(getBtnBookingClick());
		
		
		
		
		
		
	}

}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

