package stefdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.LoginPojo;
import utilities.BaseClass;

public class FbLogin extends BaseClass{
	WebDriver Driver;
	
	LoginPojo lp;
	@Given("open the browser and pen facebook")
	public void open_the_browser_and_pen_facebook() {
		
	
		launchUrl("https://www.facebook.com/");
		lp=new LoginPojo();
	
	}
		
		
	@When("enter the valid {string} and {string}")
	public void enter_the_valid_and(String string, String string2) {
		
		fill(lp.getTxtEmail(),string);
		fill(lp.getTxtpass(),string2);
	
	   
	}

	@Then("user can able to see the homepage")
	public void user_can_able_to_see_the_homepage() {
		
		click(lp.getLoginClick());
	    
	}
	
	


}
