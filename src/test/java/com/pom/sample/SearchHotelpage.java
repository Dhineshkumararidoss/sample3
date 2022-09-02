package com.pom.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample2.BaseClass;

public class SearchHotelpage extends BaseClass {
	     public SearchHotelpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement DdnLocation;
	@FindBy(id="hotels")
	private WebElement DdnHotel;
	@FindBy(id="room_type")
	private WebElement DdnRoomType;
	@FindBy(id="room_nos")
	private WebElement DdnRoomNos;
	@FindBy(id="datepick_in")
	private WebElement DdnCheckInDate;
	@FindBy(id="datepick_out")
	private WebElement DdnCheckOutDate;
	@FindBy(id="adult_room")
	private WebElement DdnAdultsRoom;
	@FindBy(id="child_room")
	private WebElement DdnChildRoom;
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	public WebElement getDdnLocation() {
		return DdnLocation;
	}
	public WebElement getDdnHotel() {
		return DdnHotel;
	}
	public WebElement getDdnRoomType() {
		return DdnRoomType;
	}
	public WebElement getDdnRoomNos() {
		return DdnRoomNos;
	}
	public WebElement getDdnCheckInDate() {
		return DdnCheckInDate;
	}
	public WebElement getDdnCheckOutDate() {
		return DdnCheckOutDate;
	}
	public WebElement getDdnAdultsRoom() {
		return DdnAdultsRoom;
	}
	public WebElement getDdnChildRoom() {
		return DdnChildRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	public void searchHotels(int location,int hotel,int roomType,int  roomNumber ,String checkIn,String checkOut,int adultsRoom,int childRoom) {
		usingIndex(getDdnLocation(), location);
		usingIndex(getDdnHotel(), hotel);
		usingIndex(getDdnRoomType(), roomType);
		usingIndex(getDdnRoomNos(), roomNumber);
		methodUsingSendKeys(getDdnCheckInDate(), checkIn);
		methodUsingSendKeys(getDdnCheckOutDate(), checkOut);
		usingIndex(getDdnAdultsRoom(), adultsRoom);
		usingIndex(getDdnChildRoom(), childRoom);
		methodUsingClick(getBtnSubmit());
		
		
		
		
		
	}
	

}
