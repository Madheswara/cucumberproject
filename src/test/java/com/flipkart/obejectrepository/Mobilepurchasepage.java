package com.flipkart.obejectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.Commanactions;

public class Mobilepurchasepage extends Commanactions{
	
	public Mobilepurchasepage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//button[text()='✕']")
	private WebElement closeicon;
	
	@FindBy(name = "q")
	private WebElement search;

	@FindBy(xpath= "(//div[@class='_4rR01T'])[3]")
	private WebElement selectmobile;
	
	@FindBy(xpath= "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocart;
	
	
	public WebElement getCloseicon() {
		return closeicon;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSelectmobile() {
		return selectmobile;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

}


