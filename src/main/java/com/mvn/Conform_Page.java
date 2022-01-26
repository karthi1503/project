package com.mvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Conform_Page {
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement button;
	
	@FindBy(id="continue")
	private WebElement continue_btn;


	public Conform_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}

}
