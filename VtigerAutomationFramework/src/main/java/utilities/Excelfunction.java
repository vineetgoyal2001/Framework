package utilities;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Excelfunction extends Base {
	  
	public  static int getExecutableTestCaseCount() throws IOException {
		String filepath=System.getProperty("user.dir")+"/src/main/resources/TestCases/testcases.csv";
	    @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(filepath));
	    br.readLine();
	    int count=0;
	    String newLine;
            while ((newLine = br.readLine()) != null) {
	        String[] data=newLine.split(",");
	        if(data[0].equals("y")) {
	        	count++;
	        }
	   }return count;        
      }
		
	@SuppressWarnings("resource")
	public static int columnCount() throws IOException {
		String filepath=System.getProperty("user.dir")+"/src/main/resources/TestCases/testcases.csv";
	    BufferedReader br = new BufferedReader(new FileReader(filepath));
         int colcount = 0;
	     String input =br.readLine();
	      String [] columns=input.split(",");   
	      colcount=columns.length;
     	return colcount;
	}

	public static void readFile() throws IOException {
		String filepath=System.getProperty("user.dir")+"/Data/TestData.csv";
	    @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(filepath));
	    ArrayList< String >lines = new ArrayList<String>();
	    String newLine;
            while ((newLine = br.readLine()) != null) {
	        System.out.println(newLine);
	        lines.add(newLine);	        
	   }      
            
	 }
	@SuppressWarnings("resource")
	public static void rowCount() throws IOException {
		
		String filepath=System.getProperty("user.dir")+"/Data/TestData.csv";
	    BufferedReader br = new BufferedReader(new FileReader(filepath));
	     String input;
	     int count = 0;
	     while((input = br.readLine()) != null)
	     {
	         count++;
	     }
	}

	public static void cellVal() throws IOException {
		
		String filepath=System.getProperty("user.dir")+"/Data/testcases.csv";
	    @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(filepath));
	    String line;
	    while ((line = br.readLine()) != null) {
	        // use comma as separator
	        String[] cols = line.split(",");
	        System.out.println(cols[0]);
	    }
	}
}
