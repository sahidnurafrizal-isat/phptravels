package pageObjectFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UserRegistrationPage {
	final WebDriver driver;
	
	public UserRegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "firstname")
	public WebElement txt_FirstName;
	
	@FindBy(how = How.NAME, using = "lastname")
	public WebElement txt_LastName;
	
	@FindBy(how = How.NAME, using = "phone")
	public WebElement txt_MobileNumber;
	
	@FindBy(how = How.NAME, using = "email")
	public WebElement txt_Email;
	
	@FindBy(how = How.NAME, using = "password")
	public WebElement txt_Password;
	
	@FindBy(how = How.NAME, using = "confirmpassword")
	public WebElement txt_ConfirmPassword;
	
	@FindBy(how = How.XPATH, using = "//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']")
	public WebElement btn_SignUp;
}
