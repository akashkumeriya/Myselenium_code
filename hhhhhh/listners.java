package hhhhhh;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class listners implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("my listners test case failed");
	}
	
	
	
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("all listners test case pass successfully");
	}
	
	
	
	
	@Override
	public void onTestStart(ITestResult result)
	{
		
	}
 
}
