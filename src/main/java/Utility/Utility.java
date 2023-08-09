package Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	public static void takescreenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\eclipse-workspace\\flipkart\\screenshot\\1.png");
		FileHandler.copy(src, dest);
	}
	public static void implicitywait(WebDriver driver,int time) throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public static void explicitywait(WebDriver driver, WebElement element, int time)
	{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	 wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void threadsleep(int time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	

}
