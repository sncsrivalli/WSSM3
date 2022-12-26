package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethodPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement amazonLogo = driver.findElement(By.id("nav-logo-sprites"));
		Dimension size = amazonLogo.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("Height of the element is "+height);
		System.out.println("Width of the element is "+width);
		
		driver.quit();

	}

}
