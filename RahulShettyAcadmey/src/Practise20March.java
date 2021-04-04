import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise20March {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saurav.tyagi\\Documents\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		/*WebElement statisdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(statisdropdown);
		
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());*/ //- Select Dropdown
		
		//**************************************************************************************
		 driver.findElement(By.id("divpaxinfo")).click();
		 Thread.sleep(3000L);
		 for(int i=1; i<4; i++) {
			 driver.findElement(By.id("hrefIncAdt")).click(); 
		 }
		 
		 driver.findElement(By.id("hrefIncChd")).click();
		 driver.findElement(By.id("hrefIncInf")).click();
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 driver.close();
		 
		 
		 
		
		
		

	}

}
