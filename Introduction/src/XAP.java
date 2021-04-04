import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XAP {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saurav.tyagi\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://intranet.xavient.com/xap/");
		driver.findElement(By.id("txtLoginName")).sendKeys("saurav.tyagi");
		driver.findElement(By.name("txtPassword")).sendKeys("Welcome@123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//label[contains(@id,'username')]")).click();//Log out
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/a/i")).click();
		//driver.findElement(By.linkText("Log Out")).click();
		driver.findElement(By.xpath("//div[@class='btn-group']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'applywfh')]")).click();
		
		
		
		
		
		
		
		/*List<WebElement> options=driver.findElements(By.xpath("//ul[@role='menu'] //li"));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("WFH/ODD")) {
				option.click();
				break;
			}
		}*/
		
		
		
		
		
		
		
	}

}
