package com.selenium.LocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.java.SeleniumTest.Utility;

public class LocatorByClassNameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement enterEmail = driver.findElement(By.className("email valid"));
		enterEmail.click();
		enterEmail.clear();
		enterEmail.sendKeys("abc@gmail.com");
	}

}
