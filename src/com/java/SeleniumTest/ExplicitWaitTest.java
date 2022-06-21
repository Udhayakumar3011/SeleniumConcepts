package com.java.SeleniumTest;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		
		Utility.VcentryApp();

		WebElement alertClick = driver.findElement(By.id("element7"));
		alertClick.click();
		// Thread.sleep(3000);

		WebElement clickMe = driver.findElement(By.id("id1"));
		clickMe.click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.alertIsPresent());
	//	
		Alert a = driver.switchTo().alert();
		a.accept();

	}

}
