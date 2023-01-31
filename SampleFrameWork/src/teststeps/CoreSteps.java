package teststeps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Repository.ObjectRepo;
import Repository.TestData;
import utility.Helper;

public class CoreSteps {
	WebDriver driver;
	public CoreSteps(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyHomePageLogo() {
		driver.get("https://www.express.com/");
		boolean result = Helper.verifyElement(driver.findElement(ObjectRepo.homeLogo));
		if(result) {
			System.out.println("this works");
		}
		else {
			System.out.println("this doesnt work");
		}
			
		
	}
	public void clickWomenLink() {
		//Helper.clickOnAnyElement(driver.findElement(ObjectRepo.womenLink));
	}
	
	public void verifyMensText() {
		Helper.verifyText(driver.findElement(By.xpath(null)), TestData.expectedString);
	}
}
