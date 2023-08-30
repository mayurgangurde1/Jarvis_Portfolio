package com.Jarvis.Portfolio;

import static org.testng.Assert.assertEquals;

import java.time.Duration;import org.apache.poi.xdgf.usermodel.shape.ShapeTextVisitor.TextAcceptor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Jarvis.Library.BaseClass;
import com.aventstack.extentreports.util.Assert;
import com.github.dockerjava.api.model.Driver;

public class InvestMore extends BaseClass{

	
	@FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > div:nth-child(1)")private WebElement portfolio;
	@FindBy(xpath = "//span[normalize-space()='Invest More']")private WebElement Investmore;
	@FindBy(xpath = "//input[@inputmode='numeric']")private WebElement Amount;
	@FindBy(xpath = "//p[text()='Minimum Lumpsum amount is ₹10,000']")private WebElement minimumamount;
	@FindBy(xpath = "//button[text()='Continue']")private WebElement Continue;
	@FindBy(xpath = "(//button[@tabindex='0'])[6]")private WebElement Continue2;
	@FindBy(xpath = "(//button[normalize-space()='Proceed'])[1]")private WebElement proceed;
	@FindBy(xpath = "//button[text()='Continue']")private WebElement contiue;
	
	public InvestMore(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void clickonportfolio() {
		portfolio.click();
	}
	
	public void clickoninvestmore() throws InterruptedException {
		Investmore.click();
		Thread.sleep(6000);
		System.out.println(Investmore.getText());
	}
	
	public void EnterAmount() {
		Amount.sendKeys("20000");
		System.out.println(minimumamount.getText());
		WebElement ActualResult =minimumamount; 
		String ExpectedResult = "Minimum Lumpsum amount is ₹10,000";
		assertEquals(ActualResult.getText(), ExpectedResult,"Text Invalid");	
	}
	
	public void ClickonContinue() {
		Continue.click();
		System.out.println(Continue.getText());
		
	}
	
	public void ClickonContine2button() throws InterruptedException {
		Duration timeout = Duration.ofSeconds(20);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		
		try {
			
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@tabindex='0'])[6]")));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        System.out.println(element.getText());
	        } 
		
		catch (StaleElementReferenceException e) {
	    	}
		}
	
	public void Clickonproceed() {
		proceed.click();
		System.out.println(proceed.getText());
	}
	
	public void clickoncontine() {
		contiue.click();
	
		Duration timeout = Duration.ofSeconds(20);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		try {
			
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Login with your broker']")));
	        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	        System.out.println(element.getText());
		        } 
			
			catch (StaleElementReferenceException e) {
		    	}
			}

//		WebElement element = driver.findElement(By.xpath("//h2[text()='Login with your broker']"));
//		System.out.println(element.getText());
	}