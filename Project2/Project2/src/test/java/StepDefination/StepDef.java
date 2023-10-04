package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import PageObject.Saucedemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	public WebDriver driver;
	public Saucedemo loginPg;
	
	@Given("user is on login page URL {string}")
	public void user_is_on_login_page_url(String url) {
		WebDriverManager.chromedriver().setup();
	    System.setProperty("webdriver.chrome.driver", "C://Users//SNEGHAL//Downloads//chromedriver.exe");
	    driver = new ChromeDriver();
	    loginPg = new Saucedemo(driver);
	    driver.get(url);
	    try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String userName) {
		loginPg.enterUsername(userName);
	    try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String pass) {
		loginPg.enterPassword(pass);
		   try {
		    	Thread.sleep(5000);
		    }
		    catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPg.enterLoginBtn(null);
		try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	   
	}

	@Then("user is on the home page URL {string}")
	public void user_is_on_the_home_page_url(String expUrl) {
		//String actualUrl = driver.getTitle();
		/*
		if(actualUrl.equals(expUrl)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		//driver.get(expUrl);
		 */
		try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}
	
	@When("user clicks on filter button")
	public void user_clicks_on_filter_button() {
		loginPg.clickOnFilter(null);
		try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	@When("user select price\\(low to high) option")
	public void user_select_price_low_to_high_option() {
		loginPg.sortByPriceLowToHigh();
		try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	@When("user select name\\(Z to A) option")
	public void user_select_name_z_to_a_option() {
	    loginPg.sortByNameZToA();
	    try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	@When("user select price\\(high to low) option")
	public void user_select_price_high_to_low_option() {
	    loginPg.SortByPriceHighLow();
	    try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}
	
	///////
	@When("user click on side menu bar")
	public void user_click_on_side_menu_bar() {
		
		loginPg.SideBar();
		try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	@When("user select all items")
	public void user_select_all_items() {
		loginPg.ALLitems();
		try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	@Then("user is on inventory page URL {string}")
	public void user_is_on_inventory_page_url(String string) {
		try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	@When("user select Reset App State")
	public void user_select_reset_app_state() {
		loginPg.RESETApp();
		try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	@When("user select Logout")
	public void user_select_logout() {
		loginPg.LOGout();
		try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	
	@When("user select on About")
	public void user_select_on_about() {
		loginPg.ABout();
		try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	@Then("user is on about page URL {string}")
	public void user_is_on_about_page_url(String string) {
		try {
	    	Thread.sleep(5000);
	    }
	    catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

}
