package com.flipkart.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	private void beforescenaio() {
		System.out.println("welcome to cucumber");

	}
	@After
	private void afterscenaio() {
	System.out.println("session ended");
	}

}
