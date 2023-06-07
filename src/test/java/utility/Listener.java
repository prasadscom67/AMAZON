//package utility;
//
//import java.io.IOException;
//
//import org.testng.ITestListener;
//import java.io.IOException;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import org.testng.annotations.Listeners;
//import io.cucumber.messages.types.TestCase;
//import io.cucumber.plugin.ConcurrentEventListener;
//import io.cucumber.plugin.event.EventPublisher;
//
//
//
//
////@Listeners(value=ListenersTest.class)
//public class Listener implements ITestListener,ConcurrentEventListener {
//	
//	public static WebDriver driver;
//	
//	
//
//	public void onFinish(ITestContext arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void onStart(ITestContext arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
//		// TODO Auto-generated method stub
//		
//		
//	} 
//
//	public void onTestFailure(ITestResult result) {
//		
//		AfterHooksScreenshot(driver);
//		
//		
//	}
//
//	public void onTestSkipped(ITestResult arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void onTestStart(ITestResult arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void onTestSuccess(ITestResult arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void setEventPublisher(EventPublisher publisher) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	public static void AfterHooksScreenshot(io.cucumber.java.Scenario sc) throws InterruptedException
//	{
//	Thread.sleep(1000);	
//		if(sc.isFailed()){
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//			sc.attach(screenshot, "image/png", "Screenshot");
//			}
//			else
//			{
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//			sc.attach(screenshot, "image/png", "Screenshot");
//
//			}
//	}
//
//}
//
