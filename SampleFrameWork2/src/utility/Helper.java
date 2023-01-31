package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {
	
	//driver needed for dr.get
	//driver needed for dr.getTitle()
	//driver needed for dr.getCurrentUrl()
	
	public static boolean verifyElement(WebElement element) {
		return element.isDisplayed();
		
	}
	
	public static void clickOnAnyElement(WebElement element) {
		element.click();
		
	}
	
	public static void verifyText(WebElement element, String text) {
		if (element.getText().equals(text)) {
			System.out.println("Text '" + text + "' verified");
		}else {
			System.out.println("Text '" + text + "' NOT verified");
		}
			
	}

	public static void typeOnAnyElement(WebElement ele, String value) {
		ele.sendKeys(value);
		
	}


//	public void printAnyTitle() {
//		System.out.println(dr.getTitle());
//		String actualTitle = dr.getTitle();
//		
//	}
	
	public static void getAnyText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
	}

//	public void printAnyUrl() {
//		System.out.println(dr.getCurrentUrl());
//		String actualUrl = dr.getCurrentUrl();
//		
//	}


	public static void clickOnAnyElementfromAList(List<WebElement> ele, int elementNumber) {

		ele.get(elementNumber).click();

	}

	public static void myWait() throws InterruptedException {
		Thread.sleep(5000);
	}
	

}
