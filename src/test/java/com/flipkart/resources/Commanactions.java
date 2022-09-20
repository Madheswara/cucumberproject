package com.flipkart.resources;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commanactions {
	
public static WebDriver driver;
		
	public void launch (String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void insertText(WebElement ele, String value) {
		
		ele.sendKeys(value,Keys.ENTER);
	}
	public void windowshandling() {
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String child : all) {
	    if (!parent.equals(child)) {
	    	driver.switchTo().window(child);	
	    }
		}	}
}
