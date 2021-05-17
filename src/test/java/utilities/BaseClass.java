package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
		
		
	}
	public static void fill(WebElement element,String value) {
		element.sendKeys(value);
		
	}
    public static void click(WebElement element) {
    	element.click();
    }
    public void quit() {
    	driver.quit();
    }

}
