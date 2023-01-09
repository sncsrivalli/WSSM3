package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingAutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\QPS-Basavanagudi\\Desktop\\autoITFiles\\fileUploadpopup.exe");
		
	}

}
