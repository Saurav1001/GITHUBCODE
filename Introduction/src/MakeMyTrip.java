import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver" , "C:\\\\Users\\\\saurav.tyagi\\\\Documents\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//*[@id='SW']/div[1]/div[1]/ul/li[5]/div[1]/p")).click();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sauravtyagi1212@gmail.com");
		
		//driver.findElement(By.xpath("//*[@id='SW']/div[1]/div[2]/div[2]/section/form/div[2]/button/span")).click();
		driver.findElement(By.xpath("//button[@data-cy='continueBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gotham@01");
		driver.findElement(By.xpath("//button[@data-cy='login']")).click();
		//driver.findElement(By.xpath("//a[@data-cy='resetPassword']")).click();
		//driver.findElement(By.xpath("//button[@data-cy='sendOtpToResetPassword']")).click();
		
	}

}
