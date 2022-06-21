package com.java.Selenium.ActionsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.SeleniumTest.Utility;

public class ResizingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.switchTo().frame(0);

		WebElement resize = driver.findElement(
				By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions a = new Actions(driver);

		a.clickAndHold(resize).moveByOffset(100, 70).release(resize).build().perform();
	}

}
