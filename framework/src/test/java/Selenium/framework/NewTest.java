package Selenium.framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest {
	private WebDriver driver; 
	String appURL = "http://google.com";

	@BeforeClass
	public void testSetUp() {
		
//		driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
		 
		// Initialize browser
		driver=new ChromeDriver();
	}
	
	@Test
	public void verifyGooglePageTittle() {
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
