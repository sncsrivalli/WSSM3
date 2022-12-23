package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		FluentWait<WebDriver> wait = new FluentWait<>(driver)
				          .withTimeout(Duration.ofSeconds(10))
				          .pollingEvery(Duration.ofSeconds(2))
				          .ignoring(NoSuchElementException.class);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		if(driver.getTitle().contains("actiTIME"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		//driver.quit();


	}

}
