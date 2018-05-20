package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.Logs;

public class PageUtil {	

	public static Logger Log = Logger.getLogger(Logs.class.getName());
    public static void takeSnapShot() throws Exception{

        //Convert driver object to TakeScreenshot
        TakesScreenshot screenShot = ((TakesScreenshot)Constant.driver);
        //Call getScreenshotAs method to create image file
                File Img = screenShot.getScreenshotAs(OutputType.FILE);
            //Move image file to a new destination
                String FolderName = "TestCase_Sample";
                String ImagePath = System.getProperty("user.dir") + "\\output\\" + FolderName + "\\screenshot" + timestamp() + ".png";
                File objImage=new File(ImagePath);                
                //Copy file at destination
                FileUtils.copyFile(Img, objImage);
    }
    
    public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }    
}
