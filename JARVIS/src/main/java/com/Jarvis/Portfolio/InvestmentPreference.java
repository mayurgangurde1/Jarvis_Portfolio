package com.Jarvis.Portfolio;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Jarvis.Library.BaseClass;
import com.Jarvis.Library.UtilityClass;

public class InvestmentPreference extends BaseClass {
	
	public WebDriver driver;
	
	@FindBy(xpath ="//button[text()='3 Yr']")private WebElement SelectYear;	
	@FindBy(xpath ="//div[text()='Pure equity strategy']")private WebElement SelectStrategy;	
	@FindBy(xpath ="//button[text()='Submit my strategy']")private WebElement SubmitStrategy;
	@FindBy(xpath ="//button[text()='₹1,00,000']")private WebElement Amount;
	@FindBy(xpath ="//div[text()='Jarvis Portfolio Plus']")private WebElement Plan;
	@FindBy(xpath ="//button[text()='Continue']")private WebElement ContinueButton;	
	@FindBy(xpath ="(//button[text()='Confirm'])[1]")private WebElement ConfirmPreference;	
	@FindBy(xpath ="//div[text()='Unlock now']")private WebElement UnlockNow;	
	@FindBy(xpath ="//button[text()='Complete onboarding']")private WebElement onboarding;	
	 private By unlocknow =By.xpath("//div[text()='Unlock now']");
	
	public InvestmentPreference(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
		//this.driver = driver;
	}
	public void clickoncomplteonboarding() {
		onboarding.click();		
	}
	public void selectYear() throws IOException
	{
		SelectYear.click();
	}
	public void StrategySelection()
	{
		SelectStrategy.click();
	}
	public void SubmitStrategy()
	{
		SubmitStrategy.click();
	}
	public void SelectAmount()
	{
		Amount.click();
	}
	public void SelectPlan()
	{
		Plan.click();
	}
	public void ClickOnContinueButton()
	{
		ContinueButton.click();
	}
	public void ClickConfirmPreference() throws InterruptedException
	{
		ConfirmPreference.click();
		Thread.sleep(8000);
	}
	public void ClickonunlockNowButtton() 
	{
//		  	WebDriverWait wait = new WebDriverWait(driver, 10);
//	        WebElement buttonElement = wait.until(ExpectedConditions.elementToBeClickable(UnlockNow));
//	        buttonElement.click();
		UnlockNow.click();	
	}
}

