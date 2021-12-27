//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ng.base.BaseClass;
import com.ng.pageobjects.HomePage;
import com.ng.pageobjects.RegisterFormPage;

public class HomepageTests extends BaseClass {
	private static final String FulName = null;
	HomePage Hp;
	RegisterFormPage Rp;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	@Test
	public void Homepagetest_AboutUs() throws InterruptedException {
		Hp =new HomePage();
		Hp.aboutusDD(); 
		String Aboutustitle = driver.getTitle();
		System.out.println("The title is :"+ Aboutustitle);
		Hp.Home_Neogorwth_Img();
		Thread.sleep(3000);
	}
	@Test
	public void Homepagetest_AboutUs_OurStory() throws InterruptedException {
		Hp =new HomePage();
		Hp.aboutusDD(); 
		Hp.aboutusDD1();
		Hp.Home_Neogorwth_Img();
		Thread.sleep(3000);
	}
	@Test
	public void Homepagetest_AboutUs_Directors() throws InterruptedException {
		Hp =new HomePage();
		Hp.aboutusDD();
		Hp.aboutusDD2();
		Hp.Home_Neogorwth_Img();
		Thread.sleep(3000);
	}
	@Test
	public void Homepagetest_AboutUs_CompanyPolicies() throws InterruptedException {
		Hp =new HomePage();
		Hp.aboutusDD();
		Hp.aboutusDD8();
		Hp.Home_Neogorwth_Img();
		Thread.sleep(3000);
	}
	
	@Test
	public void clickonFirstBanner() throws InterruptedException {
	
	Hp = new HomePage();
	Hp.firstBannerImage();
	Rp = new RegisterFormPage();
	Rp.FullName(FulName);
	
	}
}
