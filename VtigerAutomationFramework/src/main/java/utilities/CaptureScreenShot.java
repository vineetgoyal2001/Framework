package utilities;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class CaptureScreenShot extends Base{
	
	public String captureScreenshot()  {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String srcPath=System.getProperty("user.dir")+"/Screenshots/"+getCurrentDateTime() +".png";
		try {
			
			FileHandler.copy(src,new File(srcPath));
			//need to convert in base64
						
			System.out.println("Screenshot captured");
			
		} catch (IOException e) {
			logger.log(Status.FAIL,"Not able to capture screen shot");
			Assert.assertTrue(false, "Not able to capture screen shot");
		}
		return srcPath;
		
	}
	
	public String getCurrentDateTime() {
		
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate= new Date();
		return customFormat.format(currentDate);
		
		
	}

	

}
