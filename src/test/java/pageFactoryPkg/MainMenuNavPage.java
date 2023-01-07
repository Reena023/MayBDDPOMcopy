package pageFactoryPkg;

import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class MainMenuNavPage extends MainClass {
	
	public MainMenuNavPage() {
		PageFactory.initElements(driver, this);//"this"->represents the webElement created that initialize with driver
	}
	
	public boolean validateNavPageTitle(String menuNavOptionTxt) {
		System.out.println("Actual title :"+driver.getTitle());
		return driver.getTitle().contains(menuNavOptionTxt);
	}
	
	public boolean validateNavPageUrl(String menuNavOptionTxt) { //return->validate
		System.out.println("Actual url :"+driver.getCurrentUrl());
		String updatedMenuOption = menuNavOptionTxt.replace(" ", "");
		return driver.getCurrentUrl().contains(updatedMenuOption);
	}

}
