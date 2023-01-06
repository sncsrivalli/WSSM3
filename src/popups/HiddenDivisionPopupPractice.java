package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopupPractice {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
		//driver.findElement(By.xpath("//div[@class='minContainer']")).click();
		
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("(//a[text()='13'])[1]")).click();
		driver.findElement(By.linkText("Search")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
