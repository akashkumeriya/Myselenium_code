package hhhhhh;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
public class waterdistrict_verificatiom {
	
	public static void main (String [] args) throws InterruptedException, CsvValidationException, IOException
	{
          ChromeOptions options = new ChromeOptions();
		
		  options.addArguments("--headless=new");
		    
		  HashMap a1=new HashMap();
		
		  String title;
		  String advanace_analytics;
		
		  System.setProperty("webdriver.chrome.driver","/home/shatam-system-i2/chromedriver");
		  
		  WebDriver driver=new ChromeDriver(options);
		  
		  driver.get("https://waterviewportal.com/admin-home");
		  
	      Thread.sleep(2000);
		 
		  List<WebElement>obj3=driver.findElements(By.xpath(".//tr/td[4]"));
		  
		  System.out.println(obj3.size());
		  
	     for(WebElement obj4:obj3)
	     {
	    	 
	    	 a1.put(obj4.getText(),"");
	    	 
	    	// System.out.println(obj4.getText());
	     }
		
	     CSVReader reader = new CSVReader(new FileReader("/home/shatam-system-i2/Documents/waterview_district_verification.csv"));
		
         String[] header = reader.readNext();

			String[] cell;

			while ((cell = reader.readNext()) != null) 
			{
				for (int i = 0; i < 1; i++) 
				{
				     title = cell[i+1];
					advanace_analytics = cell[i + 6];
				
			//		System.out.println(title+"  --  "+advanace_analytics);
			
	              if (advanace_analytics.contains("done")) {
	                    
	            	  
	            	  if(a1.containsKey(title)) {
	            	  
	            		  System.out.println("-"+title);
	                    }
	            	  else
	            	  {
	            		  System.out.println("=============================="+title);

	            	  }
	              }
					
				}
			}
	    
	     driver.quit();
		
		}

}
