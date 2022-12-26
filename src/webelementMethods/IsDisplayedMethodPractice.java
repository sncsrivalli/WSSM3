package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethodPractice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/crm-demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement vtigerLogo = driver.findElement(By.xpath("//img[@alt='vtiger crm']"));
		boolean status = vtigerLogo.isDisplayed();
		System.out.println("Status "+status);
		
		if(status)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		driver.quit();

	}

}
