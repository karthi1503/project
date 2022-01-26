package com.mvn;

import org.openqa.selenium.WebDriver;

public class Adactintest_Runner extends Bass_Class {
	public static WebDriver driver=getBrowser("chrome");
	public static Login_Page login = new Login_Page(driver);
	public static Booking_Page book=new Booking_Page(driver);
	public static Conform_Page conform=new Conform_Page(driver);
	public static Payment_Page pay=new Payment_Page(driver);
	public static void main(String[] args) {
		geturl("https://adactinhotelapp.com/");
		InputvalueElement(login.getUsername(), "karthickvendhan");
		InputvalueElement(login.getPassword(), "Karthick123");
		ClickOnElement(login.getLogin_btn());
		Dropdown("byValue",book.getLocation(), "Melbourne");
		Dropdown("byValue",book.getHotel(), "Hotel Creek");
		Dropdown("byValue",book.getRoom(), "Standard");
		Dropdown("byValue",book.getNo_room(), "1");
		ClearOnElement(book.getCheckin());
		InputvalueElement(book.getCheckin(), "23/1/2022");
		ClearOnElement(book.getCheckout());
		InputvalueElement(book.getCheckout(), "24/1/2022");
		Dropdown("byValue",book.getAdult(), "2");
		Dropdown("byValue",book.getChild(), "0");
		ClickOnElement(book.getSearch_btn());
		ClickOnElement(conform.getButton());
		ClickOnElement(conform.getContinue_btn());
		InputvalueElement(pay.getFirst_name(), "karthi");
		InputvalueElement(pay.getLast_name(), "T");
		InputvalueElement(pay.getAdress(), "xyz");
		InputvalueElement(pay.getCc_num(), "1234567890123456");
		Dropdown("byValue",pay.getCc_type(), "VISA");
		Dropdown("byValue",pay.getCc_exp_month(), "12");
		Dropdown("byValue",pay.getCc_exp_year(), "2022");
		InputvalueElement(pay.getCvv_num(), "123");
		ClickOnElement(pay.getBook_btn());

	}

}
