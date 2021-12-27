package com.ng.pageobjects;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ng.actiondriver.Action;
import com.ng.base.BaseClass;

public class HomePage extends BaseClass {



	//	Action act = new Action();
	@FindBy(xpath="//li[@id='menu-item-22']//a[@href='#']//i[@class='icon-chevron-down menu-icon']")
	WebElement aboutusDD;
	
	@FindBy(xpath="//*[text()='Our Story'] ")
	WebElement OurStory;
	
	@FindBy(xpath="//*[text()='Board Of Directors']")
	WebElement Directors;
	
	@FindBy(xpath="//*[text()='Company Policies']")
	WebElement Company_Policies;
		
    @FindBy(xpath="//picture[@class='img-responsive align-self-center d-flex']")
    WebElement NeogrowthImage;
    
    @FindBy(xpath="//div[@id='slick-slide01']//a[@class='app-button text-black button apply_buttons text-black border-radius-10 px-2 py-2 fs-18 d-table text-uppercase'][normalize-space()='Apply Now']")
    WebElement FirstBanner;
    
	public HomePage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public void aboutusDD() {
		
		Action.click(driver, aboutusDD);
	}
	
	public void aboutusDD1() {
		Action.click(driver, OurStory);
	}
	public void aboutusDD2() {
		Action.click(driver, Directors);
	}
	public void aboutusDD8() {
		Action.click(driver, Company_Policies);
	}
	
	public void Home_Neogorwth_Img() {
		Action.click(driver, NeogrowthImage);
	}
	public void firstBannerImage() throws InterruptedException {
		
		Action.scrollByVisibilityOfElement(driver, FirstBanner);
		Thread.sleep(3000);
		Action.click(driver, FirstBanner);
		
		
	}
	
}
