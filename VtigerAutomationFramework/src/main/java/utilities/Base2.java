package utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pages.Login;

public class Base2 {
	
	public static TestDataReader testdata;
	public static TestObjectReader testobject;
	public static ConfigReader configobject;
	public static WebDriver driver;
	public static BrowserFactory browsername;
	public static Login loginobj;
	public static GenericMethod genericobj;
	
	@BeforeSuite
	public void setup(){ 
	    testdata=new TestDataReader();
        testobject=new TestObjectReader();
        configobject=new ConfigReader(); 
        genericobj=new GenericMethod();
        browsername=new BrowserFactory();
        loginobj=new Login();        
	    browsername.setupBrowser(configobject.getConfigData("browser"));
		}
	
	@BeforeMethod
	public void applicationSetup() {		
	    genericobj.openurl("url");
	    loginobj.loginToApplication();
	    
	}
	
	@AfterMethod
	public void teardown() {
		
	   // driver.findElement(By.xpath(testobject.getobjectData("signout_xpath"))).click();
		genericobj.clickwe("signout_xpath");
		//String explogout=genericobj.validateInnerText("signin_xpath").getAttribute("alt");
//	    String explogout=driver.findElement(By.xpath(testobject.getObject("signin_xpath"))).getAttribute("alt");
//		String actlogout=testdata.getData("vallogout");
//		
//	    if(explogout.equals(actlogout))
//			   System.out.println("Logout is verified successfully");
//		else
//			   	System.out.println("Logout verification is failed");	

		
	}
	
}
