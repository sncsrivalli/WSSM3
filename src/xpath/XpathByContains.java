package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(.,'Forgotten')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'mobile')]")).sendKeys("9876543210");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'selected')]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
