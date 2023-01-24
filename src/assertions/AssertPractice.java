package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertPractice {
	
	@Test(priority = -1)
	public void simpleTest() {
		String s1 = "Hi";
		String s2 = "Hello";
		
		Assert.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("In simpleTest");
	}
	
	@Test
	public void skillraryLogoTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='SkillRary']"));
		
		Assert.assertTrue(logo.isDisplayed());
		driver.quit();
		
	}

}
