package com.java.SeleniumTest;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class A7_GetURLTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		System.out.println(driver.getCurrentUrl());
		
	}

}
