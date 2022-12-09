package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Navigate to facebook.com
		driver.get("https://www.facebook.com/");
		
		//Fetch the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Fetch current Url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//Fetch page source
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		//Close the browser
		//driver.close();
		driver.quit();
	}

}
