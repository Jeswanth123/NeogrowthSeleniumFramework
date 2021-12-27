package com.ng.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ng.actiondriver.Action;
import com.ng.base.BaseClass;

public class RegisterFormPage extends BaseClass {

	@FindBy(xpath="//input[@placeholder='Enter name as per the PAN']")
	WebElement FirstName;
	
	public RegisterFormPage() {
		PageFactory.initElements(driver,this);
		
	}
	public void FullName(String name) {
		String FulName = prop.getProperty("name");
		Action.type(FirstName, FulName);
	}
	
}
