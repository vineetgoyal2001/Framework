package utilities;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory2 extends Base{
	
		public void setupBrowser(String browserName) {
		if(browserName.equals("Chrome")) {
			
			String chromedriver= configobject.getConfigData("chromedriver");
	     	String chrodriverpath=configobject.getConfigData("chromedriverpath");
	     	System.setProperty(chromedriver, chrodriverpath);	
	     	driver=new ChromeDriver();



		}
		
		else if(browserName.equals("Firefox")) {
			String firefoxdriver= configobject.getConfigData("gecodriver");
	     	String firefoxdriverpath=configobject.getConfigData("firefoxdriverpath");
	     	System.setProperty(firefoxdriver, firefoxdriverpath);	

			driver=new FirefoxDriver();
			
		}
		
		else
		{
			System.out.println("We do not support browser");
		}
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
		
	}

}
