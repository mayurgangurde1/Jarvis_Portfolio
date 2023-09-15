package com.Jarvis.Portfolio;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Jarvis.Library.BaseClass;
import com.Jarvis.Library.UtilityClass;
import com.fasterxml.jackson.core.io.UTF32Reader;
import com.github.dockerjava.api.model.Driver;

public class Profile extends BaseClass {

	@FindBy(xpath = "//span[text()='Mayur']")private WebElement profilename;
	@FindBy(xpath = "(//span[normalize-space()='Jarvis Portfolio'])[1]")private WebElement Portfolio;
	@FindBy(xpath = "//span[text()='Dashboard']")private WebElement Dashboard;
	@FindBy(xpath = "//span[text()='Action Centre']")private WebElement ActionCentre;
	@FindBy(xpath = "//span[text()='Invest More']")private WebElement Investmore;
	@FindBy(xpath = "(//span[normalize-space()='Transactions'])[1]")private WebElement Transactions;
	@FindBy(xpath = "//span[text()='Jarvis Protect']")private WebElement Protect;
	@FindBy(xpath = "//span[text()='Dashboard']")private WebElement Protectdashboard;
	@FindBy(xpath = "//span[text()='Action Centre']")private WebElement ProtectActionCenter;
	@FindBy(xpath = "//span[normalize-space()='Holdings']")private WebElement Holdings;
	@FindBy(xpath = "(//span[normalize-space()='Transactions'])[1]")private WebElement Transaction;
	@FindBy(xpath = "//span[text()='Jarvis One Stock']")private WebElement Onestock;
	@FindBy(xpath = "(//span[normalize-space()='Knowledge Centre'])[1]")private WebElement Knowledgecenter;
	@FindBy(css = ".MuiTypography-root.MuiTypography-body1.css-1g6ja4k")private WebElement Risk;

	public Profile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	

	public void portfolioproducttabs() throws InterruptedException {

		if (Portfolio.isDisplayed()) {
			System.out.println(Portfolio);
			Portfolio.click();
		} else {
			System.out.println("OnBoarding Issue");
		}
		System.out.println("JARVIS Portfolio Tabs");		
		System.out.println(Dashboard.getText());
		WebElement ActualResult1 =Dashboard; 
		String ExpectedResult1 = "Dashboard";
		assertEquals(ActualResult1.getText(), ExpectedResult1,"Text Invalid");

		System.out.println(ActionCentre.getText());
		WebElement ActualResult2 =ActionCentre; 
		String ExpectedResult2 = "Action Centre";
		assertEquals(ActualResult2.getText(), ExpectedResult2,"Text Invalid");
		Thread.sleep(1000);

		System.out.println(Transactions.getText());
		WebElement ActualResult3 =Transactions; 
		String ExpectedResult3 = "Transactions";
		assertEquals(ActualResult3.getText(), ExpectedResult3,"Text Invalid");
		System.out.println("-----------");
	}

	public void protectproductdetails() throws InterruptedException {
		System.out.println(Protect.getText());
		Protect.click();
		System.out.println("JARVIS Protect Tabs");
		Thread.sleep(1000);
		System.out.println(Protectdashboard.getText());
		WebElement ActualResult1 =Protectdashboard; 
		String ExpectedResult1 = "Dashboard";
		assertEquals(ActualResult1.getText(), ExpectedResult1,"Text Invalid");
		if(ProtectActionCenter.isDisplayed()) {
			System.out.println(ProtectActionCenter.getText());
		}
		else {
			System.out.println("Protect Action centre tab not available");
		}
		if(Holdings.isDisplayed()) {
			System.out.println(Holdings.getText());
		}
		else{
			System.out.println("Protect Holdings tab not available");
		}
		if(Transaction.isDisplayed()) {
			System.out.println(Transaction.getText());
		}
		else {
			System.out.println("Protect Transaction tab not available");
		}
		System.out.println("----------");
	}

	public void onestockproductdetails() throws InterruptedException {
		if (Onestock.isDisplayed()) {
			System.out.println(Onestock.getText());
			Onestock.click();
		} else {
			System.out.println("OnBoarding Issue");
		}
		System.out.println("JARVIS One Stock Tabs");

		if(Dashboard.isDisplayed()){
			System.out.println(Dashboard.getText());
		}
		else {
			System.out.println("One Stock Dashboard not available");
		}
		if(ActionCentre.isDisplayed()){
			Thread.sleep(1000);
			System.out.println(ActionCentre.getText());
		}
		else {
			System.out.println("One Stock ActionCentre not available");
		}
		if(Holdings.isDisplayed()){
			Thread.sleep(1000);
			System.out.println(Holdings.getText());
		}
		else {
			System.out.println("One Stock Holdings not available");
		}
		if(Transaction.isDisplayed()){
			Thread.sleep(1000);
			System.out.println(Transaction.getText());
		}
		else {
			System.out.println("One Stock Transaction not available");
		}
		System.out.println("-----------");
	}

	public void verifyprofilename() throws InterruptedException, IOException{
		WebElement name=driver.findElement(By.xpath("//span[text()='Mayur']")); 
		String ProfileName =name.getText();
		System.out.println("Actual profile name:"+name.getText());
		if(ProfileName.contains(UtilityClass.getDatafromPropertyFile("Name"))) {
			System.out.println("Profile name is:"+ ProfileName);
			System.out.println("Actual profile name:"+name.getText());
		}
		else {
			System.out.println("Profile name not Matching");
		}
		profilename.click();
		Thread.sleep(2000);
	}

	public void verifyriskprofile() throws IOException {

		WebElement risk = driver.findElement(By.cssSelector(".MuiTypography-root.MuiTypography-body1.css-1g6ja4k"));
		String RiskProfile=risk.getText();
		//						System.out.println(RiskProfile);
		if(RiskProfile.contains(UtilityClass.getDatafromPropertyFile("R1"))) {
			System.out.println("Risk profile is:"+RiskProfile);
		}	
		else if (RiskProfile.contains(UtilityClass.getDatafromPropertyFile("R2"))) {
			System.out.println("Risk profile is:"+ RiskProfile);
		}
		else if (RiskProfile.contains(UtilityClass.getDatafromPropertyFile("R3"))) {
			System.out.println("Risk profile is:"+ RiskProfile);		
		}
		else if (RiskProfile.contains(UtilityClass.getDatafromPropertyFile("R4"))) {
			System.out.println("Risk profile is:"+ RiskProfile);
		}
		else if (RiskProfile.contains(UtilityClass.getDatafromPropertyFile("R5"))) {
			System.out.println("Risk profile is:"+ RiskProfile);
		}
		else if (RiskProfile.contains(UtilityClass.getDatafromPropertyFile("R6"))) {
			System.out.println("Risk profile is:"+ RiskProfile);	
		}
		else {
			System.out.println("Risk Profile is missing");
		}
		System.out.println("-----");
	}

	public void VerifyEmailID() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.cssSelector("div[class*='css-18p8siz']"));
		String Email=email.getText();
		if(Email.contains(UtilityClass.getDatafromPropertyFile("email"))) {
			System.out.println("Email Id is:"+ Email);
		}
		else {
			System.out.println("Emaild not Matching");
		}
	}
	public void VerifyMobileNumber() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement number = driver.findElement(By.xpath("//div[@class='MuiTypography-root MuiTypography-small css-11c9u5c']"));
		String MobileNumber=number.getText();
		System.out.println(MobileNumber);
		if(MobileNumber.contains(UtilityClass.getDatafromPropertyFile("MobileNumber"))) {
			System.out.println("Mobile number is:"+ MobileNumber);
		}
		else {
			System.out.println("Mobile number not Matching");
		}	
		System.out.println("--------------------");
	}

	public void VerifyPortfolioplan() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement plan = driver.findElement(By.xpath("(//div[text()='Active Plan'])[1]"));
		if(plan.isDisplayed()) {
			System.out.println("For Portfolio:"+ plan.getText());
		}
		else {
			System.out.println("Portfolio plan is not active.");
		}			
	}
	public void VerifyProtectplan() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement plan = driver.findElement(By.xpath("(//div[text()='Active Plan'])[2]"));
		if(plan.isDisplayed()) {
			System.out.println("For Protect:"+ plan.getText());
		}
		else {
			System.out.println("Protect plan is not active.");
		}		
	}

	public void VerifyOnestockplan() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement plan = driver.findElement(By.xpath("(//div[text()='Active Plan'])[3]"));
		if(plan.isDisplayed()) {
			System.out.println("For One Stock:"+ plan.getText());
		}
		else {
			System.out.println("One Stock plan is not active.");
		}			









	}
}

