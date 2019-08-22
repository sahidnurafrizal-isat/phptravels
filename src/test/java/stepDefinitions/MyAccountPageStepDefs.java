package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import pageObjectFactories.MyAccountPage;

public class MyAccountPageStepDefs {
	private WebDriver driver = Hooks.getDriver();
	private Logger logger = Hooks.getLogger();
	private WebDriverWait wait = Hooks.getWait();
	private MyAccountPage facMyAccountPage; 
	
	public MyAccountPageStepDefs(){
		facMyAccountPage = new MyAccountPage(driver);
	}
	
	@Then("^User should see \"([^\"]*)\" on heading of My Account page$")
	public void user_should_see_on_heading_of_my_account_page(String arg1) throws Throwable {
		Assert.assertEquals(facMyAccountPage.getHeaderName(), arg1);
	}
}
