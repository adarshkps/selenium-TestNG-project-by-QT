package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static Select sel;

	public static void SelectByText(WebElement ele,String text)
	{
		sel=new Select(ele);
		sel.selectByVisibleText(text);
		
	}
	public static void SelectByIndex(WebElement ele,int index)
	{
		sel=new Select(ele);
		sel.selectByIndex(index);
	}
	public static void SelectByValue(WebElement ele,String val)
	{
		sel=new Select (ele);
		sel.selectByValue(val);
	}
	

}
