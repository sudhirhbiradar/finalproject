package com.tomvc.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.todomvc.qa.base.Testbase;

public class Validation_tab extends Testbase {

	public void Validation_tab() {
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
	}
	@Test
	public void tc11() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='examples/react']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='toggle']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='clear-completed']")).click();
		Thread.sleep(4000);
	}
		
	@Test(priority=1)
	public void tc12() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='examples/react']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo2");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo3");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo4");
		Thread.sleep(4000);
	   driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
	    Thread.sleep(2000);
	    
	    WebElement sss = driver.findElement(By.xpath("(//label)[2]"));
	    Actions act= new Actions(driver);
	    act.moveToElement(sss).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button)[1]")).click();
		
		
	    WebElement sss1 = driver.findElement(By.xpath("(//label)[3]"));
	    Actions act1= new Actions(driver);
	    act.moveToElement(sss1).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button)[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='#/']"));
	    
		}
	
	@Test(priority=2)
	public void tc13() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='examples/react']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo2");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo3");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo4");
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
	    Thread.sleep(2000);
	    
	    WebElement sss = driver.findElement(By.xpath("(//label)[2]"));
	    Actions act= new Actions(driver);
	    act.moveToElement(sss).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button)[1]")).click();
		
		
	    WebElement sss1 = driver.findElement(By.xpath("(//label)[3]"));
	    Actions act1= new Actions(driver);
	    act.moveToElement(sss1).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button)[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='#/active']"));
	}
	@Test(priority=3)
	public void tc14() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='examples/react']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo2");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo3");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo4");
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='toggle']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='#/completed']")).click();
}
	
	@Test(priority=4)
	public void tc15() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='examples/react']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo2");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo3");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo4");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		
		WebElement sss = driver.findElement(By.xpath("(//label)[2]"));
	    Actions act= new Actions(driver);
	    act.moveToElement(sss).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button)[1]")).click();
		
		
	    WebElement sss1 = driver.findElement(By.xpath("(//label)[3]"));
	    Actions act1= new Actions(driver);
	    act.moveToElement(sss1).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button)[2]")).click();
	    Thread.sleep(2000);	
	}
	@Test(priority=5)
	public void tc16() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='examples/react']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo2");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo3");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo4");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[9]")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("(//a)[21]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='toggle-all']")).click();
	}
	@Test(priority=6)
	public void tc17() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='examples/react']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo2");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo3");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys("todo4");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div/header/input")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='toggle-all']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a)[21]")).click();
		Thread.sleep(2000);
	
	}
	@AfterMethod
	public void teardown() {
		driver.quit();		
	}
	
		
	}
	
	
	

