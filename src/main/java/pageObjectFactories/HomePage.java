package pageObjectFactories;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	final WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// NAVBAR
	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")
	public WebElement btn_MyAccount;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]")
	public WebElement btn_SignUp;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]")
	public WebElement btn_Login;
	
	// MAIN AREA
	// Tabs
	@FindBy(how = How.XPATH, using = "//a[@title='Hotels']")
	public WebElement btn_TabHotels;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Flights']")
	public WebElement btn_TabFlights;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Tours']")
	public WebElement btn_TabTours;
	
	@FindBy(how = How.XPATH, using = "//a[@title='Cars']")
	public WebElement btn_TabCars;
	
	// City/Hotel
	@FindBy(how = How.CLASS_NAME, using = "col-md-12")
	private WebElement mainArea;
	
	public WebElement btn_CityHotel() {
		return mainArea.findElement(By.id("s2id_location"));
	}
	
	@FindBy(how = How.XPATH, using = "//div[@id='select2-drop']//input")
	public WebElement txt_CityHotel;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='select2-result-sub']")
	public WebElement cityHotelResultArea;
	
	public WebElement cityHotelResultOf(int index) {
		List<WebElement> results = new ArrayList();
		
		results = driver.findElements(By.xpath("//ul[@class='select2-result-sub']//li"));
		
		if(results.size()<index)
			return results.get(results.size() - 1);
		else
			return results.get(index);
	}
	
	// Check In
	@FindBy(how = How.XPATH, using = "//div[@id='dpd1']//input[@placeholder='Check in']")
	public WebElement txt_CheckIn;
	
	// Check Out
	@FindBy(how = How.XPATH, using = "//div[@id='dpd2']//input[@placeholder='Check out']")
	public WebElement txt_CheckOut;
	
	// Guest Details
	@FindBy(how = How.ID,using = "htravellersInput")
	public WebElement txt_GuestDetails;
	
	// Guest - Adult
	@FindBy(how = How.ID,using = "hadultInput")
	public WebElement txt_GuestAdult;
	
	// Guest - Adult plus button
	@FindBy(how = How.ID, using = "hadultPlusBtn")
	public WebElement btn_AdultPlus;
	
	// Guest - Child
	@FindBy(how = How.ID, using = "hchildInput")
	public WebElement txt_GuestChild;
	
	// Guest - Child plus button
	@FindBy(how = How.ID, using = "hchildPlusBtn")
	public WebElement btn_ChildPlus;
	
	// City/Hotel Search
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")
	public WebElement btn_CityHotelSearch;
}
