package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.Accountspage;

public class TopMenu {
	/*Topmenu isa page???
	 * home menu hasa topmenu
	 * accounts hasa topmenu
	 * 
	 * 
	 */
	WebDriver driver;
	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void gotoHome()
	{
		
	}
	public void gotoSalesInBox()
	{
		
	}
	public void gotoFeeds()
	{
		
	}
	public void gotoLeads()
	{
		
	}
	public Accountspage gotoAccount()
	{
		Page.click("accountstab_XPATH");
		return new Accountspage();
	}
	public void gotoContacts()
	{
		
	}
	public void gotoDeals()
	{
		
	}
	public void gotoActivities()
	{
		
	}
	public void SignOut()
	{
		
	}


}
