package hhhhhh;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	
	
  @BeforeMethod
  public void open_browser() throws InterruptedException {
	  
	    System.setProperty("webdriver.chrome.driver", "/home/shatam-system-i2/chromedriver");

         driver= new ChromeDriver();	

		driver.get("https://rahulshettyacademy.com/"); 
	
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
	
  }
  
  
  @Test
  public void check_current_title()
  {
	  System.out.println("my test case executed successfully");
	  
	  String current_title=driver.getTitle();
	  
	  System.out.println("current_title====="+current_title);
	  
	  
	  String actual_title="Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy";
	  
	  Assert.assertEquals(current_title, actual_title);
	  
  }
  
  
  
  
  @AfterMethod
  public void close_browser()
  {
	  if(driver!=null)
	  {
		  driver.quit();
	  }
  }
}
