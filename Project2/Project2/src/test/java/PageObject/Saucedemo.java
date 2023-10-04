package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemo {
	
	WebDriver ldriver;
	public Saucedemo(WebDriver rDriver) 
	{
		ldriver = rDriver;
		
		PageFactory.initElements(rDriver, this);
	}
	@FindBy(id="user-name")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id = "login-button")
	 WebElement login;
	
	//FILTER
	@FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]")
	WebElement Filter;
	
	@FindBy(xpath = "//option[contains(text(),'Price (low to high)')]")
	WebElement SortByPrice;
	
	@FindBy(xpath = "//option[contains(text(),'Name (Z to A)')]")
	WebElement SortByName;
	
	@FindBy(xpath = "//option[contains(text(),'Price (high to low)')]")
	WebElement SortByPriceHighToLow;
	
	//SIDE MENU BAR
	@FindBy(id="react-burger-menu-btn")
	WebElement sideBarMenuBtn;

	@FindBy(id="inventory_sidebar_link")
	WebElement allItems;
	
	@FindBy(id="about_sidebar_link")
	WebElement about;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logOut;
	
	@FindBy(id="reset_sidebar_link")
	WebElement Reset;
	
	public void enterUsername(String user)
	{
		Username.sendKeys(user);
	}
	
	public void enterPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	public void enterLoginBtn(String log)
	{
		login.click();;
	}
	public void clickOnFilter(String filter)
	{
		Filter.click();
	}
	public void sortByPriceLowToHigh()
	{
		SortByPrice.click();
	}
	public void sortByNameZToA() {
		SortByName.click();
	}
	public void SortByPriceHighLow() {
		SortByPriceHighToLow.click();
	}
	public void SideBar() {
		sideBarMenuBtn.click();
	}
	public void ALLitems() {
		allItems.click();
	}
	public void ABout() {
		about.click();
	}
	public void LOGout() {
		logOut.click();
	}
	public void RESETApp() {
		Reset.click();
	}
}
