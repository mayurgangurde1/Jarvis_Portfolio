package com.logintest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Jarvis.Library.UtilityClass;
import com.jarvis.testutility.BaseTest1;

public class Testclass3_Profile extends BaseTest1{

	@Test(priority = 1)
	public void ClickonLoginwithPassword() throws InterruptedException{
		 loginpage.ClickOnLoginWithPasswordLink();	
	}
	@Test(priority = 2)
	public void VerifyLoginFnctionality() throws InterruptedException, IOException{
		
			loginpage.EnterEmailId(UtilityClass.getDatafromPropertyFile("email"));
			loginpage.Enterpassword(UtilityClass.getDatafromPropertyFile("Password"));
			loginpage.ClickOnLogin();
	}
	
	@Test(priority = 3)
	public void VerifyPortfolioProductTabDetails() throws InterruptedException {
		profile.portfolioproducttabs();
		profile.protectproductdetails();
		profile.onestockproductdetails();
	}
	
	@Test(priority = 4)
	public void VerifyProfileDetails() throws InterruptedException, IOException {
		profile.verifyprofilename();
		profile.verifyriskprofile();
		profile.VerifyEmailID();
		profile.VerifyMobileNumber();
		profile.VerifyPortfolioplan();
		profile.VerifyProtectplan();
		profile.VerifyOnestockplan();
		
	
		
		
		
	}
	
	
}
