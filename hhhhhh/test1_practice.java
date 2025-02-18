package hhhhhh;
import java.util.Iterator;																							
import java.util.List;																							
import java.util.Set;																							
import org.openqa.selenium.By;																							
import org.openqa.selenium.Dimension;																							
import org.openqa.selenium.WebDriver;																							
import org.openqa.selenium.WebElement;																							
import org.openqa.selenium.chrome.ChromeDriver;																							
import org.openqa.selenium.support.ui.ExpectedConditions;																							
import org.openqa.selenium.support.ui.Select;																							
import org.openqa.selenium.support.ui.WebDriverWait;																							


public class test1_practice {

    public static void main(String[] args) throws InterruptedException {
       
    	
    	System.setProperty("webdriver.chrome.driver", "/home/shatam-system-i2/chromedriver");
    	
    	WebDriver driver = new ChromeDriver();																					
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");	
		
		driver.findElement(By.className("blinkingText")).click();    
		
		Thread.sleep(2000);
		
		driver.quit();
    }
}
