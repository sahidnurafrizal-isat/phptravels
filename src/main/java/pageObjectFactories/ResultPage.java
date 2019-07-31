package pageObjectFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultPage {
	final WebDriver driver;
	
	public ResultPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.ID,using = "listing")
	public WebElement tbl_SearchResult;
}
