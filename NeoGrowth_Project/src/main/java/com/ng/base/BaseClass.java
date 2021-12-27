package com.ng.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;
	
	@BeforeTest
	public void loadconfig() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\Config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void launchApp() {
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		if (browserName.contains("Chrome")) {
			//WebDriverManager.chromedriver().setup();
			// Set Browser to ThreadLocalMap
			driver = new ChromeDriver();
		} else if (browserName.contains("FireFox")) {
			//WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.contains("IE")) {
			//WebDriverManager.iedriver().setup();
			driver =  new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("urllink"));
	}
	
	
}

