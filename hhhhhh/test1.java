package hhhhhh;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
public class test1 {
 
	
	
	public static void main(String [] args) throws InterruptedException, IOException
	{
		
		  System.setProperty("webdriver.chrome.driver","/home/shatam-system-i2/chromedriver");

		  WebDriver driver=new ChromeDriver();
		
		  driver.get("https://testautomationpractice.blogspot.com/");
		
		  driver.manage().window().maximize();
		
		  Thread.sleep(2000);
		
		
	 
		
		
		
		driver.quit();		
	}
	
}
