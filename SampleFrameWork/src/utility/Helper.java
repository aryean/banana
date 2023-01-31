package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Helper {
	
	public static boolean verifyElement(WebElement element) {
		return element.isDisplayed();
		
	}
	
	public static void clickOnAnyElement(WebElement element) {
		element.click();
		
	}
	
	public static void verifyText(WebElement element, String text) {
		if (element.getText().equals(text)) {
			System.out.println("ayooo");
		}else {
			System.out.println("sad times");
		}
			
	}
	public static void selectMonth(String month, WebDriver driver,By locator, int indx) {
		
		String m = month.toLowerCase();
		
		switch(m) {
		
		case "january":
			new Select(driver.findElement(locator)).selectByIndex(indx);
			break;
		case "february":
			new Select(driver.findElement(locator)).selectByIndex(indx);
		
		
		
		}
		
		
	}
	
	public void verifyTargetMainMenu(WebDriver driver, By category, By dropDown) {
		driver.findElement(category).click();
		driver.findElement(dropDown).isDisplayed();
		driver.findElement(category).click();
		driver.findElement(dropDown).isDisplayed();
		
		if (driver.findElement(dropDown).isDisplayed() == false) {
			
		}
	}
	
	
	
	
	

}
