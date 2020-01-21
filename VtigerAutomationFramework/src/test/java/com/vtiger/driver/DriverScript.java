package com.vtiger.driver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.Base;

public class DriverScript extends Base{
	 
    @DataProvider(name="testcasereader")
	public Object[][] gettestcase() throws Exception {
		
	     return	testcaseobj.readTestCasecsv();		
			
	}
    
    @Test(dataProvider="testcasereader")
    public void testcaseExecute(String FilterKey,String TID,String Value) throws Exception {
    	System.out.println(FilterKey+" "+TID+" "+Value);
    	logger =report.createTest(TID+"_"+Value);
    	testcasestepobj.readTestCaseStepscsv(TID);
    	
    }
	
}
