package com.internetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.internetherokuapp.base.SetUp;

import utils.elements;

public class ABTestPage extends SetUp {
	public ABTestPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='A/B Testing']")
	private WebElement ABtestlink;
	public void clickOnABtestlink()
	{
		elements.Myclick(ABtestlink);
	}
	@FindBy(xpath="//div[@class='example']/h3")
	private WebElement header;
	public String getHeader()
	{
		return header.getText();
	}
	@FindBy(xpath="//h3[text()='A/B Test Control']/following-sibling::p")
	private WebElement paragraph;
	
	public String getPara()
	{
		return paragraph.getText();
	}
	@FindBy(xpath="//a[text()='Elemental Selenium']")
	private WebElement eleSelenium;
	public boolean eleSelenium()
	{
		return eleSelenium.isDisplayed();
	}
	
}
