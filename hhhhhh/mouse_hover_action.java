package hhhhhh;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mouse_hover_action {

	@Test
	public static void test1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/shatam-system-i2/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));

		driver.switchTo().frame(frame1);

		driver.findElement(By.name("mytext1")).sendKeys("welcome");

		driver.switchTo().defaultContent();

		WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));

		driver.switchTo().frame(frame2);

		driver.findElement(By.name("mytext2")).sendKeys("welcome 2");

		driver.switchTo().defaultContent();

		WebElement frame3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));

		driver.switchTo().frame(frame3);

		driver.findElement(By.name("mytext3")).sendKeys("welcome 3");

		driver.switchTo().frame(0); // switching inner frame

		driver.findElement(By.xpath(
				"//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[2]/div/span"))
				.click();

		 Thread.sleep(2000);
		
		 driver.findElements(By.xpath(""));
		 
		 driver.quit();

	}

}
