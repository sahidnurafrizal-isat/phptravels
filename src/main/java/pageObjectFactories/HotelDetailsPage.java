package pageObjectFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HotelDetailsPage {
	final WebDriver driver;
	
	public HotelDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH,using = "//span[@class='h2 strong']")
	public WebElement txt_PageHeader;
	
	@FindBy(how = How.CLASS_NAME,using = "room-cards")
	public WebElement area_RoomCards;
	
	@FindBy(how = How.XPATH,using = "//div[@id='cookyGotItBtnBox']")
	public WebElement area_CookieConf;
}
