package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	//Open blank browser
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/mahisalaheen/Downloads/chromedriver");
		driver = new ChromeDriver();
		
	
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
	

}
