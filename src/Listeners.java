import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result)
	{
		
		System.out.println("Testcase has been started:"+ result.getName());

}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Testcases has been successful:"+ result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Testcase has been failed:"+ result.getName());
	
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("Testcase failed but within success percentage:"+result.getName());
	}
	
	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("Testcase onStart method:"+ context);
	}
	
	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("Testcase finished:"+ context);
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	}

