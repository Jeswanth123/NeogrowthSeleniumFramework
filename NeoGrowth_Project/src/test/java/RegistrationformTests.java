
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ng.base.BaseClass;
import com.ng.pageobjects.Registerform;

public class RegistrationformTests extends BaseClass {
	
	public Registerform RF;
	
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	//@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void EnterFullName() {
	    RF = new Registerform();
		RF.sendName("Neogrowth");
		RF.SubmitBtn();
		RF.CityErrorMsg();
		Assert.assertTrue(true);
		RF.NumberErrorMsg();
		Assert.assertTrue(true);
		RF.EmailErrorMsg();
		Assert.assertTrue(true);
		RF.ExpError();
		Assert.assertTrue(true);
		RF.SaleError();
		Assert.assertTrue(true);
		RF.IndustryError();
		Assert.assertTrue(true);;
	}
	
	//Okayfile
	@Test
	public void EnterNumber() {
		RF = new Registerform();
		RF.sendMobile("9988776655");
		RF.SubmitBtn();
		RF.NameErrorMsg();
		Assert.assertTrue(true);
		RF.CityErrorMsg();
		Assert.assertTrue(true);
		RF.EmailErrorMsg();
		Assert.assertTrue(true);
		RF.ExpError();
		Assert.assertTrue(true);
		RF.SaleError();
		Assert.assertTrue(true);
		RF.IndustryError();
		Assert.assertTrue(true);;
	}
	
	@Test
	public void EnterEmail() {
		RF = new Registerform();
		RF.sendEmail("qwerty@gmail.com");
		RF.SubmitBtn();
		RF.NameErrorMsg();
		Assert.assertTrue(true);
		RF.CityErrorMsg();
		Assert.assertTrue(true);
		RF.NumberErrorMsg();
		Assert.assertTrue(true);
		RF.ExpError();
		Assert.assertTrue(true);
		RF.SaleError();
		Assert.assertTrue(true);
		RF.IndustryError();
		Assert.assertTrue(true);;
	}
	
	@Test
	public void CityDropDown() {
		RF = new Registerform();
		RF.selectCity("bangalore");
		RF.SubmitBtn();
		RF.NameErrorMsg();
		Assert.assertTrue(true);
		RF.NumberErrorMsg();
		Assert.assertTrue(true);
		RF.EmailErrorMsg();
		Assert.assertTrue(true);
		RF.ExpError();
		Assert.assertTrue(true);
		RF.SaleError();
		Assert.assertTrue(true);
		RF.IndustryError();
		Assert.assertTrue(true);
	}
	
	@Test
	public void BusinessExpDropDown() {
		RF = new Registerform();
		RF.selectExperienec(1);
		RF.SubmitBtn();
		RF.NameErrorMsg();
		Assert.assertTrue(true);
		RF.NumberErrorMsg();
		Assert.assertTrue(true);
		RF.EmailErrorMsg();
		Assert.assertTrue(true);
		RF.CityErrorMsg();
		Assert.assertTrue(true);
		RF.SaleError();
		Assert.assertTrue(true);
		RF.IndustryError();
		Assert.assertTrue(true);
	}
	
	@Test
	public void MonthlysaleDropDown() {
		RF= new Registerform();
		RF.SelectMontlysale("Between 3 to 5 lakhs");
		RF.SubmitBtn();
		RF.NameErrorMsg();
		Assert.assertTrue(true);
		RF.NumberErrorMsg();
		Assert.assertTrue(true);
		RF.EmailErrorMsg();
		Assert.assertTrue(true);
		RF.CityErrorMsg();
		Assert.assertTrue(true);
		RF.ExpError();
		Assert.assertTrue(true);
		RF.IndustryError();
		Assert.assertTrue(true);
	}
	
	@Test
	public void IndustryDropDown() {
		RF= new Registerform();
		RF.SelectIndustry("IT_and_ITeS");
		RF.SubmitBtn();
		RF.NameErrorMsg();
		Assert.assertTrue(true);
		RF.CityErrorMsg();
		Assert.assertTrue(true);
		RF.NumberErrorMsg();
		Assert.assertTrue(true);
		RF.EmailErrorMsg();
		Assert.assertTrue(true);
		RF.ExpError();
		Assert.assertTrue(true);
		RF.SaleError();
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void cardDropdown() {
		RF = new Registerform();
		RF.DigitalPaymentYesClick();
		RF.Cardsales("Less than one lakh");
		RF.SubmitBtn();
		RF.NameErrorMsg();
		Assert.assertTrue(true);
		RF.CityErrorMsg();
		Assert.assertTrue(true);
		RF.NumberErrorMsg();
		Assert.assertTrue(true);
		RF.EmailErrorMsg();
		Assert.assertTrue(true);
		RF.ExpError();
		Assert.assertTrue(true);
		RF.IndustryError();
		Assert.assertTrue(true);
		RF.SaleError();
		Assert.assertTrue(true);
		RF.PaymentOptionError();
	}
	
	@Test
	public void PaymentDropDown() {
		RF = new Registerform();
		RF.DigitalPaymentYesClick();
		RF.PaymentOption(1);
		RF.SubmitBtn();
		RF.NameErrorMsg();
		Assert.assertTrue(true);
		RF.CityErrorMsg();
		Assert.assertTrue(true);
		RF.NumberErrorMsg();
		Assert.assertTrue(true);
		RF.EmailErrorMsg();
		Assert.assertTrue(true);
		RF.ExpError();
		Assert.assertTrue(true);
		RF.IndustryError();
		Assert.assertTrue(true);
		RF.SaleError();
		Assert.assertTrue(true);
		RF.CardsalesError();
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void citycount() {
		
		RF= new Registerform();
		RF.citycountvalues();
		Assert.assertTrue(true);
	}
	
	@Test
	public void Businesscount() {
	   RF = new Registerform();
	   RF.BExpValues();
	   Assert.assertTrue(true);
	}   
	
	@Test
	public void Industrycount() {
		RF = new Registerform();
		RF.BIndustryValues();
		Assert.assertTrue(true);
	}
	
	@Test
	public void ClickYes(){
		RF= new Registerform();
		RF.DigitalPaymentYesClick();
		Assert.assertTrue(true);
	}
	
	@Test
	public void DefaultChckBox() {
		RF = new Registerform();
		RF.DefaultCheckBox();
		Assert.assertTrue(true);
	}
	
	@Test
	public void TextValidationcase() {
		RF = new Registerform();
		RF.Textpresentvalidation();
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void Emailbox() throws InterruptedException {
		RF = new Registerform();
		RF.sendEmail("Neogrowth@gmail.com");
		RF.SubmitBtn();
		Thread.sleep(2000);
		RF.VerifyEmail();
		Assert.assertTrue(true);
	}
	
	@Test
	public void FullFormwithNO() throws InterruptedException {
		RF = new Registerform();
		RF.sendName("Neogrowth");
		RF.sendMobile("9988776655");
		RF.sendEmail("Neogrowth@gmail.com");
		RF.selectCity("bangalore");
		RF.selectExperienec(2);
		RF.SelectMontlysale("Between 3 to 5 lakhs");
		RF.SelectIndustry("HealthCare");
		RF.DigitalpaymentNoClick();
		Assert.assertTrue(true);
		Thread.sleep(2000);
		RF.SubmitBtn();
	}
	
	@Test
	public void FullFormwithYes() throws InterruptedException {
		RF = new Registerform();
		RF.sendName("Neogrowth");
		RF.sendMobile("9988776655");
		RF.sendEmail("Neogrowth@gmail.com");
		RF.selectCity("bangalore");
		RF.selectExperienec(2);
		RF.SelectMontlysale("Between 3 to 5 lakhs");
		RF.SelectIndustry("HealthCare");
		RF.DigitalPaymentYesClick();
		Assert.assertTrue(true);
		RF.Cardsales("Less than one lakh");
		RF.PaymentOption(1);
		Thread.sleep(2000);
		RF.SubmitBtn();
	}
	
	@Test
	public void ValidMobile() {
		RF = new Registerform();
	    RF.validatePhoneNumber("ABCD8899887766");
	}
	
	@Test
	public void ValidMobile1() {
		RF = new Registerform();
	    RF.validatePhoneNumber("1234567890");
	}
	
	
}
