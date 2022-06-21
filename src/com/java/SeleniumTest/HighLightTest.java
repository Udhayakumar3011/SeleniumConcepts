package com.java.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLightTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = Utility.LaunchBrowser();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);

		WebElement tagsSearch = driver.findElement(By.id("tags"));
		highLight(tagsSearch);
		
	
		
	}

	public static void highLight(WebElement element) throws InterruptedException {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		for (int i = 0; i < 3; i++) {
			js.executeScript("arguments[0].setAttribute('style','border-color:yellow;');", element);
			Thread.sleep(500);
			js.executeScript("arguments[0].setAttribute('style','border-color:red;');", element);
			Thread.sleep(500);

		}
	}
}
