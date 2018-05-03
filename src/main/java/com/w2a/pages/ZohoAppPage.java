package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {

	public void gotoCalendar() {
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[1]/div/a/div")).click();
		
	}
	public void gotoCliq() {
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[2]/div/a/div")).click();
	}
	public void gotoMail() {
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[4]/div/a/div")).click();
}
	public CRMHomePage gotoCRM() {
		click("crmlink_XPATH");
		return new CRMHomePage();
	}
	public void gotoSalesIQ() {
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[5]/div/a/div")).click();
}
}
