package com.java.SeleniumTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A14_EnterKeyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://www.google.com/");
		
	WebElement searchBar=	driver.switchTo().activeElement();
	searchBar.sendKeys("Today News"+Keys.ENTER);
	
	}

}
