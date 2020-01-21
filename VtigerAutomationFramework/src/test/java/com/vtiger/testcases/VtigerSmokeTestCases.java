package com.vtiger.testcases;
import org.testng.annotations.Test;
import utilities.Base;

public class VtigerSmokeTestCases extends Base {
		
	//@Test(priority=1)
	public void createLead()
	{ 
		logger =report.createTest("Create Lead");
		loginobj.loginToApplication();
		logger.pass("Login sucessfully");
		homeobj.createLeads();
		logger.pass("Marketing Leads are created successfully");
		logoutobj.logout();
		logger.pass("Logout successfully");
		driver.quit();
	}
   
	//@Test(priority=2)
	public void leadData()
	{  
		logger =report.createTest("Lead_data");
		loginobj.loginToApplication();
		homeobj.createLeads();
		logoutobj.logout();
		logger.pass("Lead created successfully");
		driver.quit();	
	}
     		
}


       
