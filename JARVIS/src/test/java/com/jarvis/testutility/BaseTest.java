package com.jarvis.testutility;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Jarvis.Library.BaseClass;
import com.Jarvis.Library.LoginPage;
import com.Jarvis.Portfolio.InvestmentPreference;
import com.Jarvis.Portfolio.Payment;
import com.Jarvis.Portfolio.RiskProfile;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest extends BaseClass {
	
	@BeforeSuite
	public void setBrowser() throws IOException {
		setBrowser();
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	@BeforeTest
	public void beforeTest() {
		setExtentReport();
	}
	@AfterTest
	public void afterTest() throws IOException {
		extent.flush();
		Desktop.getDesktop().browse(new File("Extent Report.html").toURI());
	}
	@BeforeMethod
	public void setObjects() {
		loginpage=new LoginPage(driver);
		riskprofile=new RiskProfile(driver);
		investmentpreference=new InvestmentPreference(driver);
		payment=new Payment(driver);
	
	}
	
  protected	LoginPage loginpage;
  protected RiskProfile riskprofile;
  protected InvestmentPreference investmentpreference;
  protected	Payment payment;

	ExtentReports extentReport = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("report1.html");
}
