package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectFactories.BookingPage;
import stepDefinitions.Hooks;

public class BookingPageStepDefs {
	private WebDriver driver = Hooks.getDriver();
	private WebDriverWait wait = Hooks.getWait();
	private Logger logger = Hooks.getLogger();
	private BookingPage facBookingPage;
	private Actions actions;
	
	public BookingPageStepDefs() {
		facBookingPage = new BookingPage(driver);
		actions = new Actions(driver);
	}
	
	@Then("^I should see \"([^\"]*)\" on Booking Information page$")
	public void i_should_see_on_Booking_Information_page(String arg1) throws Throwable {
		switch(arg1) {
		case "Booking Information":{
			wait.until(ExpectedConditions.visibilityOf(facBookingPage.txt_BookingInformation));
		    Assert.assertTrue(facBookingPage.txt_BookingInformation.getText().equals(arg1));
			break;
		}
		case "Booking Summary":{
			wait.until(ExpectedConditions.visibilityOf(facBookingPage.txt_BookingSummary));
		    Assert.assertTrue(facBookingPage.txt_BookingSummary.getText().equals(arg1));
			break;
		}
		}
	}
	
	@Then("^I should not see any error messages$")
	public void i_should_not_see_any_error_messages() throws Throwable {
		// Wait for any alerts
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			Thread.sleep(5000);
			throw new RuntimeException("FAIL - Alert is present!");
		}catch(TimeoutException ex) {
			logger.info("PASS - No alerts present!");
		}
	}
	
	@Then("^I should see \"([^\"]*)\" on \"([^\"]*)\" on Booking Information page$")
	public void i_should_see_on_on_Booking_Information_page(String arg1, String arg2) throws Throwable {
	    switch(arg2) {
	    case"Booking Summary Hotel Name":{
	    	Assert.assertTrue(facBookingPage.BookingSummary_HotelName.getText().equals(arg1));
	    	break;
	    }
	    case"Booking Summary Check In Date":{
	    	Assert.assertTrue(facBookingPage.BookingSummary_CheckInDate.getText().equals(arg1));
	    	break;
	    }
	    case"Booking Summary Check Out Date":{
	    	Assert.assertTrue(facBookingPage.BookingSummary_CheckOutDate.getText().equals(arg1));
	    	break;
	    }
	    case"Booking Summary Number of Nights":{
	    	Assert.assertTrue(facBookingPage.BookingSummary_NumOfNights.getText().equals(arg1));
	    	break;
	    }
	    case"Booking Summary Number of Rooms":{
	    	Assert.assertTrue(facBookingPage.BookingSummary_NumOfRooms.getText().equals(arg1));
	    	break;
	    }
	    }
	}
	
	@When("^I click on \"([^\"]*)\" button on Booking Information page$")
	public void i_click_on_button_on_Booking_Information_page(String arg1) throws Throwable {
	    switch(arg1) {
	    case "Guest Booking":{
	    	wait.until(ExpectedConditions.visibilityOf(facBookingPage.btn_GuestBooking));
	    	facBookingPage.btn_GuestBooking.click();
	    	break;
	    }
	    case "Complete Booking":{
	    	wait.until(ExpectedConditions.visibilityOf(facBookingPage.btn_CompleteBooking));
	    	actions.moveToElement(facBookingPage.btn_CompleteBooking).doubleClick().perform();
	    	break;
	    }
	    }
	}

	@When("^I fill in \"([^\"]*)\" with \"([^\"]*)\" on Booking Information page$")
	public void i_fill_in_with_on_Booking_Information_page(String arg1, String arg2) throws Throwable {
	    switch(arg1) {
	    case "First Name":{
	    	wait.until(ExpectedConditions.visibilityOf(facBookingPage.txt_FirstName));
	    	facBookingPage.txt_FirstName.sendKeys(arg2);
	    	break;
	    }
	    case "Last Name":{
	    	wait.until(ExpectedConditions.visibilityOf(facBookingPage.txt_LastName));
	    	facBookingPage.txt_LastName.sendKeys(arg2);
	    	break;
	    }
	    case "Email":{
	    	wait.until(ExpectedConditions.visibilityOf(facBookingPage.txt_Email));
	    	facBookingPage.txt_Email.sendKeys(arg2);
	    	break;
	    }
	    case "Phone":{
	    	wait.until(ExpectedConditions.visibilityOf(facBookingPage.txt_Phone));
	    	facBookingPage.txt_Phone.sendKeys(arg2);
	    	break;
	    }
	    case "Card Holder Name":{
	    	wait.until(ExpectedConditions.visibilityOf(facBookingPage.txt_cardHolderName));
	    	facBookingPage.txt_cardHolderName.sendKeys(arg2);
	    	break;
	    }
	    case "Card Number":{
	    	wait.until(ExpectedConditions.visibilityOf(facBookingPage.txt_cardNumber));
	    	facBookingPage.txt_cardNumber.sendKeys(arg2);
	    	break;
	    }
	    case "Security Code":{
	    	wait.until(ExpectedConditions.visibilityOf(facBookingPage.txt_cardCVC));
	    	facBookingPage.txt_cardCVC.sendKeys(arg2);
	    	break;
	    }
	    }
	}
	
	@When("I select \"([^\"]*)\" in \"([^\"]*)\" on Booking Information page")
	public void i_select_in_on_booking_information_page(String arg1, String arg2)throws Throwable{
		switch(arg2) {
		case "Month CC Exp Date":{
			facBookingPage.sel_CcMonth.selectByValue(arg1);
			break;
		}
		case "Year CC Exp Date":{
			facBookingPage.sel_CcYear.selectByValue(arg1);
			break;
		}
		}
	}
}
