package stepDefinitions;

//import java.time.Duration;
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.HomePage;
import pageFactoryPkg.SearchResultPage;

public class SearchFunctionalityTest extends MainClass {
	
	//WebDriver driver;
	String product ="apple";
	String invalidProduct = "876534567789VBBMMJHJ";
	HomePage hp = new HomePage();
	SearchResultPage srp = new SearchResultPage();
	
	
	@Given("guest customer is in homepage")
	public void guest_customer_is_in_homepage() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\desktop 2022\\SELENIUM\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();//maximize the window to full size
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));//to define wait for page load
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://www.amazon.com");
		Assert.assertEquals(hp.getHomePageTitle(), prop.getProperty("homePageTitle"));
	    
	}

	@When("customer enters valid product in search box")
	public void customer_enters_valid_product_in_search_box() {
		//WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
		//searchTxtBox.sendKeys(product);
		hp.enterProductInSearchTxtBox(product);
		
	   
	}

	@And("customer clicks search button")
	public void customer_clicks_search_button() {
//		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
//		searchBtn.click();
		hp.clickSearchBtn();
	}

	@Then("related products should be displayed in search result page")
	public void related_products_should_be_displayed_in_search_result_page() {
//		Assert.assertTrue(driver.getTitle().contains(product));
//		WebElement searchResultHeader = driver.findElement(By.
//				xpath("//span[@class='a-color-state a-text-bold']"));
//		Assert.assertTrue(searchResultHeader.getText().contains(product));
		//driver.quit();
		Assert.assertTrue(srp.returnSearchResultPageTitle().contains(product));
		Assert.assertTrue(srp.returnSearchResultHeader().contains(product));
	   }
	
	@When("customer hits enter key")
	public void customer_hits_enter_key() {
//	    Actions action = new Actions(driver);
//	    action.sendKeys(Keys.ENTER).build().perform();
		srp.hitEnterKey();
	}
	
	@When ("customer enters invalid product in search box")
	public void customer_enters_invalid_product_in_search_box() {
//		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
//		searchTxtBox.sendKeys(invalidProduct);
		hp.enterProductInSearchTxtBox(invalidProduct);
		}
	
	@Then ("no search result error message should be displayed")
	public void no_search_result_error_message_should_be_displayed() {
//		WebElement noResultErrorMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));
//		Assert.assertTrue(noResultErrorMsg.isDisplayed());
		//driver.quit();
		Assert.assertTrue(srp.visibilityOfNoResultErrorMsg());
		
	}
	
	//tidy gherkin
	@And ("^customer should be in search result page$")
	public void customer_should_be_in_search_result_page() {
//		String searchResultPageTitle = driver.getTitle();
//		Assert.assertTrue(searchResultPageTitle.contains(invalidProduct));
		Assert.assertTrue(srp.returnSearchResultPageTitle().contains(invalidProduct));
	}
	
	//
	
	
//	@When("customer enters valid {string} in search box")
//	public void customer_enters_validProduct_in_search_box(String product) {
//		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
//		searchTxtBox.sendKeys(product);
//	    
//	}
//
//	@Then("related {string} should be displayed in search result page")
//	public void related_validProduct_should_be_displayed_in_search_result_page(String product) {
//		Assert.assertTrue(driver.getTitle().contains(product));
//		WebElement searchResultHeader = driver.findElement(By.
//				xpath("//span[@class='a-color-state a-text-bold']"));
//		Assert.assertTrue(searchResultHeader.getText().contains(product));
//		driver.quit();
//	    
//	}
	
	//tidy gherkin
	@When("^customer enters valid (.+) in search box$")
	public void customer_enters_valid_in_search_box(String product) {
//		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
//	searchTxtBox.sendKeys(product);
		hp.enterProductInSearchTxtBox(product);
//    
	}
	
	@Then("^related (.+) should be displayed in search result page$")
	public void related_vali_should_be_displayed_in_search_result_page(String product) {
//	Assert.assertTrue(driver.getTitle().contains(product));
//	WebElement searchResultHeader = driver.findElement(By.
//			xpath("//span[@class='a-color-state a-text-bold']"));
//	Assert.assertTrue(searchResultHeader.getText().contains(product));
	//driver.quit();
		Assert.assertTrue(srp.returnSearchResultPageTitle().contains(product));
		Assert.assertTrue(srp.returnSearchResultHeader().contains(product));
	}
	
	
	@When("customer enters  {string} in search box")
	public void customer_enters_in_search_box(String invalidProduct) {
//		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
//		searchTxtBox.sendKeys(invalidProduct);
		hp.enterProductInSearchTxtBox(invalidProduct);
	}

	@And("customer should be in {string} search result page")
	public void customer_should_be_in_search_result_page(String invalidProduct) {
//		String searchResultPageTitle = driver.getTitle();
//		Assert.assertTrue(searchResultPageTitle.contains(invalidProduct));
	//	driver.quit();
		Assert.assertTrue(srp.returnSearchResultPageTitle().contains(invalidProduct));
	}
	
	
//	//tidy gherkin
//	@When("^customer enters \"{[^\"]*}\" in search box$")
//	public void customer_enters_in_search_box(String invalidProduct) {
//		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
//		searchTxtBox.sendKeys(invalidProduct);
//	}
//
//	@And("^customer should be in \"{[^\\\"]*}\" search result page$")
//	public void customer_should_be_in_search_result_page(String invalidProduct) {
//		String searchResultPageTitle = driver.getTitle();
//		Assert.assertTrue(searchResultPageTitle.contains(invalidProduct));
//		driver.quit();
//	}
	
	
	@Then ("{string} error message should be displayed")
	public void  error_message_should_be_displayed(String errorMsg) {
//		WebElement noResultErrorMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));
//		Assert.assertTrue(noResultErrorMsg.isDisplayed());
//		Assert.assertEquals(noResultErrorMsg.getText(), errorMsg);
		//driver.quit();
		Assert.assertTrue(srp.visibilityOfNoResultErrorMsg());
		Assert.assertEquals(srp.noResultErrorMsgTxt(), errorMsg);
	}
	

	

}
