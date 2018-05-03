package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class HomePage extends Page{
	
	
	public LoginPage goToLogin() {
		click("loginlink_XPATH");
		return new LoginPage();
	}
	public void goToSignUp() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/a[3]")).click();
	}
	public void goToSupport() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/a[1]")).click();
	}
	public void goToZohoeu() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/a")).click();
	}
	public void goToLearnMore() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/p/a")).click();
	}
	
}
