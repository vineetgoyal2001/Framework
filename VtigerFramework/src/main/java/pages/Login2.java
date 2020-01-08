package pages;
import utilities.Base;

public class Login2 extends Base {
	
	public void loginToApplication() {
	    genericobj.setTextboxValue("user_name","uname");
	    genericobj.setTextboxValue("pwd_name","pwd");
	    genericobj.clickwe("login_name");
	  // String exptest=genericobj.validateInnerText("signout_xpath").getText();
	    
    	String exptest=testobject.getObject("signout_xpath").getText();
	    String acttest=testdata.getData("vallogin");
	
	    if(exptest.equals(acttest))
			   System.out.println("Login is verified successfully");
		else
			   	System.out.println("Login verification is failed");	


	}

}
