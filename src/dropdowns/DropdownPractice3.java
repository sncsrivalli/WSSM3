package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dropDown);
		List<WebElement> dropdownList = s.getOptions();
		
		for(WebElement element : dropdownList) {
			System.out.println(element.getText());
		}
		driver.quit();

	}

}
