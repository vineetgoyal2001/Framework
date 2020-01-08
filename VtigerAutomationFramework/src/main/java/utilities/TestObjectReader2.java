package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestObjectReader2 extends Base{
	public static WebElement element;
	Properties prop;
 	public TestObjectReader2() {
   		File src=new File("PropertyFiles/testobject.properties");
   		
   	  		try {
			FileInputStream fis= new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to get test data>>"+e.getMessage());
		}
	}
//    public String[] getobjectData1(String data) {
//   		String testobjectdata=prop.getProperty(data);
//   		String[] testobjsplit=testobjectdata.split(";");
//   		return testobjsplit;   		   		
//   	}    
//    public String getobjectData(String data) {
//   		String testobjectdata=prop.getProperty(data);
//   			return testobjectdata;   		   		
//   	}   	
   	public String  getobjecttype(String data) {
   	    
   		    String[] testobjsplit=prop.getProperty(data).split(";");
   	       	return testobjsplit[0];     
   	}   	
   	public String  getobjectlocator(String data) {
   	    	String[] testobjsplit=prop.getProperty(data).split(";");
      		return testobjsplit[1];
   	} 	   	
//  	public String getobjectidentifer() {
//  		testobjidentifier=testobjsplit[1];
//  		return testobjidentifier;
//   	   	}
  	
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
					
				default:
					System.out.println("We do not support object identifier");
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   return element;
 	  	}
  	  	  	
  	public String getobjectData2(String data) { 			
   		
  		return prop.getProperty(data);
   	   	}
}
