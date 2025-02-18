package hhhhhh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class practice_with_test_ng {
	
	WebDriver driver;
	
	@Test
	public void open_app() throws InterruptedException
	{
		System.out.println("open_app");
		
		
        System.setProperty("webdriver.chrome.driver", "/home/shatam-system-i2/chromedriver");	
		
		driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		
	}
	
	
	@Test(priority=2)
	public void test_logo()
	{
		System.out.println("open_app");
		
		Boolean logo= driver.findElement(By.className("orangehrm-login-branding")).isDisplayed();
		
		System.out.println("logo present or not ="+ logo);
		
	}
	
	
	
	@Test(priority=3)
	public void test_login()
	{
		System.out.println("login");
	}
	
	@Test(priority=4)
	public void test_logout()
	{
		System.out.println("logout");
	}
	
	

	
	
	
}
