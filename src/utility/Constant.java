package utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.Logs;

public class Constant {
	
	
	public static WebDriver driver;
	
	public static String url = "https://www.ruffalonl.com/";
	public static String browser = "chrome_grid";
	
	
	
	public static final String Path_Chromedriver =  System.getProperty("user.dir") + "\\jd\\drivers\\chromedriver.exe";
	public static final String Path_IEdriver =  System.getProperty("user.dir") + "\\jd\\drivers\\IEDriverServer.exe";
	public static final String Path_Geckodriver =  System.getProperty("user.dir") + "\\jd\\drivers\\geckodriver.exe";
	
	
	/*Location  of Test Data excel file*/
	public static String Path_TestData =System.getProperty("user.dir") + "\\src\\TestData\\TestData.xlsx";
	
	/*Initial row to get test data*/
	public static int RowNum = 1;

	/*Initial column to get test data DatatableTranspose*/
	public static int ColNum = 1;	
	
	/*LastRow of the excelfile*/
	public static int LastRow;
	
	/*Location of the html report*/
	public static String  Path_Report =System.getProperty("user.dir") + "\\Report\\HTML_Report.html";

	public static Logger Log = Logger.getLogger(Logs.class.getName());

}



