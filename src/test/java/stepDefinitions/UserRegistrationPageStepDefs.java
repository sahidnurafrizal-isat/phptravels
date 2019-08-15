package stepDefinitions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import pageObjectFactories.UserRegistrationPage;

public class UserRegistrationPageStepDefs {
	private WebDriver driver = Hooks.getDriver();
	private Logger logger = Hooks.getLogger();
	private WebDriverWait wait = Hooks.getWait();
	private UserRegistrationPage facUserRegPage;
	
	public UserRegistrationPageStepDefs() {
		facUserRegPage = new UserRegistrationPage(driver);
	}
	
	@When("^User fills in with below data on Registration page:$")
	public void user_fill_with_below_data_on_registration_page(DataTable table) {
		List<List<String>> data = table.raw();
		
		for(List<String> row:data) {
			switch(row.get(0)) {
			case "First Name":
			{
				facUserRegPage.txt_FirstName.sendKeys(row.get(1));
				break;
			}
			case "Last Name":
			{
				facUserRegPage.txt_LastName.sendKeys(row.get(1));
				break;
			}
			case "Mobile Number":
			{
				facUserRegPage.txt_MobileNumber.sendKeys(row.get(1));
				break;
			}
			case "Email":
			{
				facUserRegPage.txt_Email.sendKeys(row.get(1));
				break;
			}
			case "Password":
			{
				facUserRegPage.txt_Password.sendKeys(row.get(1));
				break;
			}
			case "Confirm Password":
			{
				facUserRegPage.txt_ConfirmPassword.sendKeys(row.get(1));
				break;
			}
			}
		}
	}
	
	@When("^User click on \"([^\"]*)\" button on Registration page$")
	public void user_click_on_button_on_registration_page(String arg1) throws Throwable {
		facUserRegPage.btn_SignUp.click();
	}
}
