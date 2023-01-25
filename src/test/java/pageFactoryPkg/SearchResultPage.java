package pageFactoryPkg;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import basePkg.MainClass;

public class SearchResultPage extends MainClass {
	
	@FindBy(xpath="//span[@class=a-color-state a-text-bold]")
	WebElement searchResultHeader;
	@FindBy(xpath="//a[@href='/ref=nav_logo']")
	WebElement amazonIconToGoBackToHomePage;
	@FindBy(xpath="//span[text()='No results for ']")
	WebElement noResultErrorMsg;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);//"this"->represents the webElement created that initialize with driver
	}
	
	public String returnSearchResultHeader() {
		return searchResultHeader.getText();
	}
	
	public String returnSearchResultPageTitle() {
		return driver.getTitle();
	}
	
	public void clickAmazonIcon() {
		amazonIconToGoBackToHomePage.click();
	}
	
	public boolean visibilityOfNoResultErrorMsg() {
		 return noResultErrorMsg.isDisplayed();
	}
	
	public String noResultErrorMsgTxt() {
		return noResultErrorMsg.getText();
	}
	
	public void hitEnterKey() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}

}
