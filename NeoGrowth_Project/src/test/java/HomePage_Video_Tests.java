import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ng.base.BaseClass;
import com.ng.pageobjects.HomePageBrandVideo;

public class HomePage_Video_Tests extends BaseClass{

	HomePageBrandVideo HPB;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
//	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
//	
	@Test
	public void Select_first_Image() throws InterruptedException {
		HPB=new HomePageBrandVideo();
		HPB.Youtube();
		Thread.sleep(3000);
	}
	@Test
	public void viewmorebtn() throws InterruptedException {
		HPB =new HomePageBrandVideo();
		HPB.VmoreBtn();
		Thread.sleep(3000);
	}
	
	@Test
	public void Googleplayimager() throws InterruptedException {
		HPB =new HomePageBrandVideo();
		HPB.GplayImg();
		Thread.sleep(3000);
	}
	
}
