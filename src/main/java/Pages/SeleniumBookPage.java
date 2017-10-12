package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class SeleniumBookPage extends BasePage {
	public String emptyBasket;

	public SeleniumBookPage(WebDriver d) {
		super(d);

	}

	/* Navigate to Selenium automation book page */
	public void getSeleniumBookUrl(String baseUrl) {
		d.get(baseUrl + "/Test-Automation-using-Selenium-WebDriver/dp/0992293510/ref");
	}

	/* Verify if user is presnted with Selenium book page */
	public boolean isSeleniumBookTitlePagePresent() throws IOException {
		return getObjectFromSelector("titlePage").isDisplayed();
	}

	/* Verify if the Price of the book is displayed */
	public boolean isSeleniumBookPricePresent() throws IOException {
		return getObjectFromSelector("productPrice").isDisplayed();
	}

	/* Verify if Add to cart button is displayed */
	public boolean isAddToCartButtonPresent() throws IOException {
		return getObjectFromSelector("AddToCartButton").isDisplayed();
	}
	
	/* Check if AddedTo Basket Text is displayed after clicking on cart button*/
	public boolean isAddedToBasketTextPresent() throws IOException{
		return getObjectFromSelector("AddedToBasket").isDisplayed();
	}

	/* Click on Add to cart button */
	public void clickAddtoCartButton() throws IOException {
		getObjectFromSelector("AddToCartButton").click();

	}

	/* check my empty trolley */
	public void getInitialBaseket() throws IOException {
		emptyBasket = getObjectFromSelector("basketTorreyCount").getText();
		System.out.println(emptyBasket);
	}

	/* Check the your basket after adding a new product */
	public String getcurrentBasket() throws IOException {
		String BasketFilled = getObjectFromSelector("basketTorreyCount").getText();
		System.out.println(BasketFilled);
		return BasketFilled;
	}
}
