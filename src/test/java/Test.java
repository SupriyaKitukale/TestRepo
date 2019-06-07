package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Visionit\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("http://parabank.parasoft.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElements(By.id("username"));
		driver.findElement(By.id("password"));
		
	
	}

	
	}

//C:\Users\sony\AppData\Local\Google\Chrome\Application\chrome.exe