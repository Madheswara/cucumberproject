
package com.flipkart.obejectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.Commanactions;

public class Tvpurchasepage extends Commanactions{
	
	public Tvpurchasepage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	private WebElement search;
	
	@FindBy(xpath = "//button[contains(text(),'✕')")
	private WebElement closeicon;
	
	@FindBy(xpath = "(//div[@class='_4rR01T'])[3]")
	private WebElement select;
	
	@FindBy(xpath = "/button[@class='_2KpZ6l _2U9uOA _3v1-ww']\")")
	private WebElement addtocart;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getCloseicon() {
		return closeicon;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

}
