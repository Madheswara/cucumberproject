package com.flipkart.stepdefinition;

import com.flipkart.resources.Commanactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commanactions {
	
	Commanactions c = new Commanactions();
	@Before
	private void beforescenaio() {
		c.launch("https://www.flipkart.com");

	}
	@After
	private void afterscenaio() {
		driver.quit();
		System.out.println("session ended");
	}

}
