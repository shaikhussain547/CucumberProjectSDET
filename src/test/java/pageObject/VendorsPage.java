package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VendorsPage {
	
	WebDriver ldriver;

	public VendorsPage(WebDriver rDriver)
	{
		ldriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	//Find web elements on the web page
	@FindBy(xpath="//h1[@class='page-header']")	 
	WebElement pageHeader;

	@FindBy(xpath="//*[text()=' Vendors']")
	WebElement btnVendors;

	@FindBy(linkText  = "Search for Vendor")	 
	WebElement btnSearchForVendor;

	@FindBy(id = "vendorTaxID")
	WebElement txtVendorTaxId;

	@FindBy(xpath = "//button[text()='Search']")
	WebElement btnSearch;

	@FindBy(xpath = "//table/tbody/tr[2]/td[1]")
	WebElement txtVendor;
	
	@FindBy(linkText = "Vendor Inventory")
	WebElement btnVendorInventory;
	
	@FindBy(id = "vendorTaxId")
	WebElement btnVendorCode;
	
	@FindBy(id = "buttonOrder")
	WebElement btnCheckInventory;
	
	@FindBy(xpath = "//table/tbody/tr")
	List<WebElement> tableRows;

	//Actions Methods for web elements
	
	public String getPageHeader()
	{
		return pageHeader.getText();
	}

	public void hoverOnVendors() {
		Actions action = new Actions(ldriver);
		action.moveToElement(btnVendors).build().perform();
	}

	public void clickOnSearchForVendor() {
		btnSearchForVendor.click();
	}

	public void enterVendorTaxId(String vendorTaxId)
	{
		txtVendorTaxId.sendKeys(vendorTaxId);
	}
	
	public void clickOnSearchBtn() {
		btnSearch.click();
	}
	
	public String getVendorName() {
		String vendorName = txtVendor.getText();
		return vendorName;
	}
	
	public void clickOnVendorInventory() {
		btnVendorInventory.click();
	}
	
	public void selectVendorCode(String code) {
		Select select = new Select(btnVendorCode);
		select.selectByValue(code);
	}
	
	public void clickOnCheckInventory() {
		btnCheckInventory.click();
	}
	
	public int countOutputRows() {
		return tableRows.size();
	}
	
}
