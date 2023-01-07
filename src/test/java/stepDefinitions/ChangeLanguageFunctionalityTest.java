package stepDefinitions;







import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.ChangeLanguagePage;
import pageFactoryPkg.HomePage;

public class ChangeLanguageFunctionalityTest extends MainClass {
	//WebDriver driver;
	HomePage hp = new HomePage();
	ChangeLanguagePage clp = new ChangeLanguagePage();
	
	@Given("customer is in change language page")
	public void customer_is_in_change_language_page() {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();//maximize the window to full size
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));//to define wait for page load
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://www.amazon.com");
	//	driver.findElement(By.id("icp-nav-flyout")).click();
		hp.clickLanguageChangeOption();
	    
	}

	@When("customer clicks {string}")
	public void customer_clicks(String langSelected) {
		if(langSelected.equalsIgnoreCase("english")){
			clp.clickEnglishLangOption();
//			WebElement engRadioBtn = driver.findElement(By.xpath("//input[@value='en_US']/following-sibling::i"));
//			engRadioBtn.click();
		}else if(langSelected.equalsIgnoreCase("spanish")){
			clp.clickSpanishLangOption();
//			WebElement espRadioBtn = driver.findElement(By.xpath("//input[@value='es_US']/following-sibling::i"));
//			espRadioBtn.click();
		}
		
	   
	}

	@Then("language of the page should be change based on {string} selected")
	public void language_of_the_page_should_be_change_based_on_selected(String langSelected) {
		if(langSelected.equalsIgnoreCase("english")) {
			//WebElement languageHeader = driver.findElement(By.id("icp-language-heading"));
			Assert.assertEquals(clp.languageSettingHeaderTxt(), prop.getProperty("languageHeaderEnglish"));
		}else if(langSelected.equalsIgnoreCase("spanish")) {
			//WebElement languageHeader = driver.findElement(By.id("icp-language-heading"));
			Assert.assertEquals(clp.languageSettingHeaderTxt(), prop.getProperty("languageHeaderSpanish"));
			
		}
		//driver.quit();
		
	   
	}


}
