package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectFactories.HomePage;

public class HomePageStepDefs {
	private WebDriver driver = Hooks.getDriver();
	private Logger logger = Hooks.getLogger();
	private WebDriverWait wait = Hooks.getWait();
	private HomePage facHomePage;
	
	public HomePageStepDefs() {
		this.facHomePage = PageFactory.initElements(driver, HomePage.class);
	}

	@Given("^I am on the page on URL \"([^\"]*)\"$")
	public void i_am_on_the_page_on_URL(String arg1) throws Throwable {
		driver.get(arg1);
		driver.manage().window().maximize();
		logger.info("PASS - Loaded " + arg1 + " succesfully");
	}

	@Then("^I should see \"([^\"]*)\" on title$")
	public void i_should_see_on_title(String arg1) throws Throwable {
		wait.until(ExpectedConditions.titleIs(arg1));
		logger.info("PASS - String " + arg1 + " detected succesfully");
	}
	
	@When("^I click on \"([^\"]*)\" button on Homepage$")
	public void click_on_button_on_homepage(String arg1) throws Throwable {
		
		switch(arg1) {
		case "My Account":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.btn_MyAccount));
			facHomePage.btn_MyAccount.click();
			logger.info("PASS - " + arg1 + " clicked succesfully");
			break;
		}
		case "Sign Up":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.btn_SignUp));
			facHomePage.btn_SignUp.click();
			logger.info("PASS - " + arg1 + " clicked succesfully");
			break;
		}
		}
	}
}
