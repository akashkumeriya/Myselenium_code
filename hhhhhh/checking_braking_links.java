package hhhhhh;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checking_braking_links {
	
	public static void main(String [] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","/home/shatam-system-i2/chromedriver");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement>links=driver.findElements(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td/ul/li/a"));
		
		
		System.out.println(links.size());
		
		
		for(int i=0;i<links.size();i++)
		{
		//	System.out.println(links.get(i).getAttribute("href"));
			
		String ur=links.get(i).getAttribute("href");
		
		
		
		URL obj=new URL(ur);
		
		
		HttpURLConnection obj1=(HttpURLConnection)obj.openConnection();
		
		
		obj1.setRequestMethod("GET");
		
		int code=obj1.getResponseCode();
		
		
		if(code!=200)
		{
			System.out.println(ur+"    =    "+code);
		}
		
		
		}
		
		
		driver.quit();
		
	}

}
