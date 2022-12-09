package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateForward {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(2000);
		
		//Navigate back
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		//Navigate forward
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
