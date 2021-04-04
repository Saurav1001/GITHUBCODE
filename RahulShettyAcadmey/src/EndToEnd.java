import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saurav.tyagi\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.findElement(By.xpath("//a[@value='BLR']")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
		 
		 driver.findElement(By.xpath("//a[contains(@class,'ui-state-active')]")).click();
		 driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		 driver.findElement(By.id("divpaxinfo")).click();
		 Thread.sleep(3000);
		 
		 
		 
			 driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
			 
			 
			 driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult'] //option[@value='3']")).click();
			 Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
			 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			 
			 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		 
		 
		 

	}

}
