package com.internetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.internetherokuapp.base.SetUp;

import utils.elements;

public class addOrRemoveElement extends SetUp {
	elements ele=new elements();
	public addOrRemoveElement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Add/Remove Elements']")
	private WebElement aORr;
	public void clickaddOrRemoveE()
	{
		elements.Myclick(aORr);
	}
	@FindBy(xpath="//div[@id='content']/h3")
	private WebElement addRemoveHeader;
	public boolean headerPresent()
	{
		return addRemoveHeader.isDisplayed();
		 
	}
	@FindBy(xpath="//div[@class='example']/button[text()='Add Element']")
	private WebElement addElement;
	public void addEle()
	{
		ele.Myclick(addElement);
	}
	@FindBy(xpath="//button[@class='added-manually']")
	private WebElement delete;
	public boolean delteBtnPre()
	{
		return delete.isDisplayed();
	}
	@FindBy(xpath="//a[text()='Elemental Selenium']")
	private WebElement elementalSeleniumPre;
	public boolean EleSelPre()
	{
		return elementalSeleniumPre.isDisplayed();
	}
	@FindBy(xpath="//a[text()='Elemental Selenium']")
	private WebElement elementalSeleniumClick;
	public void EleSelClick()
	{
		ele.Myclear(elementalSeleniumClick);
	}
	
}
