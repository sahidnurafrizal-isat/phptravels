package stepDefinitions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import pageObjectFactories.LoginPage;

public class LoginPageStepDefs {
	private WebDriver driver = Hooks.getDriver();
	private Logger logger = Hooks.getLogger();
	private WebDriverWait wait = Hooks.getWait();
	private LoginPage facLoginPage;
	
	public LoginPageStepDefs() {
		facLoginPage = new LoginPage(driver);
	}
	
	@When("^User fills in below data on Login page:$")
	public void user_fills_in_below_data_on_login_page(DataTable table) {
		List<List<String>> data = table.raw();
		
		for(List<String> row:data) {
			switch(row.get(0)) {
			case "Email":{
				facLoginPage.txt_Email.sendKeys(row.get(1));
				break;
			}
			case "Password":{
				facLoginPage.txt_Password.sendKeys(row.get(1));
				break;
			}
			}
		}
	}
	
	@When("User clicks on \"([^\"]*)\" button on Login Page")
	public void i_click_on_button_on_login_page(String arg1) {
		switch(arg1) {
		case "Login":{
			facLoginPage.btn_Login.click();
			break;
		}
		}
	}
}
