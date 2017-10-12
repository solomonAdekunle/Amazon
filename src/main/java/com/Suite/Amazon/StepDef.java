package com.Suite.Amazon;

import java.io.IOException;

import org.junit.Assert;

import Pages.BasePage;
import Pages.HomePage;
import Pages.SearchReturnPage;
import Pages.SeleniumBookPage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseTest {
	
	private BasePage basePage;
	private HomePage homePage;
	private SearchReturnPage SRPage;
	private SeleniumBookPage SBPage;
	
	public StepDef(){
		super();
	basePage = new BasePage(BaseTest.d);
	homePage= new HomePage(BaseTest.d);
	SRPage= new SearchReturnPage(BaseTest.d);
	SBPage= new SeleniumBookPage(BaseTest.d);
	
	
	
	
		
	}
/////////////////////////////////////////////////////////////////////////////
///////////// The Below Methods are Given Method ////////////////////////////
/////////////////////////////////////////////////////////////////////////////
	
	@Given("^I am on Amazon Home Page on \"([^\"]*)\"$")
	public void i_am_on_Amazon_Home_Page_on(String baseUrl)  {
		basePage.getUrl(CONFIG.getProperty("siteName"));
	    
	}
	/* Navigate to the Result search page */
	@Given("^I am the Search Return Result Page on \"([^\"]*)\"$")
	public void i_am_the_Search_Return_Result_Page_on(String baseUrl)  {
		SRPage.getSearchpageUrl(CONFIG.getProperty("siteName"));
	    
	}
   /* Navigate to the Selenium Book Page*/
	@Given("^I am on the Selenium tile Page on \"([^\"]*)\"$")
	public void i_am_on_the_Selenium_tile_Page(String baseUrl)  {
		SBPage.getSeleniumBookUrl(CONFIG.getProperty("siteName"));
	}

////////////////////////////////////////////////////////////////////////
////////////// The Below Methods are When Method ///////////////////////
////////////////////////////////////////////////////////////////////////
	
  /* enter the search into the search filed */
   @When("^I enter my search as \"([^\"]*)\"$")
	public void i_enter_my_search_as(String search) throws IOException  {
	   homePage.sendSearch(search);
	    
	}
    /*click an enter key */
	@When("^I click enter$")
	public void i_click_enter() throws IOException {
		homePage.sendEnterKeys();
	    
	}
	/* Click on the first Automation book fromsearch result */
	@When("^I click on Selenium Automation book link$")
	public void i_click_on_Selenium_Automation_book_link()  {
		SRPage.clickReturnSearchSeleniumBook();
	    
	}
	
	/*Check your empty Trolley basket */
	@When("^I check my Trolley basket$")
	public void i_check_my_Trolley_basket() throws IOException  {
		SBPage.getInitialBaseket();
	   
	}
	
	/* Click add to cart button*/
	@When("^I click on Add To Cart button$")
	public void i_click_on_Add_To_Cart_button() throws IOException  {
		SBPage.clickAddtoCartButton();
		
	   
	}


////////////////////////////////////////////////////////////////////////
////////// The below Methods are Then Method ///////////////////////////
////////////////////////////////////////////////////////////////////////
	
	/* Verify if user is presented with a search return  result page */
	@Then("^I should be Presented with a search result page$")
	public void i_should_be_Presented_with_a_search_result_page() throws IOException {
		Assert.assertTrue(SRPage.isSearchResultTextPresent());
	   
	}
	/* Verify if the Title of the Page is displayed on the title Page */
	@Then("^I should navigate to Selenium book title Page$")
	public void i_should_navigate_to_Selenium_book_title_Page() throws IOException {
		Assert.assertTrue(SBPage.isSeleniumBookTitlePagePresent());
	    
	}
    /* Verify if price of the book is displayed */
	@Then("^I should see the Price of the Book$")
	public void i_should_see_the_Price_of_the_Book() throws IOException  {
		Assert.assertTrue(SBPage.isSeleniumBookPricePresent());
	}
   /* Verify if Cart button is idplsyed on the Book title Page */
	@Then("^I should see Add to Cart button$")
	public void i_should_see_Add_to_Cart_button() throws IOException  {
		Assert.assertTrue(SBPage.isAddToCartButtonPresent());
	    
	}
	/* verify if the your Product is added  to cart*/
	@Then("^I should see my Selenium book added to cart$")
	public void i_should_see_my_Selenium_book_added_to_cart() throws IOException {
	    Assert.assertTrue(SBPage.isAddedToBasketTextPresent());
	}
	/* Verify if that one unit your Product is added to TrolleyBaseket*/ 
	@Then("^I should see my Trolleybasket with one Added Selenium book$")
	public void i_should_see_my_Trolleybasket_with_one_Added_Selenium_book() throws IOException  {
		Assert.assertNotSame(SBPage.getcurrentBasket(), SBPage.emptyBasket);
	   
	}


	@After()
	public void closeBrowser(){
		d.quit();
	}

}
