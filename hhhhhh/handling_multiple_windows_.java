package hhhhhh;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_multiple_windows_ {
	
	
	
	public static void main(String [] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "/home/shatam-system-i2/chromedriver");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("/html/body/a")).click();
		
		Set<String>links=driver.getWindowHandles();
		
		
		Iterator<String>it=links.iterator();
		
		
		String parent=it.next();
		
		System.out.println(driver.getCurrentUrl());
		
	
		
		String child=it.next();
		
		
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(child);
		
		
		System.out.println(driver.getCurrentUrl());
		
		
		Thread.sleep(2000);
		
		
	}

}
