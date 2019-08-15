package stepDefinitions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
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
		this.facHomePage = new HomePage(driver);
	}
	
	@Given("^User entered the \"([^\"]*)\" from the Homepage$")
	public void user_entered_the_from_the_homepage(String arg1) {
		switch(arg1) {
		case "User Registration page":{
			facHomePage.btn_MyAccount.click();
			facHomePage.btn_SignUp.click();
			break;
		}
		case "Login page":{
			facHomePage.btn_MyAccount.click();
			facHomePage.btn_Login.click();
			break;
		}
		}
	}
	
	@When("^User clicks on \"([^\"]*)\" button on Homepage$")
	public void click_on_button_on_homepage(String arg1) throws Throwable {
		
		switch(arg1) {
		/* Header */
		case "My Account":{
			facHomePage.btn_MyAccount.click();
			break;
		}
		case "Sign Up":{
			facHomePage.btn_SignUp.click();
			break;
		}
		case "Login":{
			facHomePage.btn_Login.click();
			break;
		}
		
		/* Menu */
		case "Hotels Tab":{
			facHomePage.btn_TabHotels.click();
			break;
		}
		case "Flights Tab":{
			facHomePage.btn_TabFlights.click();
			break;
		}
		case "Tours Tab":{
			facHomePage.btn_TabTours.click();
			break;
		}
		case "Cars Tab":{
			facHomePage.btn_TabCars.click();
			break;
		}
		
		case "City/Hotel Search":{
			facHomePage.btn_CityHotelSearch.click();
			break;
		}
		}
		
		logger.info("PASS - " + arg1 + " clicked succesfully");
	}
	
	@When("^User fills in \"([^\"]*)\" with \"([^\"]*)\" on Homepage$")
	public void i_fill_in_with_on_homepage(String arg1, String arg2) throws Throwable {
		
		switch(arg1) {
		case "City/Hotel Name":{
			facHomePage.btn_CityHotel().click();
			facHomePage.txt_CityHotel.sendKeys(arg2);
			break;
		}
		}
		
	}
	
	@When("^User clicks on \"([^\"]*)\" choice from the \"([^\"]*)\" dropdown on Homepage$")
	public void i_click_on_choice_from_the_dropdown_on_homepage(String arg1, String arg2) throws Throwable{
		
		switch(arg2) {
		case "City/Hotel Name":{
			facHomePage.cityHotelResultOf(Integer.parseInt(arg1)).click();
			break;
		}
		}
	}
	
	@When("^User fills in the \"([^\"]*)\" search with below data:$")
	public void user_fills_in_the_search_with_below_data(String arg1, DataTable table) {
		List<List<String>> data = table.raw();
		
		for(List<String> row:data) {
			switch(row.get(0)) {
			case "Check In":{
				facHomePage.txt_CheckIn.sendKeys(row.get(1));
				break;
			}
			case "Check Out":{
				facHomePage.txt_CheckOut.sendKeys(row.get(1));
				break;
			}
			case "Adult Count":{
				facHomePage.txt_GuestDetails.click();
				wait.until(ExpectedConditions.visibilityOf(facHomePage.txt_GuestAdult));
				facHomePage.txt_GuestAdult.sendKeys(Keys.chord(Keys.CONTROL, "a"), row.get(1));
				facHomePage.txt_GuestDetails.click();
				break;
			}
			case "Child Count":{
				facHomePage.txt_GuestDetails.click();
				wait.until(ExpectedConditions.visibilityOf(facHomePage.txt_GuestChild));
				facHomePage.txt_GuestChild.sendKeys(Keys.chord(Keys.CONTROL, "a"), row.get(1));
				facHomePage.txt_GuestDetails.click();
				break;
			}
			}
		}
	}
}
