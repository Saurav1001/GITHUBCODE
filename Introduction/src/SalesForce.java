import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\saurav.tyagi\\\\Documents\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=ca");
		
		//driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("Saurav Tyagi");
		driver.findElement(By.id("username")).sendKeys("Saurav.tyagi");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 password']")).sendKeys("1234");
		driver.findElement(By.cssSelector("[class='button r4 wide primary']")).click();
		
		

	}

}
