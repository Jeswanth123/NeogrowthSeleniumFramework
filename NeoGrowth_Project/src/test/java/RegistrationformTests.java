
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
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	/*TC-1 Passing Name Value and clicking on Submit button, Other fields will generate error message. 
	 Captured that error message and compared with required text.
	 If Any of the Text is not matched it will fail the Case*/
	
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
	
	/*TC-2 Passing Number Value and clicking on Submit button, Other fields will generate error message. 
	 Captured that error message and compared with required text.
	 If Any of the Text is not matched it will fail the Case*/
	
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
	
	/*TC-3 Passing Email Value and clicking on Submit button, Other fields will generate error message. 
	 Captured that error message and compared with required text.
	 If Any of the Text is not matched it will fail the Case*/
	
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
	
	/*TC-4 Select City value from Drop down and clicking on Submit button, Other fields will generate error message. 
	 Captured that error message and compared with required text.
	 If Any of the Text is not matched it will fail the Case*/
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
	
	/*TC-5 Select Business experience value from Drop down and clicking on Submit button, Other fields will generate error message. 
	 Captured that error message and compared with required text.
	 If Any of the Text is not matched it will fail the Case*/
	
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
	
	/*TC-6 Select Monthly sale value from Drop down and clicking on Submit button, Other fields will generate error message. 
	 Captured that error message and compared with required text.
	 If Any of the Text is not matched it will fail the Case*/
	
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
	
	/*TC-7 Select Industry value from Drop down and clicking on Submit button, Other fields will generate error message. 
	 Captured that error message and compared with required text.
	 If Any of the Text is not matched it will fail the Case*/
	
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
	
	/*TC-8 Select card sales value from Drop down and clicking on Submit button, Other fields will generate error message. 
	 Captured that error message and compared with required text.
	 If Any of the Text is not matched it will fail the Case*/
	
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
	
	/*TC-9 Select Payment value from Drop down and clicking on Submit button, Other fields will generate error message. 
	 Captured that error message and compared with required text.
	 If Any of the Text is not matched it will fail the Case*/
	
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
		RF.PaymentOptionError();
		Assert.assertTrue(true);
	}
	
	/*TC-10 Comparing City Dropdown values with Expected values.*/
	
	@Test
	public void citycount() {
		
		RF= new Registerform();
		RF.citycountvalues();
		Assert.assertTrue(true);
	}
	
	/*TC-11 Comparing Business experience Dropdown values with Expected values.*/
	
	@Test
	public void Businesscount() {
	   RF = new Registerform();
	   RF.BExpValues();
	   Assert.assertTrue(true);
	}   
	
	/*TC-12 Comparing Monthly sale Dropdown values with Expected values.*/
	
	@Test
	public void MonthlyCount() {
		RF = new Registerform();
		RF.AvgmonthlyValues();
		Assert.assertTrue(true);
	}
	
	/*TC-13 Comparing Business Industry Dropdown values with Expected values.*/
	
	@Test
	public void Industrycount() {
		RF = new Registerform();
		RF.BIndustryValues();
		Assert.assertTrue(true);
	}
	
	/*TC-14 Clicking on YES check box and validated isselected method for Radio Button, and will pass if YES is checked*/
	
	@Test
	public void ClickYes(){
		RF= new Registerform();
		RF.DigitalPaymentYesClick();
		Assert.assertTrue(true);
	}
	
	// TC -15
	
	@Test
	public void ClickNo() {
		RF= new Registerform();
		RF.DigitalpaymentNoClick();
		Assert.assertTrue(true);
		
	}
	
	/*TC-16 Validating Default Agree check box and used isselected method for Check box validation */
	
	@Test
	public void DefaultChckBox() {
		RF = new Registerform();
		RF.DefaultCheckBox();
		Assert.assertTrue(true);
	}
	
	/*TC-17 Comparing text present above Yes and No Radio Button with Expected Value*/
	
	@Test
	public void TextValidationcase() {
		RF = new Registerform();
		RF.Textpresentvalidation();
		Assert.assertTrue(true);
		
	}
	
	/*TC -18 Passing all the values with Default NO Selected and clicking on Submit*/
	
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
		Thread.sleep(10000);
		RF.SubmitBtn();
	}
	
	/* TC -19 Passing all the values by Selecteing YES and clicking on Submit*/
	
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
	
	//TC-20 Positive TC 10 Number(Number starting with 6-9)
	
	@Test
	public void ValidMobile1() {
		RF = new Registerform();
	    RF.validatePhoneNumber("9988776655");
	}
	
	//TC-21 Positive TC 10 Number(Number starting with  6-9)
	
	@Test
	public void ValidMobile2() {
		RF = new Registerform();
	    RF.validatePhoneNumber("6432901234");
	}
	
	/*TC -22 Negative TC (Entering 5 values) It will check Regular Expression Pattern and if it is not matching
	It will move to else statment and check for the error which has to be displayed if number is entered wrong
	If it is error msg is displayed correctly It will pass the case. */
	
	@Test
	public void ValidMobile3() {
		RF = new Registerform();
	    RF.validatePhoneNumber("998877");
	}
	
	/*TC-23 Negative TC (Passing Phone number starting 1, As indian number doesnt start with 1 as per the regular expression)
	It moves to else condition and checks for Error message,If it displays it will pass or TC will be failed */
	
	@Test
	public void ValidMobile4() {
		RF = new Registerform();
	    RF.validatePhoneNumber("1234567890");
	}
	
	// TC-24 Negative TC (Passing 2 Digits)
	
	@Test
	public void ValidMobile5() {
		RF = new Registerform();
	    RF.validatePhoneNumber("12");
	}
	
	// TC-25 Negative TC (Passing 11 Digits)
	
	@Test
	public void ValidMobile6() {
		RF = new Registerform();
	    RF.validatePhoneNumber("998877665544");
	}
	
	// TC-26 Negative TC (Passing only 9 Digits)
	
	@Test
	public void ValidMobile7() {
		RF = new Registerform();
	    RF.validatePhoneNumber("998877665");
	}
	
	/* TC-27 Sending AlphaNumeric values, Have given a regular expression to extract only Numbers and this
	will be saved in string, and By using Get attribute will get the passed values, Developer has disabled 
	Alphabets entering, so TC will compare the values which are entered in Text box and extracted values  */
	
	@Test
	public void CharInValidMobile1() {
		RF = new Registerform();
	    RF.ValidateCharNumber("ABC9988OK");
	}
	
	//TC-28
	
	@Test
	public void CharInValidMobile2() {
		RF = new Registerform();
	    RF.ValidateCharNumber("9876ABOK");
	}
	
	//TC-29
	
	@Test
	public void CharInValidMobile3() {
		RF = new Registerform();
	    RF.ValidateCharNumber("9876AB06H2Gu87");
	}
	
	//TC-30
	
	@Test
	public void CharInValidMobile4() {
		RF = new Registerform();
	    RF.ValidateCharNumber("ABCDEFGH1IJKL");
	}
	
	//TC-31
	
	@Test
	public void CharInValidMobile5() {
		RF = new Registerform();
	    RF.ValidateCharNumber("!@#$%1^&*()_+:>?");
	}
	
	/* TC - 32 Positive Testing(Valid EMail) Have given Regular expression to validate email values, 
	It must contain @with 2 0r 3 letters and . with 2 0r 3 letters and it can also contain . in middle of words  */
	
	@Test
	public void ValidEmail1() {
		RF = new Registerform();
		RF.validateEmailId("neogrowth@gmail.com");
		
	}
	
	// TC -33 Positive Testing(Valid EMail)
	
	@Test
	public void ValidEmail2() {
		RF = new Registerform();
		RF.validateEmailId("neogrowth.company@gmail.com");
	}
	
	 // TC-34 Positive Testing	
	
	@Test
	public void ValidEmail3() {
		 RF = new Registerform();
		 RF.validateEmailId("neo@gma.com");
			
	}
	 
	  // TC -35 Sending INvalid Email Id
	 
	 @Test
	public void ValidEmail4() {
		 RF = new Registerform();
		 RF.validateEmailId("neo.@gma.com");
	}

	  // TC-36
	  
	  @Test
	public void ValidEmail5() {
		  RF = new Registerform();
		  RF.validateEmailId("ne.o@gma.com");
	 }
	  
	  // TC-37 Sending Negative values, But in Else condition verified Error Txt msg
	  
	@Test
	public void ValidEmail6() {
		RF = new Registerform();
		RF.validateEmailId("neo@g.");
	}
	
		//TC-38 Negative Testing(@g only)
    @Test
	public void ValidEmail7() {
		RF = new Registerform();
	    RF.validateEmailId("neogrowth.company@g");
					
	}
	  
	   /*TC-39 Positive TC , Have coded regular Expression for Name text box, It should accept only Alphabets and space b/w two words
	     If it has Number, It should not accept and error message should be shown*/
	   
    @Test
	public void ValidateName() {
    	RF = new Registerform();
    	RF.validateName("NeoGrowth");
    }
	   
	   // TC -40 Postive Testing
    
    @Test
	public void ValidteName2() {
		RF = new Registerform();
		RF.validateName("Neo Growth");  
	}
	   
	   // TC-41 Negative Testing First letter should be capital
	   
	@Test
	public void ValidateName1() {
		   RF = new Registerform();
		   RF.validateName("neo growth");
	}
	   
	  //TC-42 Negative Testing Sending Numbers
	
	@Test
	public void ValidateName3() {
		   RF = new Registerform();
		   RF.validateName("1234567");
	 }
	   
	   //TC-43 Negative Testing
	
	@Test
	public void ValidateName4() {
		   RF = new Registerform();
		   RF.validateName("ABC123");
	}
}
	

