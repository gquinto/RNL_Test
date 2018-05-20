package actionModule;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.interactions.Actions;

import pageObject.HomePage;
import utility.Constant;
import utility.PageUtil;

public class MenuHeader  extends utility.PageUtil {

	public static void Hover(String menu) throws Exception{

		DOMConfigurator.configure("log4j.xml");
		
		
		switch(menu.toLowerCase()) {
		case "student success" :
			Actions action = new Actions(Constant.driver);
			action.moveToElement(HomePage.objStudentSuccess()).perform();
			Log.info("Hover to " +menu);
			break;
		case "enrollment management":
			Actions action1 = new Actions(Constant.driver);
			action1.moveToElement(HomePage.objEnrollmentManagement()).perform();
			Log.info("Hover to " +menu);
			break;			
		default:
			System.out.println("wrong menu");
		 
		}
	
		PageUtil.takeSnapShot();		
		Log.info("Take a screenshot");
	}
	
	
	
	
	
	
	
	
}
