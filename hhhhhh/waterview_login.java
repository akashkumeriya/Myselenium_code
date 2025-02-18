package hhhhhh;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class waterview_login {

    static WebDriver driver;

    public static void main(String[] args) throws CsvValidationException, IOException, InterruptedException {
       
    
    	
		  ChromeOptions options = new ChromeOptions();
	      options.addArguments("user-data-dir=/home/shatam-system-i2/custom-profile"); 
	      options.addArguments("--profile-directory=Default"); 
 
		
    	
    	System.setProperty("webdriver.chrome.driver", "/home/shatam-system-i2/chromedriver");

        driver = new ChromeDriver(options);
      
        Thread.sleep(2000);

        String email;
        String password;
        

        CSVReader reader = new CSVReader(new FileReader("/home/shatam-system-i2/Documents/waterview_credentials_file.csv"));
      //  String[] header = reader.readNext(); 

        String[] cell;

        while ((cell = reader.readNext()) != null) {
            email = cell[0];
            password = cell[1];

            driver.get("https://waterviewportal.com/");

            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("pass")).sendKeys(password);
            driver.findElement(By.id("SignIn")).click();

            WebDriverWait wait = new WebDriverWait(driver, 10);

            try {
                WebElement logOutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-info' and contains(@href, '/logout')]")));
                logOutLink.click();
                System.out.println("log in & log out successfully.");
                
            } 
            catch (Exception e) 
            {
                System.out.println("unable to login for email ="+email+", password ="+password +"because log out button not visible");
            }
        }

        reader.close();
        driver.quit(); 
    }
}
