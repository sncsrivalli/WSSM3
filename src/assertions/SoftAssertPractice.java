package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
		
	@Test(priority = -1)
	public void simpleTest() {
		SoftAssert soft = new SoftAssert();
		
		String s1 = "Hi";
		String s2 = "Hello";
			
		soft.assertEquals(s1, s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("In simpleTest");
		soft.assertAll();
	}
	
	@Test
	public void skillraryLogoTest() {
		SoftAssert soft = new SoftAssert();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logo = driver.findElement(By.xpath("//img[@alt='SkillRary']"));
		soft.assertTrue(logo.isDisplayed());
		driver.quit();
		
		soft.assertAll();
		
	}

}
