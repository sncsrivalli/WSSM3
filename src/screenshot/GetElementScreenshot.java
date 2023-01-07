package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchButton = driver.findElement(By.id("gh-btn"));
		File src = searchButton.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ElementScreenshot/"+searchButton.getAttribute("value")+".png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);
		driver.quit();

	}

}
