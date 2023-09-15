package com.Jarvis.Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	@FindBy(xpath="//a[normalize-space()='Sign up']")private WebElement ClickonsinupLink;
	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiFilledInput-input jss25 MuiInputBase-inputSizeSmall css-fi4tqy'])[1]")private WebElement Name;
	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiFilledInput-input jss25 MuiInputBase-inputSizeSmall css-fi4tqy'])[2]")private WebElement Email;
	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiFilledInput-input jss25 MuiInputBase-inputSizeSmall css-fi4tqy'])[3]")private WebElement mobilenumber;
	@FindBy(xpath="//button[text()='Continue']")private WebElement Continue;
	@FindBy(xpath="(//input[@type='tel'])[1]")private WebElement otp;

	
	
public SignupPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void clickonlink(){
	
	ClickonsinupLink.click();
}

public void Entername(String name) {
	
	Name.sendKeys(name);
}

public void enteremail(String email) {
	Email.sendKeys(email);
}

public void entermobilenumber(String number) {
	
	mobilenumber.sendKeys(number);
}	
	
public void Clickoncontbutton() throws InterruptedException {

	Continue.click();
	Thread.sleep(2000);
}

public void enterotp() {
	otp.sendKeys("670361");
}

}
