package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.Accountspage;
import com.w2a.pages.crm.accounts.CreateAccountPage;
import com.w2a.utilities.Utilities;

public class CreateAccountTest {
	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data)
	{
		ZohoAppPage zp= new ZohoAppPage();
		zp.gotoCRM();
		Accountspage account =Page.Menu.gotoAccount();
		CreateAccountPage cap=account.gotoCreateAccounts();
		cap.createAccount(data.get("accountname"));
		Assert.fail("reate account is failed");
	}

}
