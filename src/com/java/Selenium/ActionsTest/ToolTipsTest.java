package com.java.Selenium.ActionsTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.SeleniumTest.Utility;

public class ToolTipsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement tooltips = driver.findElement(By.linkText("Tooltips"));
		String str = tooltips.getAttribute("title");
		System.out.println("Title text" + " " + str);
		Actions a = new Actions(driver);
		
		a.moveToElement(tooltips).build().perform();

	}

}
