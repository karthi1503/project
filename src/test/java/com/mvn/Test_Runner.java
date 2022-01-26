package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Runner {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick\\eclipse-workspace\\mvn\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("zxcvbnmlk");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("9176754233kar");
		driver.findElement(By.id("login")).click();
		WebElement location = driver.findElement(By.id("location"));
		Select s1 = new Select(location);
		s1.selectByValue("Sydney");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotel);
		s2.selectByValue("Hotel Sunshine");
		WebElement room = driver.findElement(By.id("room_type"));
		Select s3 = new Select(room);
		s3.selectByValue("Deluxe");
		WebElement Noroom = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(Noroom);
		s4.selectByValue("1");
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.clear();
		checkin.sendKeys("20/1/2022");
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.clear();
		checkout.sendKeys("21/1/2022");
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(adult);
		s5.selectByValue("2");
		WebElement child = driver.findElement(By.id("child_room"));
		Select s6 = new Select(child);
		s6.selectByValue("1");
		WebElement sub = driver.findElement(By.id("Submit"));
		sub.click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys("xyz");
		WebElement second = driver.findElement(By.id("last_name"));
		second.sendKeys("kar");
		WebElement adress = driver.findElement(By.id("address"));
		adress.sendKeys("zxc");
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("1234567890123456");
		WebElement cct = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(cct);
		s7.selectByValue("VISA");
		WebElement exm = driver.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(exm);
		s8.selectByValue("3");
		WebElement exy = driver.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(exy);
		s9.selectByValue("2022");
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys("196");
		driver.findElement(By.id("book_now")).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")).click();
		driver.findElement(By.id("logout")).click();
		
	}

}
