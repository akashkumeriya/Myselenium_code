package hhhhhh;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class day1 
{
	
    public static void main(String[] args) throws IOException, InterruptedException 
    {
    
        WebDriverManager.chromedriver().setup();
   	
     	WebDriver driver = new ChromeDriver();
     	
     	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     	
     	Thread.sleep(2000);
     	
     	driver.manage().window().maximize();
     	
        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));																				
    	
        System.out.println(links.size());
        
        for(WebElement lin:links)
        {
        
        	String link=lin.getAttribute("href");
        	
        	System.out.println(link);
        	
        	URL obj=new URL(link);
        	
        	HttpURLConnection op=(HttpURLConnection)obj.openConnection();
        	
        	op.setRequestMethod("Get");
        	
        	int Responce_code=op.getResponseCode();
        	
        	System.out.println(Responce_code);
        	
        }
        
     	
     	Thread.sleep(2000);
     	
     	driver.quit();
     	
     	
     	
    	
      
    }
}
