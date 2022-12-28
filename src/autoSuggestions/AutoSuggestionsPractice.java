package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsPractice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='erkvQe']/descendant::li"));
		
//		for(WebElement e : suggestions) {
//			System.out.println(e.getText());
//		}
		
		for(int i=0;i<suggestions.size(); i++) {
			System.out.println(suggestions.get(i).getText());
		}
		
		driver.quit();
	}

}
