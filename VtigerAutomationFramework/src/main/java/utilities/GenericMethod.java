package utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class GenericMethod extends Base{

	public void mouseOver(String objkey) {
		try {
			Actions actobj=new Actions(driver);
			actobj.moveToElement(testobject.getObject(objkey)).build().perform();
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to mouse over the element");
			Assert.assertTrue(false, "Not able to mouse over the element");
		}
		}
	


	public void openurl(String val) {
		try {
			driver.get(testdata.getData(val));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.log(Status.FAIL,"Not able to open the url");
			Assert.assertTrue(false, "Not able to open the url");
		}
	}
	
	
	public void closebrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.log(Status.FAIL,"Not able to open the url");
			Assert.assertTrue(false, "Not able to open the url");
		}
	}

	
	 public void validateIsEnabled(String objkey) {
		 try {
			testobject.getObject(objkey).isEnabled();
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to validate the enable element");
			Assert.assertTrue(false, "Not able to input the value");
		}
	 }
	 
	 public void validateIsDisabled(String objkey) {
		 try {
			testobject.getObject(objkey).isDisplayed();
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to input the value");
			Assert.assertTrue(false, "Not able to input the value");
			}
		 	 }
	 public void validateElementIsSelected(String objkey) {
		 try {
			testobject.getObject(objkey).isSelected();
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to select the value");
			Assert.assertTrue(false, "Not able to select the value");
		}
		 	 }
	 
		public void selectByText(String objkey,String datakey) {
			try {
				
				WebElement weColor=testobject.getObject(objkey);
				Select setColor=new Select(weColor);
				setColor.selectByVisibleText(testdata.getData(datakey));
			} catch (Exception e) {
				logger.log(Status.FAIL,"Not able to select the element by text");
				Assert.assertTrue(false, "Not able to select the element by text");
			}
			}
		
		public void selectByValue(String objkey,String datakey) {
			try {
				WebElement weColor=testobject.getObject(objkey);
				Select setColor=new Select(weColor);
				setColor.selectByValue(testdata.getData(datakey));

			} catch (Exception e) {
				logger.log(Status.FAIL,"Not able to select the element by value");
				Assert.assertTrue(false, "Not able to select the element by value");
			}
			}

		
	 public void validateElementPresent(String objkey) {
		 
	 }
	 
	 public void validateElementIsNotPresent() {
		 
	 }

	 public void waitfor() {
		 
	 }

	 public void validateTextValue() {
		 
	 }

	public void clickwe(String objkey) {
		try {
			testobject.getObject(objkey).click();
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to input the value");
			Assert.assertTrue(false, "Not able to input the value");
		}	

	}
	public void clearfield(String objkey) {
		try {
			testobject.getObject(objkey).clear();
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to clear the value");
			Assert.assertTrue(false, "Not able to clear the value");
			}

	}
	
	public void setTextboxValue(String objkey,String datakey) {
		try {
			testobject.getObject(objkey).sendKeys(testdata.getData(datakey));
		} catch (Exception e) {
			//logger.fail("Not able to input the value");
			logger.log(Status.FAIL,"Not able to input the value");
			Assert.assertTrue(false, "Not able to input the value");
			}
	}
	
	
	
	public void validateInnerText(String objkey,String datakey) {
		try {
			String exptest=testobject.getObject(objkey).getText();
			String acttest=testdata.getData(datakey);
			if(exptest.equals(acttest))
			      	System.out.println(objkey+ " Text Verification is passed");
			else
				   	System.out.println(objkey+ " Text Verification is failed");
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to validate the inner text");
			Assert.assertTrue(false, "Not able to validate the inner text");
			}

				}
	
	public void validateGetAttribute(String objkey,String datakey) {
		//testobject.getObject(objkey)
		//driver.findElements(By.xpath(objkey)).isEmpty()
		try {
			String exptest=testobject.getObject(objkey).getAttribute("alt");
			String acttest=testdata.getData(datakey);
			if(exptest.equals(acttest))
			    	System.out.println(objkey+ " Text Verification is passed");
			else
				   	System.out.println(objkey+ " Text Verification is failed");
		} catch (Exception e) {
			logger.log(Status.FAIL,"Not able to validate the attribute");
			Assert.assertTrue(false, "Not able to validate the attribute");
		}
				}

	
}