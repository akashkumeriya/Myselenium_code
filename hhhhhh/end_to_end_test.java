package hhhhhh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class end_to_end_test {
	WebDriver driver;
	
	String my_pod="ZARA COAT 3";
	
	
  @BeforeSuite
  public void open_browser() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","/home/shatam-system-i2/chromedriver");
	  
	 driver=new ChromeDriver();
	 
	 
	 page_object_model obj=new page_object_model();
	 
	 
	 
	 obj.landing_page(driver);	
	 
	 
	obj.browse();	
	
	 
	 obj.login_application("akashkumeriya23@gmail.com", "Akash#12");
  }
  
  
  @Test(priority=1)
  public void first_testcase_login() throws InterruptedException
  {
	  
	  System.out.println("first test case");
	   
	
		 String current_url=driver.getCurrentUrl();		
		 
		// System.out.println(driver.getCurrentUrl());
		
		 Assert.assertEquals(current_url, "https://rahulshettyacademy.com/client/dashboard/dash");
  
  }
  
  @Test(priority=2)
  public <WebdriverWait> void add_to_cart() throws InterruptedException 
  {
	  
	 
	 WebElement myproduct1=driver.findElement(By.className("container")); 
	 
	 
	 WebElement myproduct2=myproduct1.findElement(By.className("row")); 
	  
	  
	 List<WebElement> container= myproduct2.findElements(By.className("card-body")); 
	 
	 
	 System.out.println("container ==="+container.size());
	 
	 
	 for(int i=0;i<container.size();i++)
	 {
		
		 WebElement productName =container.get(i);
		 
		 
		 String productName44 = productName.findElement(By.tagName("b")).getText();
		 
		 
		 System.out.println("product name ====="+productName44);
		 
		
		 if(productName44.equals(my_pod))
		 { 
		
			 productName.findElement(By.xpath("//*[@id=\"products\"]/div[1]/div[2]/div[1]/div/div/button[2]")).click();
			 Thread.sleep(2000);
			 
		 }	 
	 }	 
		 
		 
	     driver.findElement(By.cssSelector("body > app-root > app-dashboard > app-sidebar > nav > ul > li:nth-child(4) > button")).click();

		
		 System.out.println(driver.getCurrentUrl());	
		 
		 
		 List<WebElement> container1= driver.findElements(By.className("cart")); 
 
		 
		 for(int i=0;i<container1.size();i++)
		 {
		 
			 WebElement productName1 =container1.get(i);
			
			 
			 System.out.println("productName1========="+productName1);
			 
			 String added_in_cart=productName1.findElement(By.tagName("h3")).getText();			 
			 
			 
			 Assert.assertEquals(added_in_cart, my_pod);
			 
			 
			 
			 driver.findElement(By.cssSelector("body > app-root > app-profile > div > div.subtotal.cf.ng-star-inserted > ul > li:nth-child(3) > button")).click();
			 
			 Thread.sleep(2000);
			 
			 
			 
			// Actions dropdown=new Actions(driver.findElement(By.id("")));
		
		   //  dropdown.sendKeys("India");
			 
			 int timeout = 10;
			 
			 driver.findElement(By.cssSelector("body > app-root > app-order > section > div > div > div.col-md-7 > div > div > div.payment__info > div.payment__shipping > div.details__user > div > div.user__address > div > input")).sendKeys("India");
		 
			 WebDriverWait wait = new WebDriverWait(driver, timeout);

			// Wait until the element is clickable
		//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("body > app-root > app-order > section > div > div > div.col-md-7 > div > div > div.payment__info > div.payment__shipping > div.details__user > div > div.user__address > div > section"))));

			 Thread.sleep(2000);
			 
			 
			 WebElement elementtt= driver.findElement(By.xpath("/html/body/app-root/app-order/section/div/div/div[2]/div/div/div[3]/div[2]/div[2]/div/div[1]/div/section")); 
			 
			 
			 
			 
			List<WebElement>ele= elementtt.findElements(By.className("ta-item"));
			 
			 
			 ele.get(i).click();
			 
			 
			 System.out.println("size of dropdown===="+ele.size());
			 
			 driver.findElement(By.xpath("/html/body/app-root/app-order/section/div/div/div[2]/div/div/div[3]/div[2]/div[2]/div/div[2]/a")).click();
			 
			 Thread.sleep(2000);
			 
			 
			 String result=driver.findElement(By.xpath("//*[@id=\"htmlData\"]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr[1]/td/h1")).getText();
			 
			 System.out.println("result====="+result);
			 
			 
			 Assert.assertEquals("THANKYOU FOR THE ORDER.", result);
			 
			 
			 }
		 
		 
	 }
	 
	
	 
  
  
  
  
  
  
  @AfterSuite
  public void close_browser()
  {
	  if(driver!=null)
	  {
		  driver.quit();
	  }
  }
}
