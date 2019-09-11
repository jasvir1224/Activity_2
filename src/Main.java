import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/jasvirkaur/Desktop/chromedriver");
		WebDriver driver =  new ChromeDriver();

		
		driver.get("http://www.mcdonalds.ca/");
		
		WebElement titlemsg = driver.findElement(By.cssSelector("h2.click-before-outline"));
   titlemsg.sendKeys("Subscribe to My McD's®");
		
		WebElement  firstName = driver.findElement(By.id("firstname2"));
		firstName.sendKeys("Jasvir");
		
		
		WebElement  email = driver.findElement(By.id("email2"));
	email.sendKeys("jasvir.kaur@gmail.com");

		
WebElement  postalCode = driver.findElement(By.id("postalcode2"));
  postalCode.sendKeys("L6R");

		
		WebElement subscribeButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		subscribeButton.click();
		
		Thread.sleep(5000);
		driver.close();
	} 
}
