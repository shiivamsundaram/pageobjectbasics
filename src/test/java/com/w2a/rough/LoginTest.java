package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.Accountspage;
import com.w2a.pages.crm.accounts.CreateAccountPage;

public class LoginTest  {

	public static void main(String[] args) {
		
		HomePage home=new HomePage();
		LoginPage lp=home.goToLogin();
		ZohoAppPage zp=lp.doLogin("vamshi4ru@yahoo.com", "Softwaretesting01");
		zp.gotoCRM();
		Accountspage account =Page.Menu.gotoAccount();
		CreateAccountPage cap=account.gotoCreateAccounts();
		cap.createAccount("vamshi");
	}

}
