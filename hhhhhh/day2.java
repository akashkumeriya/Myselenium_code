package hhhhhh;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	
	 @Test(groups={"smoke"})
	  public void test3() {
		  
		  System.out.println("good");
	  }
	 
	 
	 @BeforeTest
	 public void prerequest()
	 {
		 System.out.println("i will execute first");
	 }
	 
	 
	 @AfterSuite
	 public void prerequest2()
	 {
		 
		 System.out.println("i will execute at the end");
	 }
	 
	 
	 
}
