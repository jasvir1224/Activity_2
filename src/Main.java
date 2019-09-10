import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/jasvirkaur/Desktop/chromedriver");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://www.mcdonalds.ca/");
		
		WebElement  firstName = driver.findElement(By.id("firstname2"));
		firstName.sendKeys("Jasvir");
		//firstName.getText();
		
		
		WebElement  email = driver.findElement(By.id("email2"));
	email.sendKeys("jasvir.kaur@gmail.com");

	//email.getText();
		
WebElement  postalCode = driver.findElement(By.id("postalcode2"));
  postalCode.sendKeys("L6R");

	//	postalCode.getText();
		
		WebElement subscribeButton = driver.findElement(By.id("g-recaptcha-btn-2"));
		subscribeButton.click();
		
		Thread.sleep(5000);
		driver.close();
	} 
}
