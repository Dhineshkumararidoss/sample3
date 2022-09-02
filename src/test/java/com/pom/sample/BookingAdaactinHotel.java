package com.pom.sample;

import java.io.IOException;
import java.sql.DriverManager;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.sample2.BaseClass;

public class BookingAdaactinHotel extends BaseClass{
	
	@BeforeClass
	public static void beforeClass() {
		driverManager();
		driverUrl("https://adactinhotelapp.com/");
		driverMaximize();
	}

	@Test
	public void booking() throws IOException, InterruptedException {
		LoginPage loginpage = new LoginPage();
		loginpage.login(getCell("adactin", 1, 0), getCell("adactin", 1, 1));

		SearchHotelpage searchHotel = new SearchHotelpage();
		searchHotel.searchHotels(3, 4, 2, 3, getCell("adactin", 1, 6), getCell("adactin", 1, 7), 3, 2);

		SelectHotelPage selectHotel = new SelectHotelPage();
		selectHotel.hotelSelected();

		BookHotelPage bookHotel = new BookHotelPage();
		bookHotel.bookHotel(getCell("adactin", 1, 11), getCell("adactin", 1, 12), getCell("adactin", 1, 13),
				getCell("adactin", 1, 14), 3, 8, 3, getCell("adactin", 1, 18));

		thread(7000);
		BookingConfirmPage confirmBooking = new BookingConfirmPage();

		confirmBooking.orderId();

		CancelBookingPage cancel = new CancelBookingPage();
		cancel.cancelBooking();
	}

	@AfterClass
	public static void afterClass() {
		baseClose();

	}
}
