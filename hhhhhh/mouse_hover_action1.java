package hhhhhh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover_action1 {
	
	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/shatam-system-i2/chromedriver");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.id("mousehover"));
		
		
		act.moveToElement(ele).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
