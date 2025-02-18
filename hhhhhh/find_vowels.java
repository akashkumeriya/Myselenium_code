package hhhhhh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_vowels {
	
	public static void main( String [] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","/home/shatam-system-i2/chromedriver");
		  
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.youtube.com/");
			
			driver.manage().window().maximize();			
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("abc");
			
			//*[@id="search"]
			 
	}

}
