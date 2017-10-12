package Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage  extends BasePage{

	public HomePage(WebDriver d) {
		super(d);
		
	}
	
	public void sendSearch(String search) throws IOException{
		getObject("searchInputbox").sendKeys(search);
	}
	
	public void sendEnterKeys() throws IOException{
	getObject("searchInputbox").sendKeys(Keys.ENTER);
		
	}

}
