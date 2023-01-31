package Repository;

import org.openqa.selenium.By;

public class ObjectRepo {
	
	public static By homeLogo = By.xpath("//a[@id='home']");
	public static By categoryLink = By.xpath("//nav[@id='headerMain']/a[3]");
	public static By mainMenuText = By.cssSelector(".Link-sc-1khjl8b-0.NavigationLink-kfyxgv-0.kdCHb.dVsBwT.h-text-bs.h-text-bold");
	public static By dealsLink = By.xpath("//a[@id='secondary']");
	public static By dealsText = By.xpath("//li[@id='deals-clearance']/a/div");
	public static By whatsNewLink = By.xpath("//a[@id='trending']");
	public static By whatsNewText = By.xpath("//div[@id='trendingMenu']/ul/li[1]/a/div");
	public static By pickUpandDeliveryLink = By.xpath("//a[@id='pickupAndDelivery']");
	public static By pickUpandDeliveryText = By.xpath("//li[@id='pickupAndDelivery-orderPickup']/a/div");
	public static By searchLink = By.xpath("//input");
	public static By searchText = By.xpath("//ul[@id='typeahead']/div");
	public static By searchButton = By.xpath("//button[@class='SearchInputButton-sc-1opoijs-0 eOzuAz']");
	//sendkeys
	//click home
	public static By signInLink = By.xpath("//div[@id='header']/nav/a[7]");
	public static By signInText = By.xpath("//li[@id='accountNav-signIn']/a/div");
	public static By shopLink = By.xpath("//div[@id='header']/nav/a[8]");
	public static By shopText = By.xpath("//div[@class='styles__StyledRow-sc-1nuqtm0-0 KWLWs']");
	//click on home logo
	
	
	
	
	
	
}	

