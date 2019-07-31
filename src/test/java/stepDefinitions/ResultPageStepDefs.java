package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import pageObjectFactories.ResultPage;

public class ResultPageStepDefs {
	private WebDriver driver = Hooks.getDriver();
	private Logger logger = Hooks.getLogger();
	private WebDriverWait wait = Hooks.getWait();
	private ResultPage facHotelResultPage;
	
	public ResultPageStepDefs() {
		facHotelResultPage = PageFactory.initElements(driver, ResultPage.class);
	}
	
	@Then("^I should see \"([^\"]*)\" on Result page$")
	public void i_should_see_on_result_page(String arg1) {
		switch(arg1) {
		case "Result list":{
			wait.until(ExpectedConditions.visibilityOf(facHotelResultPage.tbl_SearchResult));
			break;
		}
		}
		
		logger.info(arg1 + " is exist");
	}
	
	@Then("^All hotels search result should be from \"([^\"]*)\"$")
	public void all_hotels_search_result_should_be_from(String arg1) {
		List<WebElement> listResult = new ArrayList();
		listResult = facHotelResultPage.tbl_SearchResult.findElements(By.xpath("//tbody/tr"));
		
		for(WebElement result:listResult) {
			Assert.assertTrue(result.findElement(By.xpath("//div[@class='row']/a")).getAttribute("title").equals(arg1));
		}
		
		logger.info("All "+ listResult.size() + " results are correct");
	}
}
