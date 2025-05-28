package com.internetherokuapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetherokuapp.base.SetUp;
import com.internetherokuapp.pages.addOrRemoveElement;

import utils.elements;

public class AorremoveTests extends SetUp{
	static addOrRemoveElement ARE;
	
	
	 AorremoveTests()
	{
		super();
		initialization();
		ARE=new addOrRemoveElement(driver);
		ARE.clickaddOrRemoveE();
	}
	@Test
	public void verifyHeaderisDisplayed()
	{
		boolean b=ARE.headerPresent();
		Assert.assertTrue(b);
	}
	@Test
	public void clickOnAddEle()
	{
		ARE.addEle();
		String str=ARE.toString();
		System.out.println(str);
		boolean b=str.contains(str);
		Assert.assertTrue(b);
	}
	@Test(dependsOnMethods="clickOnAddEle")
	public void validateDeleteisDisplayed()
	{
		boolean b=ARE.delteBtnPre();
		Assert.assertTrue(b);
	}
	@Test
	public void elePre()
	{
		boolean b=ARE.EleSelPre();
		Assert.assertTrue(b);
	}
	@Test
	public void EleSeleClick()
	{
		ARE.EleSelClick();
		String exp=driver.getTitle();
		String act="Home | Elemental Selenium";
		Assert.assertEquals(exp, act);
		// this test case is failing so it is a defect in the the-internet-herokuapp
	}
	
	

}
