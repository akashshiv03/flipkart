package flipkart_output;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.base;
import POMCLASS.loginpage;
import Utility.Utility;

public class filpkartOutput extends base
{
	loginpage lp;
	@BeforeClass
	public void openthebrowser() throws InterruptedException
	{
		launchingthe_Browser();
		lp=new loginpage(driver);
		
	}
	@BeforeMethod
	public void logintoflipkart() throws InterruptedException
	{
		lp.clickon_loginbutton();
		Reporter.log("click on the login button", true);
		Utility.threadsleep(20000);		
		lp.enter_mobilenumber();
		Reporter.log("enter mobile nuber", true);
		Utility.threadsleep(6000);
		lp.clickon_requestOTP();
		Reporter.log("click on requestotp", true);
		Utility.threadsleep(3000);

	}
  @Test
  public void validateusername() 
  {
	  Reporter.log("this xyz");
  }
  @AfterMethod
  public void logoutflipkart()
  {
	  
  }
  @AfterClass
  public void closethebrowser() throws InterruptedException, IOException
  {
	  Utility.takescreenshot(driver);
		Utility.threadsleep(1000);
	  closethebrowser();
  }
}
