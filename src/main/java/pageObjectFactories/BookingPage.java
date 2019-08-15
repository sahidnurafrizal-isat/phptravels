package pageObjectFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingPage {
	final WebDriver driver;
	
	public BookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		this.sel_CcMonth = new Select(wb_selCcMonth);
		this.sel_CcYear = new Select(wb_selCcYear);
	}
	
	@FindBy(how = How.XPATH,using = "//form[@name='bookingForm']/div[2]/div/div/div[2]/div/h6")
	public WebElement BookingSummary_HotelName;
	
	@FindBy(how = How.XPATH, using = "//form[@name='bookingForm']/div[2]/div/div[2]/div/div/ul/li[1]/span")
	public WebElement BookingSummary_CheckInDate;
	
	@FindBy(how = How.XPATH, using = "//form[@name='bookingForm']/div[2]/div/div[2]/div/div/ul/li[2]/span")
	public WebElement BookingSummary_CheckOutDate;
	
	@FindBy(how = How.XPATH, using = "//form[@name='bookingForm']/div[2]/div/div[2]/div/div/ul/li[3]/span")
	public WebElement BookingSummary_NumOfNights;
	
	@FindBy(how = How.XPATH, using = "//form[@name='bookingForm']/div[2]/div/div[2]/div/div/ul/li[4]/span")
	public WebElement BookingSummary_NumOfRooms;
	
	@FindBy(how = How.XPATH, using = "//div[@class='row mb15']/div[2]")
	public WebElement btn_GuestBooking;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-8']/div[1]/div[@class='panel-heading']")
	public WebElement txt_BookingInformation;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Booking Summary')]")
	public WebElement txt_BookingSummary;
	
	@FindBy(how = How.XPATH, using = "//input[@id='first_name']")
	public WebElement txt_FirstName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='last_name']")
	public WebElement txt_LastName;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-6']//input[@id='email']")
	public WebElement txt_Email;
	
	@FindBy(how = How.XPATH, using = "//input[@id='phone_number']")
	public WebElement txt_Phone;
	
	@FindBy(how = How.XPATH, using = "//input[@id='cardHolderName']")
	public WebElement txt_cardHolderName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='cardNumber']")
	public WebElement txt_cardNumber;
	
	@FindBy(how = How.XPATH, using = "//input[@id='cardCVC']")
	public WebElement txt_cardCVC;
	
	@FindBy(how = How.XPATH, using = "//button[@id='completeBooking']")
	public WebElement btn_CompleteBooking;
	
	@FindBy(how = How.XPATH, using = "//select[@name='month']")
	private WebElement wb_selCcMonth;
	public Select sel_CcMonth;
	
	@FindBy(how = How.XPATH, using = "//select[@name='year']")
	private WebElement wb_selCcYear;
	public Select sel_CcYear;
}
