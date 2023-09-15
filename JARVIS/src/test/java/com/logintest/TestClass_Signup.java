package com.logintest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Jarvis.Library.UtilityClass;
import com.jarvis.testutility.BaseTest;
import com.jarvis.testutility.BaseTest1;

public class TestClass_Signup extends BaseTest1 {

	
	@Test(priority = 1)
	public void ClickonSignuplink() throws InterruptedException{
		 signup.clickonlink();	
		 Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void VerifySignupFnctionality() throws IOException, InterruptedException{

//		signup.Entername(UtilityClass.getDatafromPropertyFile("Name"));
		signup.enteremail((String)UtilityClass.generateRanodmEmail());
//		signup.enteremail(UtilityClass.getDatafromPropertyFile("Email"));
//		signup.entermobilenumber(UtilityClass.generateRandomMobileNumber());
		signup.entermobilenumber(UtilityClass.getDatafromPropertyFile("MobileNumber"));
		signup.Clickoncontbutton();
	}
	
	@Test(priority = 3)
	public void verifyOtpverification() {
		signup.enterotp();
	}
	
}
