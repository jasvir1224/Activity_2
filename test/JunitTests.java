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
		driver = new ChromeDriver();

		driver.get("http://www.mcdonalds.ca/");
	}

	@After
	public void tearDown() throws Exception {
		
	Thread.sleep(5000);
	driver.close();
	}
	
/*	@Test
	public void testCase1() {
		
	WebElement titlemsg = driver.findElement(By.cssSelector("h2.click-before-outline"));
	String actualTitle = titlemsg.getText();
					System.out.println(actualTitle);
	assertEquals("Subscribe to My McD’s®", actualTitle);
		
		}*/
	
	

	@Test
	public void testCase2() {
		
		WebElement  firstName = driver.findElement(By.id("firstname2"));
		 firstName.sendKeys("Jasvir");
		 String actualFirstName =firstName.getText();
		
			
		WebElement  email = driver.findElement(By.id("email2"));
		email.sendKeys("jasvir.kaur@gmail.com");
		String actualemail = email.getText();
		
		WebElement  postalCode = driver.findElement(By.id("postalcode2"));
		postalCode.sendKeys("L6R");
		String actualCode = postalCode.getText();
		
		 
		assertEquals("Jasvir",actualFirstName);
		 assertEquals("jasvir.kaur@gmail.com",actualemail );

		assertEquals("L6R",actualCode );
		
		
		WebElement subscribeButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		subscribeButton.click();
		
		
		
		}
	
	/*@Test
	public void testCase3() 
	{
		
		WebElement  firstName = driver.findElement(By.id("firstname2"));
		 String actualFirstName = null;
		 assertEquals("Jasvir" , actualFirstName );
			
		WebElement  email = driver.findElement(By.id("email2"));
		String actualemail = null;
		 assertEquals("jasvir.kaur@gmail.com" , actualemail );

		WebElement  postalCode = driver.findElement(By.id("postalcode2"));
		String actualCode = null;
		 assertEquals("L6R" , actualCode );

		
		WebElement subscribeButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		subscribeButton.click();
		}*/
	
	

}
