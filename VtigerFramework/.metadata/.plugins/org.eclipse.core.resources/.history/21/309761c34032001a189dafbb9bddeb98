package pages;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import utilities.Base;

public class Login extends Base {
	
	public void loginToApplication() {
	        	
			try {
				genericobj.setTextboxValue("user_name","uname");
				genericobj.setTextboxValue("pwd_name","pwd");
				genericobj.clickwe("login_name");
				genericobj.validateInnerText("LoginVerification", "vallogin");
				logger.info("Staring Application");
			} catch (Exception e) {
				logger.log(Status.FAIL,"Not able to login");
				Assert.assertTrue(false, "Not able to login");
				}
			}	


	}


