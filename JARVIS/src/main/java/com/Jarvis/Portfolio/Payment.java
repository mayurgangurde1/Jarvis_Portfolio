package com.Jarvis.Portfolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Payment {

	@FindBy(xpath ="//button[text()='Pay ']")private WebElement Pay;
	@FindBy(xpath ="//button[text()='I agree']")private WebElement IAgree;
	@FindBy(xpath = "(//input[@name='paymentMethod'])[1]")private WebElement Paymentmethod;
	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiFilledInput-input jss92 MuiInputBase-inputSizeSmall css-fi4tqy']")private WebElement Enterupi;
	@FindBy(xpath = "//button[text()='Verify']")private WebElement Verify;
	@FindBy(xpath = "(//button[text()='Pay '])[2]")private WebElement paynow;
	
	public Payment(WebDriver driver)
	{
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
	
}
	
	

