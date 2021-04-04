import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saurav.tyagi\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// to click the checkbox
		Assert.assertFalse(
				driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		Assert.assertTrue(
				driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		// System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		// to check selected checkbox is correct or not

		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		// to print all the checkbox find common attribute

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		// driver.findElement(By.className("guestlbl")).click();- no need to for this
		// Adult button you can directly click on add passenger

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
