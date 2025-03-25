package com.internetherokuapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.internetherokuapp.base.SetUp;
import com.internetherokuapp.pages.ABTestPage;

public class ABTests extends SetUp {
	ABTestPage abtest;
	public ABTests()
	{
		initialization();
		abtest =new ABTestPage(driver);
		
	}
	@Test
	public void test1()
	{
		
		abtest.clickOnABtestlink();
		String act=abtest.getHeader();
		act.startsWith("A/B Test");
		Assert.assertEquals(act,"A/B Test Control");
//		String act2=abtest.getParagraphStartsWith();
//		Assert.assertEquals(act2,"Also known as split testing");
	}

}
