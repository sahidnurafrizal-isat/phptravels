package managers;

import org.openqa.selenium.WebDriver;

import pageObjectFactories.BookingPage;
import pageObjectFactories.HomePage;
import pageObjectFactories.HotelDetailsPage;
import pageObjectFactories.LoginPage;
import pageObjectFactories.MyAccountPage;
import pageObjectFactories.ResultPage;
import pageObjectFactories.UserRegistrationPage;

public class PageObjectManager {
	private WebDriver driver;
	private BookingPage bookingPage;
	private HomePage homePage;
	private HotelDetailsPage hotelDetailsPage;
	private LoginPage loginPage;
	private MyAccountPage myAccountPage;
	private ResultPage resultPage;
	private UserRegistrationPage userRegistrationPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public BookingPage getBookingPage() {
		return (bookingPage == null) ? new BookingPage(driver) : bookingPage;
	}
	public HomePage getHomePage() {
		return (homePage == null) ? new HomePage(driver) : homePage;
	}
	public HotelDetailsPage getHotelDetailsPage() {
		return (hotelDetailsPage == null) ? new HotelDetailsPage(driver) : hotelDetailsPage;
	}
	public LoginPage getLoginPage() {
		return (loginPage == null) ? new LoginPage(driver) : loginPage;
	}
	public MyAccountPage getMyAccountPage() {
		return (myAccountPage == null) ? new MyAccountPage(driver) : myAccountPage;
	}
	public ResultPage getResultPage() {
		return (resultPage == null) ? new ResultPage(driver) : resultPage;
	}
	public UserRegistrationPage getUserRegistrationPage() {
		return (userRegistrationPage == null) ? new UserRegistrationPage(driver) : userRegistrationPage;
	} 
}
