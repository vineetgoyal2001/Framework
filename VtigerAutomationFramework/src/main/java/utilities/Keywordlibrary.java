package utilities;

public class Keywordlibrary extends Base{

	public void executeAction(String Actionkey,String Objectkey,String Valuekey) {
		
		switch(Actionkey.toUpperCase()) {
		
		case "OPENURL":{
			genericobj.openurl(Valuekey);
			break;
		}
		
		case "CLOSEBROWSER":{
			genericobj.closebrowser();
			break;
		}

			
		case "CLICK":{
			break;
		}
		
		case "SETTEXT":{
		
			break;
		}
		
		
	
}}}
