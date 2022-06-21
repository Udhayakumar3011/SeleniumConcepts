package com.java.SeleniumTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A18_GetAttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://www.google.com/");

		WebElement search = driver.switchTo().activeElement();
		search.sendKeys("Today News");
		String str = search.getAttribute("value");
		System.out.println(str);

	}
}
