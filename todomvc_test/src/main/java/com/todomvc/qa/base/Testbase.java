package com.todomvc.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.todomvc.qa.util.Testutil;

public class Testbase {
	
	 public static  WebDriver driver;
	 public static Properties prop;
	 
	protected Testbase(){
		
		try {
			
			prop=new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\SUD\\eclipse-workspace\\todomvc_test\\src\\main\\java\\com\\todomvc\\qa\\config\\config.properties");
			prop.load(ip);	
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SUD\\Desktop\\drivers and poi\\chromedriver83\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\SUD\\Desktop\\drivers and poi\\geckodriver.exe");
			 driver = new FirefoxDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WT, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		
		
		
	}
	

}
