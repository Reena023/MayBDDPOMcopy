package stepDefinitions;

import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.HomePage;
import pageFactoryPkg.MainMenuNavPage;

public class TopNavMenuFunctionalityTest extends MainClass {
	
	HomePage hp = new HomePage();
	MainMenuNavPage mmnv = new MainMenuNavPage();
	
	
	@When("clicks on top navigation {string}")
	public void clicks_on_top_navigation(String MenuOption) {
		hp.clickEachNavOptions(MenuOption);
	   
	}

	@Then("customer should be taken to {string} related page")
	public void customer_should_be_taken_to_related_page(String MenuOption) {
		Assert.assertTrue(mmnv.validateNavPageTitle(MenuOption));
		Assert.assertTrue(mmnv.validateNavPageUrl(MenuOption));
		
	    
	}

}
