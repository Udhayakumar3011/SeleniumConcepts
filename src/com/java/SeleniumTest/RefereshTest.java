package com.java.SeleniumTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefereshTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	//	driver.get(driver.getCurrentUrl());

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("location.reload(0)");
		js.executeScript("history.go(0)");

	}

}
