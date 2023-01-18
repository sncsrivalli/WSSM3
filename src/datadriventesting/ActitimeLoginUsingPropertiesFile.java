package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginUsingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		
		FileInputStream fis = new FileInputStream("./testdata/data.properties");
		Properties property = new Properties();
		property.load(fis);
		
		String browser = property.getProperty("browser");
		switch(browser) {
		case "chrome": driver = new ChromeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		case "edge": driver = new EdgeDriver(); break;
		default : System.out.println("Invalid browser info"); break;
		}
		
		driver.manage().window().maximize();
		driver.get(property.getProperty("url"));
		
		long time = Long.parseLong(property.getProperty("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		String user = property.getProperty("username");
		String pwd = property.getProperty("password");
		
		driver.findElement(By.id("username")).sendKeys(user+Keys.TAB+pwd+Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		boolean status = wait.until(ExpectedConditions.titleContains("Enter Time-Track"));

		if(status)
			System.out.println("Home page displayed");
		else
			System.out.println("Home page not found");
		
		driver.quit();
	}

}
