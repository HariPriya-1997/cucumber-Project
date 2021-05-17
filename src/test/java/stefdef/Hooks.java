package stefdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.BaseClass;

public class Hooks extends BaseClass {
	@Before
	public void before() {
		launchBrowser();
		driver.manage().window().maximize();
	}
	@After
	public void after() {
		quit();
	}

}
