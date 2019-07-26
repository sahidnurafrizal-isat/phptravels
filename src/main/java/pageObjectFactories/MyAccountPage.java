package pageObjectFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage {
	final WebDriver driver;
	
	@FindBy(how = How.XPATH , using = "//h3[@class='RTL']")
	public WebElement txtHeaderName;
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
}
