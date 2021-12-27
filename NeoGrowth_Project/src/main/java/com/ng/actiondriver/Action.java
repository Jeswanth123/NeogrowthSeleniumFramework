package com.ng.actiondriver;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import com.mystore.actioninterface.ActionInterface;
import com.ng.base.BaseClass;

public class Action extends BaseClass {

	
	public static void click(WebDriver driver,WebElement ele) {
		
		ele.click();
		
	}
	
	public static boolean sendvalues(WebElement ele, String text) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			// logger.info("Entered text :"+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value");
			} else {
				System.out.println("Unable to enter value");
			}

		}
		return flag;
	}
	
	public static boolean selectByValue(WebElement element,String value) {
		boolean flag = false;
		try {
			Select s = new Select(element);
			s.selectByValue(value);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Option selected by Value");
			} else {
				System.out.println("Option not selected by Value");
			}
		}
	}
	
	public static boolean click1(WebElement locator, String locatorName) {
		boolean flag = false;
		try {
			locator.click();
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Able to click on \""+locatorName+"\"");
			} else {
				System.out.println("Click Unable to click on \""+locatorName+"\"");
			}
		}

	}
	public boolean findElement(WebDriver driver,WebElement ele) {
		boolean flag = false;
		try
		{
			ele.isDisplayed();
			flag=true;
		}
		catch(Exception e) {
			flag=false;
		}
		finally {
			if(flag) {
				System.out.println("FindElement locater was found");
			}
			else {
				System.out.println("FindElement locater was not found");
			}
		}
		
		return flag;
		
		
	}
	
	public boolean isDisplayed(WebDriver driver,WebElement ele) {
		boolean flag = false;
		flag = findElement(driver,ele);
		if (flag) {
			flag = ele.isDisplayed();
			if (flag){	
				System.out.print("Element is Displayed");
			}
			else {
				System.out.println("Element is not displayed");
			}
		}
		else{
			System.out.println("Element is not found");
		}
		return flag;
		
	}
	public String getTitle(WebDriver driver) {
		boolean flag = false;

		String text = driver.getTitle();
		if (flag) {
			System.out.println("Title of the page is: \""+text+"\"");
		}
		return text;
	}
		public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", ele);

		}
		public static boolean switchToNewWindow(WebDriver driver) {
			boolean flag = false;
			try {

				Set<String> s=driver.getWindowHandles();
				Object popup[]=s.toArray();
				driver.switchTo().window(popup[1].toString());
				flag = true;
				return flag;
			} catch (Exception e) {
				flag = false;
				return flag;
			} finally {
				if (flag) {
					System.out.println("Window is Navigated with title");				
				} else {
					System.out.println("The Window with title: is not Selected");
				}
			}
		}
		public static boolean switchToOldWindow(WebDriver driver) {
			boolean flag = false;
			try {

				Set<String> s=driver.getWindowHandles();
				Object popup[]=s.toArray();
				driver.switchTo().window(popup[0].toString());
				flag = true;
				return flag;
			} catch (Exception e) {
				flag = false;
				return flag;
			} finally {
				if (flag) {
					System.out.println("Focus navigated to the window with title");			
				} else {
					System.out.println("The Window with title: is not Selected");
				}
			}
		}
		
		public static boolean type(WebElement ele, String text) {
			boolean flag = false;
			try {
				flag = ele.isDisplayed();
				ele.clear();
				ele.sendKeys(text);
				// logger.info("Entered text :"+text);
				flag = true;
			} catch (Exception e) {
				System.out.println("Location Not found");
				flag = false;
			} finally {
				if (flag) {
					System.out.println("Successfully entered value");
				} else {
					System.out.println("Unable to enter value");
				}

			}
			return flag;
		}
		
		public static boolean switchWindowByTitle(WebDriver driver,String windowTitle, int count) {
			boolean flag = false;
			try {
				Set<String> windowList = driver.getWindowHandles();

				String[] array = windowList.toArray(new String[0]);

				driver.switchTo().window(array[count-1]);

				if (driver.getTitle().contains(windowTitle)){
					flag = true;
				}else{
					flag = false;
				}
				return flag;
			} catch (Exception e) {
				//flag = true;
				return false;
			} finally {
				if (flag) {
					System.out.println("Navigated to the window with title");
				} else {
					System.out.println("The Window with title is not Selected");
				}
			}
		}
		
}


