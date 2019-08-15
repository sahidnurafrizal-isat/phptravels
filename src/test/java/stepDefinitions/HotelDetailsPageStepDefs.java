package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectFactories.HotelDetailsPage;

public class HotelDetailsPageStepDefs {
	private WebDriver driver = Hooks.getDriver();
	private WebDriverWait wait = Hooks.getWait();
	private Logger logger = Hooks.getLogger();
	private HotelDetailsPage facHotelDetails;
	private Actions actions;
	
	public HotelDetailsPageStepDefs(){
		this.facHotelDetails = new HotelDetailsPage(driver);
		this.actions = new Actions(driver);
	}
	
	@Then("^User should see \"([^\"]*)\" on the page header of Hotel Details page$")
	public void i_should_see_on_the_page_header_of_hotel_details_page(String arg1) {
		wait.until(ExpectedConditions.visibilityOf(facHotelDetails.txt_PageHeader));
		Assert.assertTrue(facHotelDetails.txt_PageHeader.getText().equals(arg1));
		
		logger.info("Header text - "+arg1+" detected");
	}
	
	@When("^User click on \"([^\"]*)\" button on Hotel Details page for \"([^\"]*)\" selection$")
	public void i_click_on_button_on_Hotel_Details_page_for_selection(String arg1, String arg2) throws Throwable {
		//Check for cookie area
		try {
			wait.until(ExpectedConditions.visibilityOf(facHotelDetails.area_CookieConf));
			facHotelDetails.area_CookieConf.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();;
		}catch(Exception ex) {
			logger.info("Cookies area not appeared");
		}
		
	    int selection = Integer.parseInt(arg2);
	    
	    wait.until(ExpectedConditions.visibilityOf(facHotelDetails.area_RoomCards));
	    List<WebElement> roomList = new ArrayList();
	    roomList = facHotelDetails.area_RoomCards.findElements(By.xpath("//div[@class='room-card']"));
	    
	    switch(arg1) {
	    case "Book now":{
	    	WebElement btn_bookNow = roomList.get(selection - 1).findElement(By.xpath("//button[@class='core-btn-primary room-card__book-now-btn']"));
	    	actions.moveToElement(btn_bookNow).click().perform();

	    	break;
	    }
	    }
	    
	    logger.info(arg1+" button on selection "+ arg2 +" clicked");
	}
}
