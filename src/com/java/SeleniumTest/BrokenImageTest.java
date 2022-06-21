package com.java.SeleniumTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenImageTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		Utility.VcentryApp();

		WebElement imageBased = driver.findElement(By.id("element36"));
		imageBased.click();
		driver.findElement(By.id("element38")).click();
		WebElement brokenImage = driver.findElement(By.id("id1"));

		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is Broken");
		} else {
			System.out.println("Image is Not broken");
		}
	}

}
