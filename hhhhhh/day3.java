package hhhhhh;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class day3 {
	
	
	
  @Parameters({"url","apikey"})
  @Test
  public void weblogincarloan(String url,String key) {
	  
	  System.out.println("web login car loan");
	  
	 System.out.println("my url ==="+url);
	 
	 
	 System.out.println("apikey ==="+key);
	  
  }
  
  
	
  @Test(dataProvider="getdata")
  public void mobilelogincarloan(String username,String password) {
	  
	 
	  
	  System.out.println("mobile login car loan");
	  
	  System.out.println("username===="+username);
	  System.out.println("password====="+password);

	  
  }
  
  
	
  @Test
  public void loginapicarloan() {
	  
	  
	  System.out.println("this will fail ");
	  
	  Assert.assertEquals("abc", "akash");
	  
	
  }
  
  
  @DataProvider
  public Object[][] getdata()
  {
	  
	  
	  
	  Object[][] data=new Object[3][2];
	  
	  
	  data[0][0]="firstname";
	  data[0][1]="password";
	  
	  
	  data[1][0]="secondfirstname";
	  data[1][1]="secondpassword";
	  
	  
	  data[2][0]="thirdfirstname";
	  data[2][1]="thirdpassword";
	  
	  
	  return data;
	  
	  
  }
  
  
  
 
}
