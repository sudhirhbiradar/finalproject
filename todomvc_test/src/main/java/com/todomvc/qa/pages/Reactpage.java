 package com.todomvc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.todomvc.qa.base.Testbase;

public class Reactpage extends Testbase {

		@FindBy(xpath ="//a[@href='examples/react']")

		private static WebElement reactbutton;
		
	public Reactpage() {
		
		PageFactory.initElements(driver, this);
	}

	public static Reactpage clickreactbutton() {
		
		
		reactbutton.click();
		return new Reactpage();
		
		
	}

	
}


