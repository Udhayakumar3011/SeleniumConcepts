package com.java.robotTest;

import java.awt.AWTException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.java.SeleniumTest.Utility;

public class ValuePassingTest {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement searchBar = driver.switchTo().activeElement();

		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_E);
		 * robot.keyRelease(KeyEvent.VK_E); robot.keyPress(KeyEvent.VK_I);
		 * robot.keyRelease(KeyEvent.VK_I);
		 */
		/*
		 * searchBar.sendKeys("selenium"); searchBar.sendKeys(Keys.chord(Keys.CONTROL +
		 * "a")); searchBar.sendKeys(Keys.BACK_SPACE);
		 */
		searchBar.sendKeys("selenium");
		Actions a = new Actions(driver);
		a.doubleClick(searchBar);
		a.sendKeys(Keys.BACK_SPACE).build().perform();
	}

}
