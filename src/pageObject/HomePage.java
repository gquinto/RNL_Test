package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.Constant;

public class HomePage {
	
	
	private static WebElement element = null;
	
	public static WebElement objEnrollmentManagement() throws InterruptedException {			
		By Locator = By.xpath("//em[contains(text(),'Enrollment Management')]");
		element = Constant.driver.findElement(Locator);
		return element;		
	}	
	
	public static WebElement objStudentSuccess() throws InterruptedException {			
		By Locator = By.xpath("//em[contains(text(),'Student Success')]");
		element = Constant.driver.findElement(Locator);
		return element;		
	}	
	
	
	
}
