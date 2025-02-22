package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rDriver)
	{
		ldriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement LoginBtn;
	
	
	@FindBy(linkText = "Log Out")
	WebElement logout;
	
	public void enterEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		LoginBtn.click();
	}
	
	public void clickOnLogOutButton()
	{
		logout.click();
	}
	
}
