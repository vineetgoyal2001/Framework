package com.vtiger.testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.TestDataReader;
import utilities.TestObjectReader;
public class VtigerSmokeTestCases3 {
	public static TestDataReader testdata;
	public static TestObjectReader testobject;
	public static  ConfigReader configobject;
	public static WebDriver driver;
	
    @Test(priority=1)	
	public static void login() throws IOException{
		// TODO Auto-generated method stub
        testdata=new TestDataReader();
        testobject=new TestObjectReader();
        configobject=new ConfigReader();       
     	String browser= configobject.getConfigData("chromedriver");
     	String chrpath=configobject.getConfigData("path");
     	System.setProperty(browser, chrpath);
  		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.get(testdata.getData("url"));
		driver.manage().window().maximize();
//		WebElement username=driver.findElement(By.name(testobject.getobjectData("user_name")));
//	    username.sendKeys(testdata.getData("uname"));
//		WebElement password=driver.findElement(By.name(testobject.getobjectData("pwd_name")));
//	    password.sendKeys(testdata.getData("pwd"));
//	    driver.findElement(By.name(testobject.getobjectData("login_name"))).click();
//	    
//		String exptest=driver.findElement(By.xpath(testobject.getobjectData("signout_xpath"))).getText();
//		String acttest1=testdata.getData("vallogin");
//		
//	    if(exptest.equals(acttest1))
//			   System.out.println("Login is verified successfully");
//		else
//			   	System.out.println("Login verification is failed");	
	    
		}
    
 
    		
    		
        }


       
