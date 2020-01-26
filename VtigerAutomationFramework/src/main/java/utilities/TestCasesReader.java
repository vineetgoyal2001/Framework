package utilities;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class TestCasesReader extends Base{
	
		public Object[][] readTestCasecsv() throws IOException{
		int rownum=0;
		String[] data;
		Object[][] arr;
		BufferedReader br;
		
		int rowcount=Excelfunction.getExecutableTestCaseCount();
		int columncount =Excelfunction.columnCount();
		arr = new Object[rowcount][columncount]; 
		String filepath=System.getProperty("user.dir")+"/src/main/resources/TestCases/testcases.csv";
		br = new BufferedReader(new FileReader(filepath));

		try {
			br.readLine();
			String newLine;
			    while ((newLine = br.readLine()) != null) 
			   {	data = newLine.split(",");
			        if(data[0].equalsIgnoreCase("y")) 
				    {for(int column=0;column<columncount;column++) 
					{
						arr[rownum][column]=data[column];
			      		}       
					rownum++;			}
				newLine=null;
				data =null;
			}
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to read test cases");
			Assert.assertTrue(false, "Not able to read test cases");
		} 
		br.close();
		return arr;	
		}	
		
	public static Object[][] readTestCasecsv1() throws IOException{
		int rowcount=Excelfunction.getExecutableTestCaseCount();
		int columncount=Excelfunction.columnCount();			
		Object[][] arr=new Object[rowcount][rowcount]; 
		String filepath=System.getProperty("user.dir")+"/src/main/resources/TestCases/testcases.csv";
		BufferedReader br = new BufferedReader(new FileReader(filepath));
	    br.readLine();
	    String newLine;
        while ((newLine = br.readLine()) != null) {
	        System.out.println(newLine);
	   	  }  
        
        int rownum=0;
        for(int column=0;column<columncount;column++  ) {
	        if(newLine=="y") {
	        	System.out.println(newLine);
            rownum++;
          }       
        }
		return arr;
	   }
}
