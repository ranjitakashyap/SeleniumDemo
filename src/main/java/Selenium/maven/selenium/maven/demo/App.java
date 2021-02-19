package Selenium.maven.selenium.maven.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App {
	@Test
	public  void  t_01_validate_login_zero_app(){ 
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");			
		//Find user Name and set username
		WebElement textbox_username = driver.findElement(By.name("user_login"));
		textbox_username.sendKeys("username");
		//password is set
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		String expected_title = "Zero- account Summary";
		String actual_title = driver.getTitle();
		Assert.assertEquals(expected_title, actual_title);
	}
	
}
