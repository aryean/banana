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
	//driver needed for dr.get
	//driver needed for dr.getTitle()
	//driver needed for dr.getCurrentUrl()
	
	public void openTarget() {
		driver.get("https://www.target.com/");
	}
	public void printPageTitle() {
		System.out.println(driver.getTitle());
	}
	public void printPageUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	public void clickOnHome() {
		Helper.clickOnAnyElement(driver.findElement(ObjectRepo.homeLogo));
	}
	public void verifyHomeLogo() {
		boolean actualLogo = Helper.verifyElement(driver.findElement(ObjectRepo.homeLogo));
		if (actualLogo) {
			System.out.println("Logo is verified");
		}else {
			System.out.println("Logo is NOT verified");
		}
	}
	public void clickOnCategory() {
		Helper.clickOnAnyElement(driver.findElement(ObjectRepo.categoryLink));
	}
	
	public void verifyCategory() {
		Helper.verifyText(driver.findElement(ObjectRepo.mainMenuText), "Main Menu");
	}
	
	public void clickOnDeals() {
		Helper.clickOnAnyElement(driver.findElement(ObjectRepo.dealsLink));
	}
	
	public void verifyDeals() {
		Helper.verifyText(driver.findElement(ObjectRepo.dealsText), "Clearance");
	}
	public void clickOnWhatsNew() {
		Helper.clickOnAnyElement(driver.findElement(ObjectRepo.whatsNewLink));
	}
	public void verifyWhatsNew() {
		Helper.verifyText(driver.findElement(ObjectRepo.whatsNewText), "#TargetStyle");
		
	}
	public void clickOnPickUpandDelivery() {
		Helper.clickOnAnyElement(driver.findElement(ObjectRepo.pickUpandDeliveryLink));
	}
	public void verifyPickUpandDelivery() {
		Helper.verifyText(driver.findElement(ObjectRepo.pickUpandDeliveryText), "Order Pickup");
		
	}
	public void clickOnSearch() {
		Helper.clickOnAnyElement(driver.findElement(ObjectRepo.searchLink));
	}
	public void sendKeysToSearch() {
		Helper.typeOnAnyElement(driver.findElement(ObjectRepo.searchLink), "Kids Shoes");
	}
	public void clickOnButtonSearch() {
		Helper.clickOnAnyElement(driver.findElement(ObjectRepo.searchButton));
	}
	public void verifySearch() {
		Helper.verifyText(driver.findElement(ObjectRepo.searchText), "Trending Searches");
		
	}
	public void clickOnSignIn() {
		Helper.clickOnAnyElement(driver.findElement(ObjectRepo.signInLink));
	}
	public void verifySignIn() {
		Helper.verifyText(driver.findElement(ObjectRepo.signInText), "Sign in");
	}
	public void clickOnShop() {
		Helper.clickOnAnyElement(driver.findElement(ObjectRepo.shopLink));
	}
	public void verifyShop() {
		Helper.verifyText(driver.findElement(ObjectRepo.shopText), "Your cart is empty");
	}
	
	
	
	
	
	
	
	
}
