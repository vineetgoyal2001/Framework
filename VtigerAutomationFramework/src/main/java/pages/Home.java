package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Base;

public class Home extends Base {
	
	public void createLeads() {
			genericobj.mouseOver("MarkatingLink_xpath");
			genericobj.clickwe("MarkatingLead_linkText");
			List<WebElement> listrows= driver.findElements(By.xpath("//table[@class='lvt small']//tr"));
			int rowcount=listrows.size();
			List< List<String> > listTabledata=new ArrayList<List <String> >();
				for(int i=0;i<=rowcount-1;i++) {
				WebElement weRow=listrows.get(i);
				List<WebElement> listtd= weRow.findElements(By.tagName("td"));
				List<String> tdDatalist=new ArrayList<String>();
				
				for(int j=0;j<=listtd.size()-1;j++) {
					WebElement tdobj=listtd.get(j);
					String txt=tdobj.getText();
					tdDatalist.add(txt);
					System.out.print(txt+",");				
				}
				listTabledata.add(tdDatalist);
				System.out.println(" ");
			}
			System.out.println(listTabledata.size());
			String[] tabledata=testdata.getData("columnname").split(";");
			    for(int i=0;i<=listTabledata.size()-1;i++) {
	        	List<String> listRowData=listTabledata.get(i);
	        	for(int j=0;j<=listRowData.size()-1;j++) {
	        		listRowData.get(j);    	  
	      	    		
	       	}   	
	        }

	}

}
