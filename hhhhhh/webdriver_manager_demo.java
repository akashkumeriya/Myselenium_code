package hhhhhh;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class webdriver_manager_demo 
{

    public static void main(String[] args)  
    {
    	   WebDriverManager.chromedriver().setup();
    	   	
        	WebDriver driver = new ChromeDriver();
        	
        	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    	
        	
        	
    	for(int i=1;i<=5;i++)
    	{
    		for(int j=1;j<=i;i++)
        	{
    			System.out.print("*");
        	}
    		System.out.println();
    	}
    	
    	
      
    }
}
