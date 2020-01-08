package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;

import com.aventstack.extentreports.Status;
public class ConfigReader extends Base{
	
	Properties prop;
 	public ConfigReader() {
   		File src=new File("PropertyFiles/config.properties");
   		
   		
   		try {
			FileInputStream fis= new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
			} catch (Exception e) {
				logger.log(Status.FAIL,"Not able to read  configure property File");
				Assert.assertTrue(false, "Not able to read  configure property File");
		}
	}
	
   	public String getConfigData(String data) {
   		
   		
		return prop.getProperty(data);
   		
   	}


}
