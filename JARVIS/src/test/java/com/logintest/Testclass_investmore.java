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
//	@Test(priority = 3)
//	public v
	
	
	
	
	
}
