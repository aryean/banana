package com.bit.test;

import org.junit.Test;

import teststeps.CoreSteps;

public class SmokeTest extends BaseTest{
	
	@Test
	public void test1() {
		CoreSteps cs = new CoreSteps(driver);
		cs.verifyHomePageLogo();
		//cs.clickWomenLink();
	}

}
