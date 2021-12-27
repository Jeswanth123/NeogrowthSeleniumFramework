package com.ng.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ng.actiondriver.Action;
import com.ng.base.BaseClass;

public class HomePageBrandVideo extends BaseClass {
	
	
	@FindBy(xpath="//a[text()='Watch our Brand Video']")
	WebElement FirstImg;
	@FindBy(xpath="//a[text()='View more']")
	WebElement ViewMore;
	@FindBy(xpath="//ul[@class='d-block ']//img[@class='img-responsive']")
	WebElement Googleplaystoreimg;
	
	public HomePageBrandVideo() {
		PageFactory.initElements(driver, this);
	}
	
	public void Youtube() {
		Action.click(driver, FirstImg);
	}
	public void VmoreBtn() {
		Action.click(driver, ViewMore);
	}
	
	public void GplayImg() {
		Action.click(driver, Googleplaystoreimg);
	}
	
}
