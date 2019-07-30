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
			break;
		}
		case "Sign Up":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.btn_SignUp));
			facHomePage.btn_SignUp.click();
			break;
		}
		
		case "Hotels Tab":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.btn_TabHotels));
			facHomePage.btn_TabHotels.click();
			break;
		}
		case "Flights Tab":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.btn_TabFlights));
			facHomePage.btn_TabFlights.click();
			break;
		}
		case "Tours Tab":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.btn_TabTours));
			facHomePage.btn_TabTours.click();
			break;
		}
		case "Cars Tab":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.btn_TabCars));
			facHomePage.btn_TabCars.click();
			break;
		}
		
		case "City/Hotel Name":{
			facHomePage.btn_CityHotel().click();
			break;
		}
		case "Guest Details":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.txt_GuestDetails));
			facHomePage.txt_GuestDetails.click();
			break;
		}
		case "City/Hotel Search Button":{
			facHomePage.btn_CityHotelSearch.click();
			break;
		}
		}
		
		logger.info("PASS - " + arg1 + " clicked succesfully");
	}
	
	@When("^I fill in \"([^\"]*)\" with \"([^\"]*)\" on Homepage$")
	public void i_fill_in_with_on_homepage(String arg1, String arg2) throws Throwable {
		
		switch(arg1) {
		case "City/Hotel Name":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.txt_CityHotel));
			facHomePage.txt_CityHotel.sendKeys(arg2);
			break;
		}
		case "Check In":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.txt_CheckIn));
			facHomePage.txt_CheckIn.sendKeys(arg2);
			break;
		}
		case "Check Out":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.txt_CheckOut));
			facHomePage.txt_CheckOut.sendKeys(arg2);
			break;
		}
		case "Guest Adult Count":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.txt_GuestAdult));
			facHomePage.txt_GuestAdult.sendKeys(arg2);
			break;
		}
		case "Guest Child Count":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.txt_GuestChild));
			facHomePage.txt_GuestChild.sendKeys(arg2);
			break;
		}
		}
		
	}
	
	@When("^I click on \"([^\"]*)\" choice from the \"([^\"]*)\" dropdown on Homepage$")
	public void i_click_on_choice_from_the_dropdown_on_homepage(String arg1, String arg2) throws Throwable{
		
		switch(arg2) {
		case "City/Hotel Name":{
			wait.until(ExpectedConditions.visibilityOf(facHomePage.cityHotelResultArea));
			facHomePage.cityHotelResultOf(Integer.parseInt(arg1)).click();
			break;
		}
		}
	
		Thread.sleep(3000);
	}
}
