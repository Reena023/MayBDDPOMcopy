package stepDefinitions;

import basePkg.MainClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends MainClass {
	
	@Before
	public void loadApp() {
		initialization();
	}
	
	@After
	public void closeApp() {
		tearDown();
	}

}
