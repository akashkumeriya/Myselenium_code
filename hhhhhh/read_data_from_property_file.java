package hhhhhh;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.codehaus.groovy.runtime.memoize.EvictableCache.Action;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
public class read_data_from_property_file {
	
	public static void main(String [] args) throws IOException, InterruptedException, CsvValidationException
	{
		
//	   System.setProperty("webdriver.chrome.driver", "/home/shatam-system-i2/chromedriver");
//	
//		WebDriver driver=new ChromeDriver();
//		
//		driver.navigate().to("https://testautomationpractice.blogspot.com/");
//		
//		driver.manage().window().maximize();

		int num=153;
		int sum=0;
		
		int count =0;
		
		while(num!=0)
		{
			int res=num%10;
			
			sum=sum*10+res;
			
			num=num/10;
			
			
		}
		
		System.out.println(sum);
			
		
	
	}
	
	
	
}
