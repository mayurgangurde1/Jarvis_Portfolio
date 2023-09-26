package com.Jarvis.Portfolio;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Jarvis.Library.UtilityClass;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Payment {
	public WebDriver driver;	
	@FindBy(xpath ="//button[text()='Pay ']")private WebElement Pay;
	@FindBy(xpath ="//button[text()='I agree']")private WebElement IAgree;
	@FindBy(xpath = "(//input[@name='paymentMethod'])[1]")private WebElement Paymentmethod;
	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiFilledInput-input jss92 MuiInputBase-inputSizeSmall css-fi4tqy']")private WebElement Enterupi;
	@FindBy(xpath = "//button[text()='Verify']")private WebElement Verify;
	@FindBy(css   = ".css-y604a5")private WebElement paynow;
	@FindBy(xpath = "//button[@id='redesign-v15-cta']")private WebElement Payusingupi;
	@FindBy(xpath = "//*[@id=\"vpa-upi\"]")private WebElement EnterUpi;
	@FindBy(xpath = "//button[text()='Pay Now']")private WebElement PayNow;
//	@FindBy(xpath = "//button[text()='Continue']")private WebElement Continue;
	@FindBy(css = "MuiButtonBase-root MuiButton-root MuiLoadingButton-root jss102 MuiButton-contained jss104 MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-xxp22q")private WebElement Continue;
			
	public Payment(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void ClickoPayButton()
	{
		Pay.click();
	}
	public void ClickOnIAgree()
	{
		IAgree.click();
	}
	public void Selectpaymentmethod()
	{
		Paymentmethod.click();		
	}
	public void enterupi() {
		Enterupi.sendKeys("1@paytm");
	}
	public void ClickonVerify() throws InterruptedException {
		Verify.click();
		Thread.sleep(3000);
	}
	public void clickonpaynow() {
		paynow.click();
	}
	public void ClickOnPayusingUpibutton() {
		Payusingupi.click();
	}
	public void EnterUpiId() throws IOException {
		EnterUpi.sendKeys(UtilityClass.getDatafromPropertyFile("Upi"));
		
	}
	
	public void ClickOnPayNow() throws InterruptedException {
		PayNow.click();
		
		Thread.sleep(12000);
	}	
	public void ClickonContinueButton() throws InterruptedException {
//		WebElement element = driver.findElement(By.xpath("//div[@class='MuiDialogActions-root MuiDialogActions-spacing css-14b29qc']/div[@class='MuiBox-root css-1i5md7k']/button[text()='Continue']"));
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		jsExecutor.executeScript("arguments[0].click();", element);			
		System.out.println(Continue.getText());
		Thread.sleep(4000);
		Continue.click();
	}
	
	
}
	
	

