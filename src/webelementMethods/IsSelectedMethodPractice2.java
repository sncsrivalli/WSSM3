package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodPractice2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement radioButton = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		radioButton.click();
		
		if(radioButton.isSelected()) 
			System.out.println("Selected");
		else
			System.out.println("Not Selected");
		
		driver.quit();

	}

}
