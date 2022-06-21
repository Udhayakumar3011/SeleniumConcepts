package com.java.Selenium.ActionsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.SeleniumTest.Utility;

public class DoubleClickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		WebElement gmail = driver.findElement(By.linkText("Gmail"));

		Actions a = new Actions(driver);
		a.doubleClick(gmail).build().perform();
	}

}
