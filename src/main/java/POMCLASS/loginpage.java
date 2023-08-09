package POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage 
{
	@FindBy(xpath="//a[text()='Login']")private WebElement loginbutton;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement mobilenumber;
	@FindBy(xpath="//button[text()='Request OTP']")private WebElement requestOTP;
	
	public  loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickon_loginbutton()
	{
		loginbutton.click();
	}
	public void enter_mobilenumber()
	{
		mobilenumber.sendKeys("9579786718");
	}
	public void clickon_requestOTP()
	{
		requestOTP.click();
	}

}
