package hhhhhh;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waterview_code {
	
	static WebDriver driver;
	
	
	 static int rows;
 	 
 	 static int column;
 	 
	
	public static void main(String [] args) throws InterruptedException
	{
	
	     WebDriverManager.chromedriver().setup();
	   	
    	 driver = new ChromeDriver();
    	
    	 driver.get("https://testautomationpractice.blogspot.com/");
    	 
    	 driver.manage().window().maximize();
    	 
         Thread.sleep(2000);
    	 

     	  rows=driver.findElements(By.xpath("//*[@id=\"productTable\"]/tbody/tr")).size();
      	 
      	  column=driver.findElements(By.xpath("//*[@id=\"productTable\"]/thead/tr/th")).size();
      	 
      	  Thread.sleep(2000);
      	   
      	  
      	  
      	 WebElement button=driver.findElement(By.id("PopUp"));
      	 
      	 button.click();
      	 
      	
      	 driver.switchTo().
      	 
      	 
      	 
         
    	 Thread.sleep(3000);
    	
       	 driver.quit();
    	
	}
	
	
	
	public static void getdata()
	{
      
    	 for(int i=1;i<=rows;i++)
    	 {
    		 for(int j=1;j<=column;j++)
    		 {
    			 System.out.print(driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+"            ");
    		
    		 }
    		 
    		 System.out.println();
    	 }
	}
	
	
	
	
	
	
	
	
	public static void log(String a)
	{
		System.out.println(a);
	}
	
	
	
	
	public static void Select_dropdown(String path,String element)
	{
		 List<WebElement>option1=driver.findElements(By.xpath(path));
		 
    	 System.out.println(option1.size());
    	 
    	 for(int i=0;i<option1.size();i++)
    	 {
    		 if(option1.get(i).getText().equals(element))
    		 {
    			 option1.get(i).click();
    			 break;
    		 }
    	 }
	}
	
	
	
	public static void pass_value(String id,String value)
	{
		 driver.findElement(By.id(id)).sendKeys(value);
	}
	
	
	public static void click_event(String id)
	{
		 driver.findElement(By.id(id)).click();
	}
	
	
}
