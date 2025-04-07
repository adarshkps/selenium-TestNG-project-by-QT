package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.internetherokuapp.base.SetUp;

public class mylisteners extends SetUp implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {

		tkscrnsht();
	}
	public void tkscrnsht()
	{
		LocalTime myobj=LocalTime.now();
		String str=myobj.toString();
		String str2=str.replace(":", "");
		String str3=str2.replace(".", "");
		String str4=str3.substring(9);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File file=tk.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./screenshots/scr"+str4+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
	}
	
	
}
