package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class TestObjectReader extends Base{
	public static WebElement element;
	Properties prop;
 	public TestObjectReader() {
   		File src=new File("PropertyFiles/testobject.properties");
   		
   	  		try {
			FileInputStream fis= new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
			} catch (Exception e) {
				logger.log(Status.FAIL,"Not able to read test object property File");
				Assert.assertTrue(false, "Not able to read test object property File");
		}
	}
   	public String  getobjecttype(String data) {
   		String[] testobjsplit=null;
   	    
   		    try {
				testobjsplit=prop.getProperty(data).split(";");
				
			} catch (Exception e) {
				logger.log(Status.FAIL,"Not able to get object type");
				Assert.assertTrue(false, "Not able to get object type");
			}  return testobjsplit[0];   
   	}   	
   	public String  getobjectlocator(String data) {
   		String[] testobjsplit=null;
   	    	try {
				testobjsplit=prop.getProperty(data).split(";");
				
			} catch (Exception e) {
				logger.log(Status.FAIL,"Not able to get object locator");
				Assert.assertTrue(false, "Not able to get object locator");
			}
   	    	return testobjsplit[1];
   	} 	   	

   	public WebElement getObject(String data) {
  	  		  
          String objecttype= getobjecttype(data); 	
        
 
		   try {
			switch(objecttype.toUpperCase())
			   {
			   case "XPATH":	
				    element =driver.findElement(By.xpath(getobjectlocator(data)));		         
			     	break;

			   case "ID":
				   element =driver.findElement(By.id(getobjectlocator(data)));
					break;
			   
			   case "NAME":
				   element =driver.findElement(By.name(getobjectlocator(data)));
					break;
			
			   case "CLASSNAME":
				   element =driver.findElement(By.className(getobjectlocator(data)));
					break;	
					
			   case "LINKTEXT":
				   element =driver.findElement(By.linkText(getobjectlocator(data)));
					break;	
					
			   case "ALT":
				   element =driver.findElement(By.linkText(getobjectlocator(data)));
					break;		
						}
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to identify the object");
			Assert.assertTrue(false, "Not able to identify the object");
		}
		   return element;
 	  	}
  	  	  	
}
