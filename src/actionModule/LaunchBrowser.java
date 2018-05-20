package actionModule;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utility.Constant;

public class LaunchBrowser extends utility.PageUtil{

	public static WebDriver driver = null;
	public static void Execute(String Browser) throws Exception {

		DOMConfigurator.configure("log4j.xml");
		Log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", Constant.Path_Chromedriver);
			  driver = new ChromeDriver();
		  } else if (Browser.equalsIgnoreCase("ie")) {
			  System.setProperty("webdriver.ie.driver", Constant.Path_IEdriver);
			  driver = new InternetExplorerDriver();
		  } else if (Browser.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver", Constant.Path_Geckodriver);
			  driver =new FirefoxDriver();
		  }
		Constant.browser=Browser;	
     	Constant.driver = driver;
     	Log.info("Instantiate browser - " + Constant.browser);
     	     	
     	driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
     	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
     	driver.get(Constant.url);
     	Log.info("Navigate to URL - " + Constant.url);
		driver.manage().window().maximize();
		Log.info("Maximized the browser");
	}
	
}
