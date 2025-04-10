package com.internetherokuapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetherokuapp.base.SetUp;
import com.internetherokuapp.pages.addOrRemoveElement;

public class AorremoveTests extends SetUp{
	static addOrRemoveElement ARE;
	public AorremoveTests()
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
	
	

	
}
