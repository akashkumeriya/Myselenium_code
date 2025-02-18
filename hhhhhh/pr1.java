package hhhhhh;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;   

public class pr1 {
	
	 public static void main(String [] args) throws IOException, InterruptedException
	 {
		
	 System.setProperty("webdriver.chrome.driver", "/home/shatam-system-i2/chromedriver");
	
     WebDriver driver=new ChromeDriver();
     
     driver.get("https://text-compare.com/");
     
     driver.manage().window().maximize();
     
     Actions act=new Actions(driver);
     
    
    driver.findElement(By.id("inputText1")).sendKeys("restassured");
  
     
    act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
    
    act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
    
    
    
    
    
    
    driver.quit();
	 }
	 
} 
