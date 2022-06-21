package com.java.SeleniumTest;

import org.openqa.selenium.WebDriver;

public class A15_AuthenticationPopupHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
				//syntax		//username:Password@URL
		driver.get("http:admin:admin@the-internet.herokuapp.com/basic_auth");

		//Passing the Username and Password along with URL
	}

}
