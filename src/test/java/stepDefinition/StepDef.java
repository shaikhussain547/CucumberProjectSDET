package stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;
import pageObject.VendorsPage;

public class StepDef extends BaseClass{
	
	/*****************Login Feature********************/
	
	@Before
	public void setup() {
		log = LogManager.getLogger("StepDef");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		log.info("Browser Opened");
	}
	
	@After
	public void tearDown() {
		driver.quit();
		log.info("Browser Closed");
	}
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {

		
		loginPage = new LoginPage(driver);
		vendorsPage = new VendorsPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
		loginPage.enterEmail(emailadd);
		loginPage.enterPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		loginPage.clickOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();
		//Assert.assertEquals(expectedTitle, actualTitle);
		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);//pass
		}
		else
		{
			Assert.assertTrue(false);//fail
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		loginPage.clickOnLogOutButton();
	}

	@Then("close browser")
	public void close_browser() {
		//driver.close();
		//driver.quit();
	}
	/*****************Vendors Feature********************/
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
		String expectedHeader = vendorsPage.getPageHeader();
		String actualHeader = "Dashboard";
		if(actualHeader.equals(expectedHeader.trim()))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("User hover to Vendors tab")
	public void user_hover_to_vendors_tab() {
		vendorsPage.hoverOnVendors();
	}

	@When("Click on Search for Vendor")
	public void click_on_search_for_vendor() {
		vendorsPage.clickOnSearchForVendor();
	}

	@Then("User can view Vendors page")
	public void user_can_view_vendors_page() {
		String expectedHeader = vendorsPage.getPageHeader();
		String actualHeader = "Vendors";
		if(actualHeader.equals(expectedHeader.trim()))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("User enter TaxID")
	public void user_enter_tax_id() {
		vendorsPage.enterVendorTaxId("DE763212");
	}

	@When("Click on search")
	public void click_on_search() {
		vendorsPage.clickOnSearchBtn();
	}

	@Then("User can view Vendors search results")
	public void user_can_view_vendors_search_results() {
		String expectedHeader = vendorsPage.getPageHeader();
		String actualHeader = "Vendors - Search Results";
		if(actualHeader.equals(expectedHeader.trim()))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("User extract vendor name")
	public void user_extract_vendor_name() {
		System.out.println(vendorsPage.getVendorName());
	}
	
	@When("Click on Vendor Inventory")
	public void click_on_vendor_inventory() {
		vendorsPage.clickOnVendorInventory();
	}

	@Then("User can view Vendors inventory page")
	public void user_can_view_vendors_inventory_page() {
		String expectedHeader = vendorsPage.getPageHeader();
		String actualHeader = "Vendors - Vendor Inventory";
		if(actualHeader.equals(expectedHeader.trim()))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("User select vendor code from dropdown")
	public void user_select_vendor_code_from_dropdown() {
		vendorsPage.selectVendorCode("IT145632");
	}

	@When("Click on check inventory")
	public void click_on_check_inventory() {
		vendorsPage.clickOnCheckInventory();
	}

	@Then("User can view Vendors inventory results")
	public void user_can_view_vendors_inventory_results() {
		System.out.println(vendorsPage.countOutputRows());
	}
	
	
}
