package com.java.Selenium.ActionsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.SeleniumTest.Utility;

public class SliderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.switchTo().frame(0);

		WebElement scale = driver.findElement(By.id("slider"));
		WebElement handle = driver.findElement(By.xpath("//span[@tabindex='0']"));

		Actions a = new Actions(driver);
		a.clickAndHold(handle).moveByOffset(30, 0).release(handle).build().perform();

	}

}
