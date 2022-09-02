package com.sample2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinBooking extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException{
		AdactinBooking adactinBooking = new AdactinBooking();
		adactinBooking.bookHotel();
	}

	public void bookHotel() throws IOException, InterruptedException {
		
	   driverManager();
	   
	   driverUrl("https://adactinhotelapp.com/");
	   
	  // drivermaximize();
	   
	   WebElement txtuserName = elementFindById("username");
	   String name = getCell("adactin", 1 , 0);
	   methodUsingSendKeys(txtuserName, name);
	   
	   WebElement txtpass = elementFindById("password");
	   String password = getCell("adactin", 1, 1);
	   methodUsingSendKeys(txtpass, password);
	   
	   WebElement btnlogIn = elementFindById("login");
	   methodUsingClick(btnlogIn);
	   
	   WebElement location = elementFindById("location");
	   usingIndex(location, 3);
	   
	   WebElement hotels= elementFindById("hotels");
	   usingIndex(hotels, 3);
	   
	   WebElement roomType = elementFindById("room_type");
	   usingIndex(roomType, 2);
	   
	   WebElement noOfRoom = elementFindById("room_nos");
	   usingIndex(noOfRoom, 2);
	   
	   WebElement checkIn = elementFindById("datepick_in");
	    String dateIn = getCell("adactin", 1, 7);
	   methodUsingSendKeys(checkIn, dateIn);
	   
	   WebElement checkOut = elementFindById("datepick_out");
	   String dateOut = getCell("adactin",1, 8);
	   methodUsingSendKeys(checkOut, dateOut);
	   
	   WebElement perAdults = elementFindById("adult_room");
	   usingIndex(perAdults, 2);
	   
	   WebElement childPerRoom = elementFindById("child_room");
	   usingIndex(childPerRoom, 2);
	    
	   WebElement btnClick2 = elementFindById("Submit");
	   methodUsingClick(btnClick2);
	   
	   WebElement checkBox = elementFindById("radiobutton_0");
	   methodUsingClick(checkBox);
	   
	   WebElement click = elementFindById("continue");
	   methodUsingClick(click);
	   
	   WebElement firstName = elementFindById("first_name");
	   String name1 = getCell("adactin", 1, 11);
	   methodUsingSendKeys(firstName, name1);
	   
	   WebElement path = elementFindByXPath("//input[@name='last_name']");
	   String cell = getCell("adactin", 1, 12);
	   methodUsingSendKeys(path, cell);
	   
	   WebElement address = elementFindById("address");
	   String address1 = getCell("adactin", 1, 13);
	   methodUsingSendKeys(address, address1);
	   
	   
	   WebElement cCv = elementFindById("cc_num");
	   String excelCCv = getCell("adactin", 1, 14);
	   methodUsingSendKeys(cCv,excelCCv);
	   
	   
	   WebElement type = elementFindById("cc_type");
	   String ccType = getCell("adactin", 1, 15);
	   methodUsingSendKeys(type, ccType);
	   
	   WebElement exp = elementFindById("cc_exp_month");
	   String month = getCell("adactin", 1, 16);
	   methodUsingSendKeys(exp, month);
	   
	   WebElement exp1 = elementFindById("cc_exp_year");
	   String year = getCell("adactin", 1, 17);
	   methodUsingSendKeys(exp1, year);
	   
	   WebElement no = elementFindById("cc_cvv");
	   String excelNo= getCell("adactin", 1, 18);
	   methodUsingSendKeys(no, excelNo);
	   
	   WebElement bookingConfirm = elementFindById("book_now");
	   methodUsingClick(bookingConfirm);
	   
	  thread(7000); 
	  WebElement element = elementFindById("order_no");
	  String order = usingGetAttribute(element);
	  System.out.println(order);
	  createCell("adactin", 1, 19, order);
	}
}	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	



