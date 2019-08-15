package pageObjectFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyAccountPage {
	final WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH , using = "//h3[@class='RTL']")
	private WebElement txtHeaderName;
	
	public void checkHeaderName(String headerName) {
		//Assert.assertEquals(txtHeaderName.getText(), headerName);
	}
}
