package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchReturnPage extends BasePage {

	public SearchReturnPage(WebDriver d) {
		super(d);
		
	}
	
	public void getSearchpageUrl(String baseUrl){
		d.get(baseUrl + "/s/ref=nb_sb_noss/261-9252371-1412818?url=search-alias%3Daps&field-keywords=Selenium+Automation");
	}
	/* click on the first Title link result on the Page*/
	public void clickReturnSearchSeleniumBook(){
		List<WebElement> books=d.findElements(By.cssSelector(OR.getProperty("listSeleniumbook")));
		WebElement SeleniumBook=books.get(0);
		SeleniumBook.click();
	}
	
	
	/* Verify if user is presented with a return search page */
	public boolean isSearchResultTextPresent() throws IOException{
		return getObjectFromSelector("SearchResult_text").isDisplayed();

	}
	
}
