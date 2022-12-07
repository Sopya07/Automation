package extentReport;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReportGenerate {

	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void startReport()
	{
		extent = new ExtentReports(System.getProperty("user.dir"), +"/test-output/MyOwnReport.html", true);
		extent.addSystemInfo("Host Name", "LocalHost");
		extent.addSystemInfo("Environment", "QA");
		extent.addSystemInfo("User Name", "Swapnil");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	
	}
	
	@Test
	public void demoReportPass()
	{
		test=extent.startTest("demoReportsPass");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS, "Assert pass as condition is true");
		
	}
	
	@Test
	public void demoreportfail()
	{
		test=extent.starttest("demoreportfail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "Assert fail as condition is false");
		
	}
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL, result.getThrowable());
		}
		extent.endTest(test);
	}
	
	@AfterTest
	public void endreport()
	{
		extent.flush();
	}
	
}
