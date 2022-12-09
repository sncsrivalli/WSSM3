package basics;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchUserDesiredBrowser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser to be launched:");
		String browser = sc.next();
		
		switch(browser) {
		
		case "chrome" : ChromeDriver driver = new ChromeDriver();break;
		
		case "firefox" : FirefoxDriver driver1 = new FirefoxDriver();break;
		
		case "edge" : EdgeDriver driver2 = new EdgeDriver();break;
		
		default: System.out.println("Enter Valid Browser Name");break;
		}
	}

}
