package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.findElement(By.xpath("//span[text()='GEARS']")).click();
		driver.findElement(By.xpath("//a[.=' SkillRary Demo APP']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
