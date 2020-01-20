package pages;
import org.testng.Assert;
import com.aventstack.extentreports.Status;
import utilities.Base;

public class Logout extends Base {
	
	public void logout() {
		   //first
		try {
			genericobj.clickwe("signout_xpath");
			genericobj.clearfield("user_name");
			String explogout=testobject.getObject("LogoutVerification").getAttribute("alt");
			String actlogout=testdata.getData("vallogout");
			if(explogout.equals(actlogout))
				   System.out.println("Logout is verified successfully");
			else
				   	System.out.println("Logout verification is failed");
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to logout");
			Assert.assertTrue(false, "Not able to logout");
		}	
	}}


