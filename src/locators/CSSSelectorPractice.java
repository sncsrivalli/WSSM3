package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("9177432389");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("hgvhjv");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.quit();
	}

}
