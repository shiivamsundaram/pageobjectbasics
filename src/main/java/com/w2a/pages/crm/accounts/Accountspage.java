package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class Accountspage extends Page{
	public CreateAccountPage gotoCreateAccounts()
	{
		click("createaccountbtn_XPATH");
		return new CreateAccountPage();
	}
	public void gotoImportAccounts()
	{
		
	}

}
