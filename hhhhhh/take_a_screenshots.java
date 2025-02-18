package hhhhhh;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class take_a_screenshots {
	
	
	
	public static void main( String [] args) throws InterruptedException
	{
		 ChromeOptions options = new ChromeOptions();
		
		  options.addArguments("--incognito");		
		
		
	    System.setProperty("webdriver.chrome.driver", "/home/shatam-system-i2/chromedriver");
	    
	    WebDriver driver = new ChromeDriver(options);
	    
	  //  WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://expired.badssl.com/");
	    
	    
	    driver.manage().window().maximize();
	    
	    
	    Thread.sleep(3000);
	    
	   System.out.println(driver.getTitle());
	    
	    
	 
	//    driver.quit();
	    
	    }

}
