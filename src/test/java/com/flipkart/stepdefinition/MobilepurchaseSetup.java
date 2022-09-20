package com.flipkart.stepdefinition;

import java.io.File;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flipkart.obejectrepository.Mobilepurchasepage;
import com.flipkart.resources.Commanactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class MobilepurchaseSetup extends Commanactions{
	
	Commanactions c = new Commanactions();
	Mobilepurchasepage mp = new Mobilepurchasepage();
	
	@Given("user enter the url")
	public void user_enter_the_url() {
		System.out.println("welcome to cucumber");
		
	}

	@And("user login")
	public void user_login() {
		mp.getCloseicon();
	}
	String name = "";
	@When("user search the mobile by list")
	public void user_search_the_mobile_by_list(DataTable datatable) {
		System.out.println("One dim list");
		List<String> list = datatable.asList();
		name = list.get(1);
		mp.getSearch().sendKeys(name,Keys.ENTER);
		System.out.println("--------------------");
	}
	
	@And ("user search the mobile by outline {string}")
	public void user_search_the_mobile_by_outline(String mobile) {
		System.out.println("Ouline");
		name = mobile;
		c.insertText(mp.getSearch(), mobile);  
		System.out.println("--------------------");
	}
	@And("user select the mobile")
	public void user_select_the_mobile() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		mp.getSelectmobile().click();
	}

	@But("windows handling")
	public void windows_handling() {
		c.windowshandling();
	}

	@Then("user add to the cart selected mobile")
	public void user_add_to_the_cart_selected_mobile() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		mp.getAddtocart().click();
	}

	@Then("screenshot the cart page")
	public void screenshot_the_cart_page() throws IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  TakesScreenshot tst = (TakesScreenshot)driver;
		File as = tst.getScreenshotAs(OutputType.FILE);
		File Despath = new File("C:\\Users\\et\\eclipse-workspace\\Cucumberprg\\src\\test\\resources\\TSS\\mobilespec.png");
		FileUtils.copyFile(as, Despath);
	}
}
