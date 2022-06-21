package com.java.SeleniumTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowHandlingTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = Utility.LaunchBrowser();
		Utility.VcentryApp();

		WebElement windowHandling = driver.findElement(By.id("element6"));
		windowHandling.click();

		WebElement openWindows = driver.findElement(By.id("id1"));
		openWindows.click();
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());

		String parentWindow = driver.getWindowHandle();

		Set<String> childWindow = driver.getWindowHandles();

		ArrayList<String> handles = new ArrayList<>(childWindow);
		Thread.sleep(3000);
		driver.switchTo().window(handles.get(3));
		Thread.sleep(3000);
		WebElement googleSearch = driver.findElement(By.name("q"));
		googleSearch.click();
		googleSearch.sendKeys("Vcentry Tech");
		//driver.switchTo().window(handles.get(0));
		//driver.switchTo().window(parentWindow);
		driver.close();
		driver.quit();
		
	}

}
