package com.java.SeleniumTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BackgroundColorTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		Utility.VcentryApp();
		driver.findElement(By.id("element30")).click();
		driver.findElement(By.id("element35")).click();
		WebElement firstName = driver.findElement(By.id("firstname"));
		firstName.click();
		firstName.sendKeys("ABC");
		String str = firstName.getCssValue("background-color");
		System.out.println("Button Color is" + " " + str);
		
	}

}
