package testPackage;

import org.openqa.selenium.WebDriver;

import actionModule.LaunchBrowser;
import actionModule.MenuHeader;
import utility.Constant;

public class TestCase_Sample {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		
		LaunchBrowser.Execute();		
		MenuHeader.Hover("Student Success");
		
		
		
		Constant.driver.quit();
	}

}
