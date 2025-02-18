package hhhhhh;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class page_object_model {
  
	
	WebDriver driver;
	
	
	public void landing_page(WebDriver driver)
	{
	  this.driver=driver;
	  
	  PageFactory.initElements(driver,this);
	}
	
//	WebElement userEmail= driver.findElement(By.id("userEmail"));
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	
	@FindBy(id="userPassword")
	WebElement password;
	
	
	@FindBy(id="login")
	WebElement submit;
	
	
	public void login_application(String email,String password1)
	{
		userEmail.sendKeys(email);
		
		password.sendKeys(password1);
		submit.click();
	}
	
	
	public void browse()
	{
		 driver.get("https://rahulshettyacademy.com/client/");
		 
		 
		 driver.manage().window().maximize();
		 
	}
	
	
	
}
