package com.java.Selenium.ActionsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.SeleniumTest.Utility;

public class DraggableTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));

		Actions a = new Actions(driver);
		//a.clickAndHold(drag).moveByOffset(70, 100).release(drag).build().perform();
		a.clickAndHold(drag).moveByOffset(70, 100).release(drag).perform();
		
		

	}

}
