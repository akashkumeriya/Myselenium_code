package hhhhhh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {
	
	public static void main(String [] args) throws IOException, InterruptedException, CsvValidationException
	{
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://datatables.net/examples/basic_init/alt_pagination.html");
		
		driver.manage().window().maximize();
		
		for(int i=1;i<=6;i++)
		{
		
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//*[@id=\"example_wrapper\"]/div[3]/div[2]/div/nav/button["+i+"]")).click();	
		
		System.out.println("======== now click on button number ="+i);
		
		retrive(driver);
		
		}
		
        Thread.sleep(2000);
		
		driver.quit();
	
	}

		
		
		public static void retrive(WebDriver driver)
		{
			List<WebElement> total_rows=driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr"));
			
			List<WebElement> total_column=driver.findElements(By.xpath("//*[@id=\"example\"]/thead/tr/th"));
			
			System.out.println("rows="+total_rows.size());
			
			System.out.println("column="+total_column.size());
			
			for(int i=1;i<=total_rows.size();i++)
			{
				for(int j=1;j<=total_column.size();j++)
				{
					System.out.print(driver.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+"      ");
				                                                 
				}
				System.out.println();
			}
			
		}
		
}	
		
		
	   
	
	   
	
	
