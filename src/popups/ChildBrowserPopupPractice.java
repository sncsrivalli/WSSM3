package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopupPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href=\"https://assess.skillrary.com/essay\"])[2]")).click();
		
		String parentID = driver.getWindowHandle();
		Set<String> windowIDs = driver.getWindowHandles();
		
		for(String id : windowIDs) {
			driver.switchTo().window(id);
		}
		Thread.sleep(3000);
		driver.findElement(By.id("mytext")).sendKeys("Srivalli");
		driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]")).click();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parentID);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
