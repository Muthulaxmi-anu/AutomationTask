package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ThreeSliders extends TestBase{
	
	@FindBy(xpath = "//a[contains(text(),'Shop')]")
	WebElement shop;
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement home;
	
	
	public ThreeSliders() {
		init();
		PageFactory.initElements(driver, this);
	}
	
	public void clickShop() {
		shop.click();
	}
	
	public void clickHome() {
		home.click();
	}
	
	public void checkSlider() {
		
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

}
