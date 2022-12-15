package com.ebay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_page {

	public WebDriver driver;
	

	
	public Ebay_page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
		}


	public WebDriver getDriver() {
		return driver;
	}


	

	@FindBy(xpath = "//input[@type='text']")
	public WebElement searchfield;
	
	
	public WebElement getSearchfield() {
		return searchfield;
	}

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement searchbtn;
	
	
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	
	@FindBy(xpath = "//span[text()='SG shaped Electric guitar (Free Shipped USA****)']/parent::div/parent::a/following-sibling::div//div/span[text()='+$78.50 shipping']")
	public WebElement price;
	
	
	public WebElement getPrice() {
		return price;
	}
}
