package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethodPractice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='Gaming accessories']"));
		Point location = element.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("X coordinates: "+x);
		System.out.println("Y coordinates: "+y);
		driver.quit();
	}

}
