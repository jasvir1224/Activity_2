import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTests {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/jasvirkaur/Desktop/chromedriver");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("www.mcdonalds.ca" );
	}

	@After
	public void tearDown() throws Exception {
		
	Thread.sleep(2000);
	driver.close();
	}

	@Test
	public void testCase2() {
		
		WebElement  firstName = driver.findElement(By.id("firstname2"));
		 String actualFirstName =firstName.getText();
		 assertEquals(actualFirstName ,firstName );
		
		
		WebElement  email = driver.findElement(By.id("email2"));
		String actualemail = email.getText();
		 assertEquals(actualemail ,email );

		

		WebElement  postalCode = driver.findElement(By.id("postalcode2"));
		postalCode.getText();
		
		WebElement subscribeButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		subscribeButton.click();
		
		
	}

}
