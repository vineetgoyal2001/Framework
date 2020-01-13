package utilities;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Excelfunction {
	
   public static void main(String[] args) throws IOException {
	
 	  // readFile();
	  //  rowCount();
	     columnCount();
	  //   cellVal();
}
	
	
	@SuppressWarnings("resource")
	
	public static void readFile() throws IOException {
		String filepath=System.getProperty("user.dir")+"/Data/TestData.csv";
	    BufferedReader br = new BufferedReader(new FileReader(filepath));
	    ArrayList< String >lines = new ArrayList<String>();
	    String newLine;
            while ((newLine = br.readLine()) != null) {
	        System.out.println(newLine);
	        lines.add(newLine);	        
	   }
            
            
	 }
	public static void rowCount() throws IOException {
		
		String filepath=System.getProperty("user.dir")+"/Data/TestData.csv";
	    BufferedReader br = new BufferedReader(new FileReader(filepath));
	     String input;
	     int count = 0;
	     while((input = br.readLine()) != null)
	     {
	         count++;
	     }

	     System.out.println("Count : "+count);
	}
	
	public static void columnCount() throws IOException {
		
		String filepath=System.getProperty("user.dir")+"/Data/TestData.csv";
	    BufferedReader br = new BufferedReader(new FileReader(filepath));

	     int colcount = 0;
	     
	     String input =br.readLine();
	     
	      String [] columns=input.split(",");   
	      colcount=columns.length;
	      System.out.println("Count : "+colcount);
	}

	public static void cellVal() throws IOException {
		
		String filepath=System.getProperty("user.dir")+"/Data/TestData.csv";
	    BufferedReader br = new BufferedReader(new FileReader(filepath));
	    String line;
	    while ((line = br.readLine()) != null) {
	        // use comma as separator
	        String[] cols = line.split(line);
	        System.out.println("Coulmn 4= " + cols[4] + " , Column 5=" + cols[5]);
	    }
	}

	
}
