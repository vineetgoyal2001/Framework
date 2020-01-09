package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Excelfunction {
	
	public static void main(String[] args) throws IOException {
		
		readFile();
	}  
	
	@SuppressWarnings("resource")
	public static void readFile() throws IOException {
		String filepath=System.getProperty("user.dir")+"/Data/filename.txt";
	    BufferedReader br = new BufferedReader(new FileReader(filepath));
	    ArrayList< String >lines = new ArrayList<String>();
	    String newLine;
            while ((newLine = br.readLine()) != null) {
	        System.out.println(newLine);
	        lines.add(newLine);
	    }
	}
}
