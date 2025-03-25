package com.internetherokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.internetherokuapp.base.SetUp;

public class ABTestPage extends SetUp {
	public ABTestPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='A/B Testing']")
	private WebElement ABtestlink;
	public void clickOnABtestlink()
	{
		ABtestlink.click();
	}
	@FindBy(xpath="//div[@class='example']/h3")
	private WebElement header;
	public String getHeader()
	{
		return header.getText();
	}
//	@FindBy(xpath="//h3[text()='A/B Test Control']/following-sibling::p")
//	private WebElement paragraphStartsWith;
//	public void getParagraphStartsWith()
//	{
//		
//	}
	
}
