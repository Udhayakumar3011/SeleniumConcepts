package com.java.SeleniumTest;

import org.openqa.selenium.WebDriver;


public class ReUseClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=Utility.LaunchBrowser();
		driver.get("https://www.google.com/");
		
	}

}
