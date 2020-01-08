package com.vtiger.testcases;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.TestDataReader;
import utilities.TestObjectReader;
public class VtigerSmokeTestCases2 {
	
	public static TestDataReader testdata;
	public static TestObjectReader testobject;
	

    @Test	
	public static void login() throws IOException{
		// TODO Auto-generated method stub
        testdata=new TestDataReader();
        testobject=new TestObjectReader();
     	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.get(testdata.getData("url"));
    //  driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	//	driver.findElement(By.name("user_name")).sendKeys(prop.getProperty("uname"));
	//	WebElement username=driver.findElement(By.name(testobject.getobjectData("user_name")));
	//    username.sendKeys(testdata.getData("uname"));
	//	WebElement password=driver.findElement(By.name(testobject.getobjectData("user_name")));
	//    username.sendKeys(testdata.getData("uname"));
   //	driver.findElement(By.name(prop.getProperty("name"))).sendKeys(testdata.getProperty("uname"));

		
	//	driver.findElement(By.name("user_name")).sendKeys(prop.getProperty("uname"));
	//	driver.findElement(By.name(prop.getProperty("name"))).sendKeys(prop.getProperty("uname"));
	//	driver.findElement(By.name("user_password")).sendKeys(prop.getProperty("pwd"));
	//	driver.findElement(By.name("Login")).click();
	//	String exptest=driver.findElement(By.xpath("//a[text()='Sign Out']")).getText();
	//    String acttest1=prop.getProperty("vallogin");
		
    //	if(exptest.equals(acttest1))
    //  System.out.println("Login is verified successfully");
    //	else
    //		System.out.println("Login verification is failed");	
				
		}}
