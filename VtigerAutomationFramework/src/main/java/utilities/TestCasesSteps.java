package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestCasesSteps extends Base{
	  public static  String[] str_data;		
	  public static BufferedReader br=null;
      public void readTestCaseStepscsv(String TID) throws IOException{
		
		
		String filepath=System.getProperty("user.dir")+"/src/main/resources/TestCases/testcasesteps.csv";
		br = new BufferedReader(new FileReader(filepath));
	
			br.readLine();
			String str_newLine;
			    
			    while ((str_newLine = br.readLine()) != null) 
			   {	str_data = str_newLine.split(",");
			        if(str_data[0].equalsIgnoreCase(TID)) 
				    {
			        	while(str_data[2].length()>0) {
			        		keywordlibraryobj.executeAction(str_data[2], str_data[3], str_data[4]);
			        		str_newLine=null;
			        		str_data=null;
			        		
			        		if((str_newLine=br.readLine())==null) {
			        			break;
			        		}
			         		if(str_newLine.isEmpty()) {
			        			break;
			        		}

			        		str_data=str_newLine.split(",");
			        	} break;
				    }
		        	
	    	}	
		
			    br.close();
		
   }
}
