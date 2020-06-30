package com.tomvc.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.todomvc.qa.base.Testbase;

public class Addition_todos_test extends Testbase{
	
	public void Addition_todos_test() {
		//super();		
	}
	@BeforeMethod
	public void setup() {
		initialization();
	}
		@Test
		public void tc4() throws InterruptedException {
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[@href='examples/react']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input)[1]")).sendKeys("todo1");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input)[1]")).sendKeys(Keys.RETURN);
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input)[1]")).sendKeys("todo2");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input)[1]")).sendKeys(Keys.RETURN);
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input)[1]")).sendKeys("todo3");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input)[1]")).sendKeys(Keys.RETURN);
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input)[1]")).sendKeys("todo4");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input)[1]")).sendKeys(Keys.RETURN);
		}
		
		@Test(priority=1)
		public void tc6() throws InterruptedException {
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
			    driver.findElement(By.xpath("(//input)[1]")).sendKeys("todo1");
				Actions act = new Actions(driver);
				act.sendKeys(Keys.ENTER).perform();
				Actions act1=new Actions(driver);
				act1.moveToElement(driver.findElement(By.xpath("(//label)[2]"))).doubleClick();
				Actions act2 =new Actions(driver);
				act2.click(driver.findElement(By.xpath("(//label)[2]"))).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys("test").build().perform();
				Actions act3= new Actions(driver);
				act3.sendKeys(Keys.ENTER).perform();
		
		}
		
		
		@Test(priority=2)
		public void tc7() throws InterruptedException {
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[@href='examples/react']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo1");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
			Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("138");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
			Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("@#####");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
			Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("sudhir@138");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
			Thread.sleep(4000);
		}
			@Test(priority=3)
			public void tc8() throws InterruptedException {	
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[@href='examples/react']")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo1");
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
				Thread.sleep(4000);
				
				
		        driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("         ");
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
				Thread.sleep(4000);
		}
		
			
			@Test(priority=4)
			public void tc9() throws InterruptedException {	
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[@href='examples/react']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo1");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo1");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo1");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("todo1");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
					
			}
			@Test(priority=5)
			public void tc10() throws InterruptedException {
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[@href='examples/react']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='new-todo']")).sendKeys(Keys.RETURN);
				
				
			}
				
				
				
			
			
			
		@AfterMethod
		public void teardown() {
			driver.quit();		
		}
		
	
	
	
	
	

}
