package com.flipkart.stepdefinition;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.obejectrepository.Tvpurchasepage;
import com.flipkart.resources.Commanactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TvpurchaseSetup {
	static WebDriver driver;
	
	Commanactions cm= new Commanactions();
	Tvpurchasepage tp = new Tvpurchasepage();
	
	@Given("user enter the search URL")
	public void user_enter_the_search_URL() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("user login the page")
	public void user_login_the_page() {
		tp.getCloseicon().click();
	}
	
	@When("search the Tv")
	public void search_the_Tv () {
		cm.insertText(tp.getSearch(), name);
		System.out.println("--------------------");
	}
	static String name;
	@When("search the Tv by Soutline {string}")
	public void search_the_Tv_by_Soutline(String tv) {
		System.out.println("Ouline");
		tv = name;
		cm.insertText(tp.getSearch(), name);
		System.out.println("--------------------");
	}
	@When("search the Tv by oneDim list")
	public void search_the_Tv_by_oneDim_list(DataTable dataTable) {
		System.out.println("One dim list");
		List<String> list = dataTable.asList();
			name = list.get(0);
			cm.insertText(tp.getSearch(), name);
		System.out.println("--------------------");
	}
	@When("search the Tv by oneDim map")
	public void search_the_Tv_by_oneDim_map(DataTable dataTable) {
		System.out.println("One dim map");
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		name = asMap.get("C");
		cm.insertText(tp.getSearch(), name);
		System.out.println("--------------------");
	} 
	@And("windows handling and select TV")
	public void windows_handling_and_select_TV() {
		
		tp.getSelect().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		cm.windowshandling();
	}

	@And("takescreenshot price details")
	public void takescreenshot_price_details() throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tp.getAddtocart().click();
		Thread.sleep(3000);	
		TakesScreenshot tst = (TakesScreenshot)driver;
		File as = tst.getScreenshotAs(OutputType.FILE);
		File Despath = new File("C:\\Users\\et\\eclipse-workspace\\Cucumberprg\\src\\test\\resources\\TSS\\spec.png");
		FileUtils.copyFile(as, Despath);
	}

	@Then("quit the browser")
	public void quit_the_browser() {
	   driver.quit();
	}
}
