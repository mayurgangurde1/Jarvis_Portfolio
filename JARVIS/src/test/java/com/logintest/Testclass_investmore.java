package com.logintest;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Jarvis.Library.UtilityClass;
import com.jarvis.testutility.BaseTest1;

public class Testclass_investmore extends BaseTest1 {

	
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
	public void ClickOnPortfolio() {
		investmore.clickonportfolio();
	}
	@Test(priority = 4)
	public void ClickonInvetmore() throws InterruptedException {
		investmore.clickoninvestmore();
	}
//	@Test(priority = 5)
//	public void EnterAmount() {
//		investmore.EnterAmount();
//	}
//	@Test(priority = 6)
//	public void ClickonContinueButton() throws InterruptedException {
//		investmore.ClickonContinue();
//		
//	}
//	@Test(priority = 7)
//	public void ClickonContinue2Button() throws InterruptedException {
//		investmore.ClickonContine2button();		
//	}
//	
	@Test(priority = 5)
	public void ClickonProceedButton() {
		investmore.Clickonproceed();
	}
	@Test(priority = 6)
	public void ClickonContinuebutton() {
		investmore.clickoncontine();
	}
//	@Test(priority = 7)
//	public void ClickonContinuebutton() {
//		investmore.clickoncontine();
//	}
	
	
	
}
