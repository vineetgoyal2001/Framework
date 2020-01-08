package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class TestDataReader extends Base {
	
	Properties prop;
	
   	public TestDataReader() {
   		File src=new File("PropertyFiles/testdata.properties");
   		
   		
   		try {
			FileInputStream fis= new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
			} catch (Exception e) {
				logger.log(Status.FAIL,"Not able to read the test data property File");
				Assert.assertTrue(false, "Not able to read the test data property File");
		}
	}
	
   	public String getData(String data) {
   		
   		String getdata1=null;
		try {
			getdata1 = prop.getProperty(data);
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to get the data");
			Assert.assertTrue(false, "Not able to get the data");
		}
   		
		return getdata1;
   		
   	}
	
	

}
