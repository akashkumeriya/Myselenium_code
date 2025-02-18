package hhhhhh;												
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;												
import java.util.List;												
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;												
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;												
import org.openqa.selenium.WebElement;												
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;												
import org.openqa.selenium.support.ui.Select;												
import org.openqa.selenium.support.ui.WebDriverWait;																								
public class handling_multiple_windows {									
												
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "/home/shatam-system-i2/chromedriver");	
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		
		driver.manage().window().maximize();
		
		
	//	TakesScreenshot ts=(TakesScreenshot)driver;
		
		
		WebElement ele = driver.findElement(By.className("topic-block"));
		
		
		File source = ele.getScreenshotAs(OutputType.FILE);
		
		
		File target = new File("/home/shatam-system-i2/Akash Java Workspace/third_maven/my_screeshots/b.jpg");
		
		driver.findElement(By.id(""));
		
		source.renameTo(target);
		
		
		Thread.sleep(2000);
		
	    driver.quit();
	   
	}											
												
}												
												
