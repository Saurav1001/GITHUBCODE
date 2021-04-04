import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saurav.tyagi\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.get("https://www.wikipedia.com/");
		//driver.navigate().forward();
		//driver.close();//to close your current browser
		//driver.quit();//it will close all the windows
		driver.get("https://intranet.xavient.com/xap/");
		driver.findElement(By.id("txtLoginName")).sendKeys("saurav.tyagi");
		driver.findElement(By.name("txtPassword")).sendKeys("Welcome@123");
		driver.findElement(By.id("btnLogin")).click();
		
		//driver.findElement(By.xpath("//label[contains(@id,'username')]")).click();//Log out
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/a/i")).click();
		//driver.findElement(By.linkText("Log Out")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/a/i")).click();
		//driver.findElement(By.xpath("//*[@id=\'dmWfh\']/a")).click();
		driver.findElement(By.linkText("WFH/ODD")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Apply')]")).click();
		driver.close();
		
		
		
		
		//driver.close();
		
		
		
		
		//driver.navigate().back();
	}

}
