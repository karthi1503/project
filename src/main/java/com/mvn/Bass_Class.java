
package com.mvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Bass_Class {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String type) {
		if(type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(type.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"//Driver//gekodriver.exe");
			 driver = new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void ClickOnElement(WebElement element) {
		element.click();
}
	
	public static void InputvalueElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void geturl(String url) {
		driver.get(url);

	}
	public static void close() {
	driver.close();
	}
	public static void ClearOnElement(WebElement element) {
		element.clear();
		
	}
	public static void Dropdown(String type,WebElement element,String data) {
		Select S=new Select(element);
	
		if(type.equalsIgnoreCase("byIndex")) {
			int value = Integer.parseInt(data);
			S.selectByIndex(value);
		}
		else if (type.equalsIgnoreCase("byValue")) {
			S.selectByValue(data);
		}
		else if (type.equalsIgnoreCase("byVisibleText")) {
			S.selectByVisibleText(data);			
		}
	}
	
}
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

