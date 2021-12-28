package com.ng.pageobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.ng.base.BaseClass;

public class Registerform extends BaseClass {
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement FullName;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//input[@id='email1']")
	WebElement Email;
	
	@FindBy(xpath="//select[@id='primary_address_city']")
	WebElement City;
	
	@FindBy(xpath="//select[@id='businesfield']")
	WebElement BusinessExp;
	
	@FindBy(xpath="//select[@name='loan_amount_c']")
	WebElement MonthlySale;
	
	@FindBy(xpath="//select[@name='industry_select']")
	WebElement BusinessIndustry;
	
	@FindBy(xpath="//label[contains(text(),'Do you accept digital payment (Credit Card/ UPI/ I')]")
	WebElement PaymentTextValidation;
	
	@FindBy(xpath="//label[contains(text(),'Credit Card/ UPI/ IMPS/ Wallets')]")
	WebElement Textpresent;
	
	@FindBy(xpath="//label[@class='form-check-label terms_blocks yes_loanamounts terms_checkbox f-small text-weight-bold']//span[@class='checkmark radio_buttons']")
	WebElement DigitalPaymentYes;
	
	@FindBy(xpath="//input[@class='form-check-input register-forms f-small text-weight-bold' and @value='No']")
	WebElement DigitalPaymentNo;
	
	@FindBy(xpath="//div[@id='card_payments']//select[@id='businesfield']")
	WebElement Monthlycard;
	
	@FindBy(xpath="//div[@id='card_payments']//select[@id='valuefield']")
	WebElement AcceptingPayment;

	@FindBy(xpath="//div[contains(@class,'col-12 col-sm-12 col-xs-12 mt-3 mb-2 mt-1 px-0 mb-3 pr-4 form-group')]//input[@id='agree']")
	WebElement CheckBox;
	
	@FindBy(xpath="//button[@name='signup']")
	WebElement Submit;
	
	@FindBy(xpath="//em[@id='first_name-error']")
	WebElement NameError;
	
	@FindBy(xpath="//em[@id='primary_address_city-error']")
	WebElement CityError;
	
	@FindBy(xpath="//em[@id='phone_mobile-error']")
	WebElement NumberError;
	
	@FindBy(xpath="//em[@id='email1-error']")
	WebElement EmailError;
	
	@FindBy(xpath="//em[@id='businesfield-error']")
	WebElement ExpError;
	
	@FindBy(xpath="//em[@id='valuefield-error']")
	WebElement SaleError;
	
	@FindBy(xpath="//em[@id='industry_select-error']")
	WebElement IndustryError;
	
	@FindBy(xpath="//em[@id = 'businesfield-error']")
	WebElement CardError;
	
	@FindBy(xpath="//div[@class='col-12 col-sm-12 col-xs-12 px-0 mb-2 mt-1 form-group']//em[@id='valuefield-error']")
	WebElement PaymentError;
	
	
	public Registerform() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void sendName(String FName) {
		FullName.sendKeys(FName);
	}
	
	
	public void sendMobile(String MobileNum) {
		PhoneNumber.sendKeys(MobileNum);
	}
	
	public void sendEmail(String EmailId) {
		Email.sendKeys(EmailId);
		
			
	}
	
	public void selectCity(String CityName) {
		City.click();
		Select select = new Select(City);
		select.selectByValue(CityName);
	}
	
	public void selectExperienec(int value) {
		BusinessExp.click();
		Select select = new Select(BusinessExp);
		select.selectByIndex(value); 
	}
	
	public void SelectMontlysale(String Sale) {
		MonthlySale.click();
		Select select = new Select(MonthlySale);
		select.selectByVisibleText(Sale);
	}
	
	public void SelectIndustry(String Name) {
		BusinessIndustry.click();
		Select select = new Select(BusinessIndustry);
		select.selectByValue(Name);
	}
	
	public void Cardsales(String cards) {
		Monthlycard.click();
		Select select = new Select(Monthlycard);
		select.selectByVisibleText(cards); 
		
	}
	
	public void PaymentOption(int value) {
		AcceptingPayment.click();
		Select select = new Select(AcceptingPayment);
		select.selectByIndex(value);
	}
	
	public void CityErrorMsg() {
		String city = CityError.getText();
		String Acity = "Select your city";
		Assert.assertEquals(city, Acity);
	}
	
	public void NameErrorMsg() {
		 String Nam = NameError.getText();
		 String ANam = "Please enter your name";
		 Assert.assertEquals(Nam, ANam);
	}
	
	public void NumberErrorMsg() {
		
		String Num = NumberError.getText();
		String ANum = "Please enter a valid phone number";
		Assert.assertEquals(Num, ANum);
	}
	
	public void EmailErrorMsg() {
		
		String EmailMsg = EmailError.getText();
		String AEmailMsg = "Please enter a valid email address";
		Assert.assertEquals(EmailMsg, AEmailMsg);
	}
	
	public void ExpError() {
		String ExpErrorMsg = ExpError.getText();
		String AExpError = "Select your option";
		Assert.assertEquals(ExpErrorMsg, AExpError);
	}
	
	public void SaleError() {
		
		String SaleErrorMsg = SaleError.getText();
		String ASaleError = "Select your option";
		Assert.assertEquals(SaleErrorMsg, ASaleError);
	}
	
	public void IndustryError() {
		String IndustryErrorMsg = IndustryError.getText();
		String AIndustryError = "Select your option";
		Assert.assertEquals(IndustryErrorMsg, AIndustryError);
	}	
	
	public void CardsalesError() {
		String CardsSalesErrormsg = CardError.getText();
		String ACardsSalesErrormsg = "Select your option";
		Assert.assertEquals(CardsSalesErrormsg, ACardsSalesErrormsg);
	}
	
	public void PaymentOptionError() {
		String PaymentOptionErrormsg = PaymentError.getText();
		String APaymentOptionErrormsg = "Select your option";
		Assert.assertEquals(PaymentOptionErrormsg, APaymentOptionErrormsg);
	}
		
	public void citycountvalues() {
		
		City.click();
		 @SuppressWarnings("serial")
		List<String> expectedDropDownValues = new ArrayList <String>()
         { 
            { 
            	add("Select Your City*");
        		add("Ahmedabad");
        		add("Bangalore");
        		add("Baroda");
        		add("Bhubaneswar");
        		add("Chandigarh");
        		add("Chennai");
        		add("Coimbatore");
        		add("Delhi");
        		add("Hyderabad");
        		add("Indore");
        		add("Jaipur");
        		add("Jalandhar");
        		add("Jamshedpur");
        		add("Kolkata");
        		add("Lucknow");
        		add("Ludhiana");
        		add("Madurai");
        		add("Mumbai");
        		add("Mysore");
        		add("Nagpur");
        		add("Nashik");
        		add("Pune");
        		add("Rajkot");
        		add("Ranchi");
        		add("Surat");
        		add("Vijaywada");
        		add("Visakhapatnam");
            } 
         };
         
         Select ActualValues = new Select (City);
         List<WebElement> actualDropDownValues = ActualValues.getOptions();
         
         for(int i=0;i<actualDropDownValues.size();i++)/* {
        	   
             if(actualDropDownValues.get(i).getText().equals(expectedDropDownValues.get(i))) {
              
              System.out.println("Value Matching :"+"Actual List Value="+actualDropDownValues.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
             }else {
              System.out.println("Value Not Matching :"+"Actual List Value="+actualDropDownValues.get(i).getText()+" And Expected Value="+expectedDropDownValues.get(i));
             }
          }*/
         {
       	 Assert.assertTrue((actualDropDownValues.get(i).getText().equals(expectedDropDownValues.get(i))));
        }
        
	}
	
	public void BExpValues() {
		
	BusinessExp.click();
	@SuppressWarnings("serial")
	List<String> expectedExpDropDownValues = new ArrayList <String>()
    { 
       { 
       	add("Business Experience*");
   		add("Less than 2 years");
   		add("2-5 years");
   		add("5 years & above");
   	
       } 
    };
    
    Select ActualExpValues = new Select (BusinessExp);
    List<WebElement> actualExpDropDownValues = ActualExpValues.getOptions();
    
    for(int i=0;i<actualExpDropDownValues.size();i++)
    {
  	 Assert.assertTrue((actualExpDropDownValues.get(i).getText().equals(expectedExpDropDownValues.get(i))));
   }
	}
	
	public void AvgmonthlyValues() {
		
		MonthlySale.click();
		@SuppressWarnings("serial")
		List<String> expectedMonDropDownValues = new ArrayList <String>()
	    { 
	       { 
	    	add("Your Average Monthly Sale*");
	       	add("Less than 1 lakh");
	   		add("Between 1 to 3 lakhs");
	   		add("Between 3 to 5 lakhs");
	   		add("More than 5 lakhs");
	   	
	       } 
	    };
	    
	    Select ActualMonValues = new Select (MonthlySale);
	    List<WebElement> actualMonDropDownValues = ActualMonValues.getOptions();
	    
	    for(int i=0;i<actualMonDropDownValues.size();i++)
	    {
	      Assert.assertTrue((actualMonDropDownValues.get(i).getText().equals(expectedMonDropDownValues.get(i))));
	  }
		}
		
    
    public void BIndustryValues() {
    	
    	BusinessIndustry.click();
    	@SuppressWarnings("serial")
    	List<String> expectedIndusDropDownValues = new ArrayList <String>()
        { 
           { 
        	   add("Your Business Industry*");
        	   add("General Store / Supermarket");
        	   add("Doctor");
        	   add("Hospitals");
        	   add("Hardware and Electrical");
        	   add("Contractor");
        	   add("FMCG");
        	   add("Packaging Material");
        	   add("Plastics");
        	   add("Fuel and Lubricants");
        	   add("Pharmaceuticals");
        	   add("HealthCare");
        	   add("IT and ITeS");
        	   add("Facility Management");
        	   add("Skilled or Semi-Skilled Labour Supplier");
        	   add("Groceries");
        	   add("Petrol Pump");
        	   add("Pharmacy");
        	   add("Clinic & Lab");
        	   add("Optician");
        	   add("CDIT");
        	   add("Home Appliances");
        	   add("Consumer Durables");
        	   add("Others");
        	   
       	
           } 
        };
        
        Select ActualBusIndusValues = new Select (BusinessIndustry);
        List<WebElement> actualIndusDropDownValues = ActualBusIndusValues.getOptions();
        
        for(int i=0;i<actualIndusDropDownValues.size();i++)
        {
     	 Assert.assertTrue((actualIndusDropDownValues.get(i).getText().equals(expectedIndusDropDownValues.get(i))));
       }
    }
   
    public boolean DigitalPaymentYesClick() {
	    DigitalPaymentYes.click();
	    return DigitalPaymentYes.isSelected();
	}
	
	public boolean DigitalpaymentNoClick() {
		return DigitalPaymentNo.isSelected();
	}
	
	public boolean DefaultCheckBox() {
		return CheckBox.isSelected();
	}
	
	public void Textpresentvalidation() {
		  String OText = Textpresent.getText();
		  String AText = "Do you accept digital payment (Credit Card/ UPI/ IMPS/ Wallets) ?*";
		  Assert.assertEquals(OText, AText);
	}
	
    public void validatePhoneNumber(String Numm)
    {
    	PhoneNumber.click();
    	PhoneNumber.sendKeys(Numm);
    	String MobileNumber_Regex = "^[6-9]{1}[0-9]{9}$";
    	//String MobileNumber_Regex = "^[0-9]{10}$";
    	Pattern pattern = Pattern.compile(MobileNumber_Regex) ;
    	Matcher matcher = pattern.matcher(Numm); 
    	Submit.click();
		
    	 if (matcher.matches()) {
    		 
    		 Assert.assertTrue(true);
    		 
    	 }
    	 else
    	 {
    		 String ANumErrormsg = NumberError.getText();
    		 String ENumErrormsg = "Please enter a valid phone number";
    		 Assert.assertEquals(ANumErrormsg, ENumErrormsg);
    		 System.out.print("Phone number error message is checked");
    		 
    	 }
    }
    
    public void ValidateCharNumber(String Nummber) {
    	PhoneNumber.click();
        PhoneNumber.sendKeys(Nummber);
    	String val = PhoneNumber.getAttribute("value");
    	String numberOnly= Nummber.replaceAll("[^0-9]", "");
    	Assert.assertEquals(numberOnly, val);
    	//System.out.println(numberOnly+"This is Expected");
    	//System.out.println(val+"Actual");
    	
    }
    
    public void validateName(String Namme) {
    	
	 	FullName.click();
	 	FullName.sendKeys(Namme);
    	String Nameid_Regex ="^[A-Z ]{1}[A-Za-z ]{6,}$";
    	Pattern pattern = Pattern.compile(Nameid_Regex) ;
    	Matcher matcher = pattern.matcher(Namme); 
    	Submit.click();
    		if (matcher.matches()) {
    		 
    		 Assert.assertTrue(true);
    		 
    	 }
    	 else
    	 {
    		 String ANameErrormsg = NameError.getText();
    		 String ENameErrormsg = "Please enter your name";
    		 Assert.assertEquals(ANameErrormsg, ENameErrormsg);
    		 System.out.print("Name error message is checked");
    		 
    	 }
 } 
    public void validateEmailId(String Id) {
    	
    	Email.click();
    	Email.sendKeys(Id);
    	String Emailid_Regex ="^[0-9a-zA-Z]+[.+-_]{0,1}[0-9a-zA-Z]+[@][a-zA-Z]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2,3}){0,1}";
    	Pattern pattern = Pattern.compile(Emailid_Regex) ;
    	Matcher matcher = pattern.matcher(Id);
    	Submit.click();
    	if (matcher.matches()) {
    		Assert.assertTrue(true);
    	}
    	else {
    		 String AEmailErrormsg = EmailError.getText();
    		 String EEmailErrormsg = "Please enter a valid email address";
    		 Assert.assertEquals(AEmailErrormsg, EEmailErrormsg);
    		 System.out.print("Email error message is checked");
    	}
    }
    
    

		

	public void SubmitBtn() {
		Submit.submit();;
	}
	
	
}
	

