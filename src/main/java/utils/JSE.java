package utils;

import org.openqa.selenium.JavascriptExecutor;

import com.internetherokuapp.base.SetUp;

public class JSE extends SetUp {

	public static void scrollpageVertically(int y)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+y+")");
		
	}
	public static void scrollPageHorizontally(int x)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+"0)");
	}
}
