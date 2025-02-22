package stepDefinition;


import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObject.LoginPage;
import pageObject.VendorsPage;

/**Parent class*/
public class BaseClass {
	
	public WebDriver driver;
	public LoginPage loginPage;
	public VendorsPage vendorsPage;
	public static Logger log;
	public Properties readConfig;
	
	
	
	
	
}
