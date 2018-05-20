package testPackage;

import actionModule.LaunchBrowser;
import actionModule.MenuHeader;
import utility.Constant;

public class TestCase_Sample {

	public static void main(String[] args) throws Exception {
		
		
		
		LaunchBrowser.Execute("chrome_grid");		
		MenuHeader.Hover("Student Success");
		
		
		
		Constant.driver.quit();
	}

}
