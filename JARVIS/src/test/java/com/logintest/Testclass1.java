package com.logintest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Jarvis.Library.ExtentReporter;
import com.Jarvis.Library.UtilityClass;
import com.Jarvis.Portfolio.RiskProfile;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.jarvis.testutility.BaseTest1;

public class Testclass1 extends BaseTest1 {
	
	@Test(priority = 1)
	public void ClickonLoginwithPassword() throws InterruptedException{
		 loginpage.ClickOnLoginWithPasswordLink();	
	}
	@Test(priority = 2)
	public void VerifyLoginFnctionality() throws InterruptedException, IOException{
		
			loginpage.EnterEmailId(UtilityClass.getDatafromPropertyFile("Email"));
			loginpage.Enterpassword(UtilityClass.getDatafromPropertyFile("Password"));
			loginpage.ClickOnLogin();
	}
	@Test(priority = 3)
	public void ClickOnInvestNowButton()
	{
			riskprofile.ClickOnInvestNow();
	}
	@Test(priority = 4)
	public void ClickOnStartNowButton()
	{
			riskprofile.ClickOnStartnow();
	}
	@Test(priority = 5)
	public void AttemptQuestionnaries() throws InterruptedException
	{
				riskprofile.Atteptquestionnaire();
	}
	@Test(priority=6)
	public void ClickOnSubmitMyResponcesButton()
	{
			riskprofile.ClickOnSubmitMyResponces();
	}
	@Test(priority = 7)
	public void ConfirmResponces() throws InterruptedException
	{
			riskprofile.SubmitMyResponces();
			Thread.sleep(2000);
	}
	@Test(priority =8)
	public void SelectCheckbox()
	{
			riskprofile.SelectCheckbox();
	}
	@Test(priority =9)
	public void ConfirmRiskProfile() 
	{	
			riskprofile.ConfirmRiskProfile();
	}
	@Test(priority =10)
	public void SelectTenure1() throws IOException
	{
			investmentpreference.selectYear();
	}
	@Test(priority =11)
	public void SelectStrategy()
	{
			investmentpreference.StrategySelection();
	}
	@Test(priority = 12)
	public void ClickOnSubmitMyStrategy()
	{
			
		investmentpreference.SubmitStrategy();
	}
	@Test(priority =13)
	public void SelectAmount()
	{
			investmentpreference.SelectAmount();
	}
	@Test(priority = 14)
	public void SelectPlan()
	{
			investmentpreference.SelectPlan();
	}
	@Test(priority = 15)
	public void CLickOnContinueButton()
	{
			investmentpreference.ClickOnContinueButton();
	}
	@Test(priority = 16)
	public void ConfirmInvestmentPreference() throws InterruptedException
	{

			investmentpreference.ClickConfirmPreference();
	}
//	@Test(priority =17)
//	public void Clickonboarding() {
//		investmentpreference.clickoncomplteonboarding();
//	}
	@Test(priority =17)
	public void UnlockPortfolioButton()
	{
			investmentpreference.clickOnUnlockNowButton();
	}
	@Test(priority = 18)
	public void ClickOnPayNowButton()
	{
			payment.ClickoPayButton();
	}
	@Test(priority = 19)
	public void ClickOnIAgreeButton()
	{
			payment.ClickOnIAgree();
	}
	@Test(priority = 20)
	public void selectpaymentmethod()
	{
			payment.Selectpaymentmethod();
	}
	@Test(priority = 21)
	public void EnterUpiID()
	{
			payment.enterupi();
			}
	@Test(priority = 22)
	public void CLickonVerifyButton() throws InterruptedException
	{
			payment.ClickonVerify();
			}
	@Test(priority = 23)
	public void ClickonPaynowButton()
	{
			payment.clickonpaynow();
			}
	@Test(priority = 24)
	public void ClickonPayUsingupi() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']")));
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@allow='otp-credentials']")));
		Thread.sleep(5000);
		payment.ClickOnPayusingUpibutton();
	}
	@Test(priority = 25)
	public void EnterUpiId() throws IOException {
		payment.EnterUpiId();
	}
	@Test(priority = 26)
	public void ClickOnPayNow() throws InterruptedException {
		payment.ClickOnPayNow();
		
		Thread.sleep(10000);
	}
	@Test(priority = 27)
	public void ClickonContinueButton() throws InterruptedException
	{
		Thread.sleep(3000);

		payment.ClickonContinueButton();	
	}
}

