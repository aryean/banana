package com.bit.test;

import org.junit.Test;

import teststeps.CoreSteps;
import utility.Helper;

public class SmokeTest extends BaseTest{
	
	@Test
	public void test1() throws InterruptedException {
		CoreSteps cs = new CoreSteps(driver);
		cs.openTarget();
		cs.verifyHomeLogo();
		cs.clickOnCategory();
		Helper.myWait();
		cs.verifyCategory();
		cs.clickOnDeals();
		Helper.myWait();
		cs.verifyDeals();
		cs.clickOnWhatsNew();
		Helper.myWait();
		cs.verifyWhatsNew();
		cs.clickOnPickUpandDelivery();
		Helper.myWait();
		cs.verifyPickUpandDelivery();
		cs.clickOnSignIn();
		Helper.myWait();
		cs.verifySignIn();
		cs.clickOnSignIn();
		Helper.myWait();
		cs.clickOnShop();
		Helper.myWait();
		cs.verifyShop();
		cs.sendKeysToSearch();
		Helper.myWait();
		cs.clickOnButtonSearch();
		Helper.myWait();
		cs.clickOnHome();
		cs.verifyHomeLogo();
		System.out.println("test done!");
		
	}
//	@Test
//	public void test2() throws InterruptedException{
//		CoreSteps cs = new CoreSteps(driver);
//		cs.openTarget();
//		cs.sendKeysToSearch();
//		Helper.myWait();
//		cs.clickOnButtonSearch();
//	}

}
