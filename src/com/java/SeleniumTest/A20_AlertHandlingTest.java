package com.java.SeleniumTest;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A20_AlertHandlingTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		Utility.VcentryApp();

		WebElement alertClick = driver.findElement(By.id("element7"));
		alertClick.click();
		
		// Thread.sleep(3000);
		// WebElement clickMe = driver.findElement(By.id("id1"));
		// clickMe.click();

		// a.accept(); //Ok-Accept
		// a.dismiss(); //Cancel-Click

		// WebElement clickMeConfi = driver.findElement(By.id("id2"));
		// clickMeConfi.click();
		// Thread.sleep(3000);
		// Alert a = driver.switchTo().alert();
		// a.accept();
		// a.dismiss();

		WebElement clickMeConfi = driver.findElement(By.id("id3"));
		clickMeConfi.click();
		// Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.sendKeys("ABC");

		a.accept();
		// a.dismiss(); cancel

	}

}
