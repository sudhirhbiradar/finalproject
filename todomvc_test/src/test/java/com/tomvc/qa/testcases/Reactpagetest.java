package com.tomvc.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.todomvc.qa.base.Testbase;
import com.todomvc.qa.pages.Reactpage;

public class Reactpagetest extends Testbase {
	Reactpage  rp;
	
	public Reactpagetest() {
		super();
				
	}
	@BeforeMethod
	public void setup() {
		initialization();
		  rp =new Reactpage();
	}
	
	@Test
	public void homepagetest() {
	rp.clickreactbutton();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();		
	}
	
}
