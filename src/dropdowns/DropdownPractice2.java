package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dropDown);
		s.selectByVisibleText("Digital Music");
		
		Thread.sleep(3000);
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		driver.quit();

	}

}
