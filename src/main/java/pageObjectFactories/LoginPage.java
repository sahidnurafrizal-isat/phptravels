package pageObjectFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	final WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Email']")
	public WebElement txt_Email;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Password']")
	public WebElement txt_Password;
	
	@FindBy(how = How.XPATH, using="//button[@class='btn btn-action btn-lg btn-block loginbtn']")
	public WebElement btn_Login;
}
