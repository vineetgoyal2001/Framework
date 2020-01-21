package utilities;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class Keywordlibrary extends Base{

	public  void executeAction(String Actionkey,String Objectkey,String Valuekey) {
		
		try {
			switch(Actionkey.toUpperCase()) {
			
			case "OPENURL":{
				genericobj.openurl(Valuekey);
				break;
			}
			
			case "CLOSEBROWSER":{
				genericobj.closebrowser();
				break;
			}

				
			case "CLICK":{
				break;
			}
			
			case "SETTEXT":{
			
				break;
			}		
}
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to read test steps");
			Assert.assertTrue(false, "Not able to read test steps");
		}
		}
	
}
