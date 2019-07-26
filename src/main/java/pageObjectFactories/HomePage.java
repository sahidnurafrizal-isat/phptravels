package pageObjectFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	final WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")
	public WebElement btn_MyAccount;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]")
	public WebElement btn_SignUp;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
}
