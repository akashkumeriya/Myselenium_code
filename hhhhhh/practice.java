package hhhhhh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {
	
	public static void main(String[] args) throws InterruptedException
	{
	//	System.setProperty("webdriver.chrome.driver", "/home/shatam-system-i2/chromedriver");	
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://laptop-smc8hiai/login.do");
	
		
		
	}

}