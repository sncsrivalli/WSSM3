package pomPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		
		if(login.getLogo().isDisplayed()) {
			System.out.println("Login page displayed");
			login.setUsername("admin");
			login.setPassword("manager");
			login.clickCheckbox();
			login.clickLoginButton();
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			boolean status = wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
			if(status)
				System.out.println("Home page displayed");
			else
				System.out.println("Home page not found");
		}
			
		else
			System.out.println("Login page not found");
		
		driver.quit();
	}

}
