package com.java.SeleniumTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_EnterURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.switchTo().activeElement();
	//	ele.sendKeys("Hello"+Keys.ENTER);
		//ele.click();
		ele.sendKeys("Hello \n");
		
	}

}
