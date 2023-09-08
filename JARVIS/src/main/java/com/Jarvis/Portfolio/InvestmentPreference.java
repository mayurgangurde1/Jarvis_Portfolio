package com.Jarvis.Portfolio;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
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
	}
	public void ClickonunlockNowButtton() 
	{
		Duration timeout = Duration.ofSeconds(30);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		
		try {
			
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Unlock now']")));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        System.out.println(element.getText());
	        } 
		
		catch (StaleElementReferenceException e) {
	    	}
		}
//		  	WebDriverWait wait = new WebDriverWait(driver, 10);
//	        WebElement buttonElement = wait.until(ExpectedConditions.elementToBeClickable(UnlockNow));
//	        buttonElement.click();
		//UnlockNow.click();
		public void clickOnUnlockNowButton(){
		    Duration timeout = Duration.ofSeconds(40);
		    WebDriverWait wait = new WebDriverWait(driver, timeout);

		    wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

		    try {
		        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Unlock now']")));

		        // Check if the element is clickable
		        if (element != null) {
		            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		            System.out.println("Clicked on: " + element.getText());
		        } else {
		            System.out.println("Element is null. It may not have been found.");
		        }
		    } catch (StaleElementReferenceException e) {
		        System.out.println("Stale Element Reference Exception: " + e.getMessage());
		    } catch (TimeoutException e) {
		        System.out.println("Timeout Exception: " + e.getMessage());
		    }
		}	
	}


