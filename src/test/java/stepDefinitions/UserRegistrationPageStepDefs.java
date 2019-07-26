package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.When;
import pageObjectFactories.UserRegistrationPage;

public class UserRegistrationPageStepDefs {
	private WebDriver driver = Hooks.getDriver();
	private Logger logger = Hooks.getLogger();
	private WebDriverWait wait = Hooks.getWait();
	private UserRegistrationPage facUserRegPage;
	
	public UserRegistrationPageStepDefs() {
		facUserRegPage = PageFactory.initElements(driver, UserRegistrationPage.class);
	}
	
	@When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_fill_in_with(String arg1, String arg2) throws Throwable {
		
		switch(arg1) {
		case "First Name":
		{
			wait.until(ExpectedConditions.visibilityOf(facUserRegPage.txt_FirstName));
			facUserRegPage.txt_FirstName.sendKeys(arg2);
			break;
		}
		case "Last Name":
		{
			wait.until(ExpectedConditions.visibilityOf(facUserRegPage.txt_LastName));
			facUserRegPage.txt_LastName.sendKeys(arg2);
			break;
		}
		case "Mobile Number":
		{
			wait.until(ExpectedConditions.visibilityOf(facUserRegPage.txt_MobileNumber));
			facUserRegPage.txt_MobileNumber.sendKeys(arg2);
			break;
		}
		case "Email":
		{
			wait.until(ExpectedConditions.visibilityOf(facUserRegPage.txt_Email));
			facUserRegPage.txt_Email.sendKeys(arg2);
			break;
		}
		case "Password":
		{
			wait.until(ExpectedConditions.visibilityOf(facUserRegPage.txt_Password));
			facUserRegPage.txt_Password.sendKeys(arg2);
			break;
		}
		case "Confirm Password":
		{
			wait.until(ExpectedConditions.visibilityOf(facUserRegPage.txt_ConfirmPassword));
			facUserRegPage.txt_ConfirmPassword.sendKeys(arg2);
			break;
		}
		}
	}
	
	@When("^I click on \"([^\"]*)\" button on Registration page$")
	public void click_on_button_on_registration_page(String arg1) throws Throwable {
		wait.until(ExpectedConditions.visibilityOf(facUserRegPage.btn_SignUp));
		facUserRegPage.btn_SignUp.click();
	}
}
