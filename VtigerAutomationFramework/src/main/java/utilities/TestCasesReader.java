package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestCasesReader extends Base{
	
	public static void main(String[] args) throws IOException {
		readTestCasecsv1();
		
	}
	
	
	public static Object[][] readTestCasecsv() throws IOException{
		int rownum=0;
		String[] data;
		int rowcount=Excelfunction.getExecutableTestCaseCount();
		int columncount =Excelfunction.columnCount();
		Object[][] arr=new Object[rowcount][columncount]; 
		String filepath=System.getProperty("user.dir")+"/src/main/resources/TestCases/testcases.csv";
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		br.readLine();
		String newLine;
	        while ((newLine = br.readLine()) != null) 
		   {	data = newLine.split(",");
		        if(data[0]=="y") 
			    {for(int column=0;column<columncount;column++) 
				{
					arr[rownum][column]=data[column];
	          		}       
				rownum++;			}
			newLine=null;
			data =null;
		} 
		br.close();
		return arr;	}
	
	
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
