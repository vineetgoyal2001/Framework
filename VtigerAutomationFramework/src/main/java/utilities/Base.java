package utilities;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import pages.Home;
import pages.Login;
import pages.Logout;
public class Base {
	public static TestDataReader testdata;
	public static TestObjectReader testobject;
	public static ConfigReader configobject;
	public static WebDriver driver;
	public static BrowserFactory browsername;
	public static Login loginobj;
	public static Logout logoutobj;
	public static GenericMethod genericobj;
	public static Home homeobj;
	public static CaptureScreenShot CSS;
	public static ExtentReports report;
	public static ExtentTest logger;
	public static ExtentHtmlReporter extent;
	public static Excelfunction excelobj;
	public static TestCasesReader testcaseobj;
	public static Keywordlibrary keywordlibraryobj; 
	public static TestCasesSteps testcasestepobj;
	
		
	@BeforeSuite
	public void setup(){ 
	    try {
			testdata=new TestDataReader();
			testobject=new TestObjectReader();
			configobject=new ConfigReader(); 
			genericobj=new GenericMethod();
			browsername=new BrowserFactory();
			loginobj=new Login(); 
			homeobj=new Home();
			excelobj=new Excelfunction();
			testcaseobj=new TestCasesReader();
			keywordlibraryobj=new Keywordlibrary();
			testcasestepobj=new TestCasesSteps();
			CSS=new CaptureScreenShot();
			extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Report/Vtiger"+CSS.getCurrentDateTime()+".html"));
            report=new ExtentReports();
			report.attachReporter(extent);
			} catch (Exception e) {
				logger.log(Status.FAIL,"Not able to create the object");
				Assert.assertTrue(false, "Not able to create the object");
		}}
	
	@BeforeMethod
	public void applicationSetup() {		
	    try {
	    	browsername.setupBrowser(configobject.getConfigData("browser"));
			genericobj.openurl("url");
			} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to setup application");
			Assert.assertTrue(false, "Not able to setup application");
		}
	  }

	@AfterMethod
		public static void tearDownMethod(ITestResult result) {
		String str_SSpath;
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				str_SSpath = CSS.captureScreenshot();
				logger.log(Status.INFO, result.getThrowable());
				logger.fail("Screenshot: ",MediaEntityBuilder.createScreenCaptureFromPath(str_SSpath).build());
				logger.log(Status.INFO, "Closing the browser");
				driver.quit();
				
			} catch (Exception e) {
				logger.log(Status.INFO, "Not able to generate report");
			//	logger.log(Status.FAIL,"Not able to capture screen shot");
			//	Assert.assertTrue(false, "Not able to capture screen shot");
		}}	
}
	@AfterSuite
	public static void finalReport() {
		report.flush();
		//driver.close();
	}	
}
