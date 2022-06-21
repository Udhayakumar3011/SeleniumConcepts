package com.java.SeleniumTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutUsingSendKeysTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		Utility.VcentryApp();

		WebElement ele = driver.findElement(By.id("element30"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", ele);
		driver.findElement(By.id("element35")).click();
		WebElement firstName = driver.findElement(By.id("firstname"));
		// firstName.click();
		// firstName.sendKeys("ABC");
		// Thread.sleep(3000);

		// js.executeScript("window.document.getElementById('firstname').click()");
		//
		// js.executeScript("arguments[0].value='ABCD'", firstName);
	}

}
