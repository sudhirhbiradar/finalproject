package com.tomvc.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.todomvc.qa.base.Testbase;

public class Validation_site extends Testbase {
	
	public void Validation_site() {
		//super();		
	}
	@BeforeMethod
	public void setup() {
		initialization();
	}
	
	@Test
	public void tc2() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='examples/react']")).click();
		driver.close();
	}
	
	@Test(priority=1)
	public void tc3() throws InterruptedException {
		
         Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='examples/react']")).click();
		driver.findElement(By.xpath("//a[@href='http://todomvc.com']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='http://github.com/petehunt/']")).click();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();		
	}
	
	
	
	
}
