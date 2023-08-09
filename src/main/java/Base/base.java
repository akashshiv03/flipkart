package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Utility;

public class base 
{
	public WebDriver driver;
	public void launchingthe_Browser() throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  Utility.implicitywait(driver, 1000);
	  driver.manage().window().maximize();	  
	}
	public void closethe_Browser() throws InterruptedException
	{
		Utility.threadsleep(1000);
		driver.close();
	}

}
