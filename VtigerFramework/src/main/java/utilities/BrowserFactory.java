package utilities;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class BrowserFactory extends Base{
	
		public void setupBrowser(String browserName) {
			   
			   try {
				switch(browserName)
				   {
				   case "Chrome":
					   	String chromedriver= configobject.getConfigData("chromedriver");
				     	String chrodriverpath=configobject.getConfigData("chromedriverpath");
				     	System.setProperty(chromedriver, chrodriverpath);	
				     	driver=new ChromeDriver();
				     	break;

				   case "Firefox":
					   	String firefoxdriver= configobject.getConfigData("gecodriver");
				     	String firefoxdriverpath=configobject.getConfigData("firefoxdriverpath");
				     	System.setProperty(firefoxdriver, firefoxdriverpath);	
						driver=new FirefoxDriver();
						break;

					default:
						System.out.println("We do not support browser");

					}
			} catch (Exception e) {
				logger.log(Status.FAIL,"Not able to identify the browser");
				Assert.assertTrue(false, "Not able to identify the browser");
			}
				
				driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
				driver.manage().window().maximize();

				    
			     	


		
		
	}}


