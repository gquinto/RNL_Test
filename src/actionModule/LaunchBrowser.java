package actionModule;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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
		  } else if (Browser.equalsIgnoreCase("chrome_grid")) { 
			  
			  DesiredCapabilities capability = DesiredCapabilities.chrome();
			  capability.setBrowserName("chrome");
			  capability.setPlatform(Platform.VISTA);
			  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.104:5566/wd/hub"), capability);	
			  Constant.driver = driver;
		  } else if (Browser.equalsIgnoreCase("firefox_grid")) { 
			  
			  DesiredCapabilities capability = DesiredCapabilities.firefox();
			  capability.setBrowserName("firefox");
			  capability.setPlatform(Platform.VISTA);
			  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.11:5566/wd/hub"), capability);	
			  Constant.driver = driver;
		  } else if (Browser.equalsIgnoreCase("ie_grid")) { 
			  
			  DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
			  capability.setBrowserName("iexplore");
			  capability.setPlatform(Platform.WINDOWS);
			  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.11:5566/wd/hub"), capability);	
			  Constant.driver = driver;
		  }
		
		
		
		
		
		
		
		Constant.browser=Browser;	
     	Constant.driver = driver;
     	Log.info("Instantiate browser - " + Constant.browser);
     	     	
     	driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
     	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
     	Constant.driver.get(Constant.url);
     	Log.info("Navigate to URL - " + Constant.url);
     	driver.manage().window().maximize();
		Log.info("Maximized the browser");
	}
	
}
