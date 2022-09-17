package com.flipkart.stepdefinition;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TvpurchaseSetup {
	static WebDriver driver;
	@Given("user enter the search URL")
	public void user_enter_the_search_URL() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("user login the page")
	public void user_login_the_page() {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	}
	
	@When("search the Tv")
	public void search_the_Tv () {
		WebElement findElement = driver.findElement(By.name("q"));
		findElement.sendKeys("mi tv",Keys.ENTER);
		System.out.println("--------------------");
	}
	static String name;
	@When("search the Tv {string}")
	public void search_the_Tv(String tv) {
		System.out.println("string input");
		tv = name;
		WebElement findElement = driver.findElement(By.name("q"));
		findElement.sendKeys(tv,Keys.ENTER);
		System.out.println("--------------------");
	}
	@When("search the Tv by oneDim list")
	public void search_the_Tv_by_oneDim_list(DataTable dataTable) {
		System.out.println("One dim list");
		List<String> list = dataTable.asList();
		for (int i = 0; i < list.size(); i++) {
			name = list.get(i);
		}
		WebElement findElement = driver.findElement(By.name("q"));
		findElement.sendKeys(name,Keys.ENTER);
		System.out.println("--------------------");
	}
	@When("search the Tv by oneDim map")
	public void search_the_Tv_by_oneDim_map(DataTable dataTable) {
		System.out.println("One dim map");
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		name = asMap.get("A");
		WebElement findElement = driver.findElement(By.name("q"));
		findElement.sendKeys(name,Keys.ENTER);
		System.out.println("--------------------");
	}
	@And("windows handling and select TV")
	public void windows_handling_and_select_TV() {
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String child : all) {
	    if (!parent.equals(child)) {
		driver.switchTo().window(child);	
	    }
		}
	}

	@And("takescreenshot price details")
	public void takescreenshot_price_details() throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element3 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		element3.click();
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
