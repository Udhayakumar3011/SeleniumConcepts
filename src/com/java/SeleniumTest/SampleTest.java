package com.java.SeleniumTest;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SampleTest {

	public static void main(String[] args) {
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement tagsSearch = driver.findElement(By.id("tags"));
		driver.navigate().refresh();
		WebElement tagsSearchStale = driver.findElement(By.id("tags"));
		tagsSearchStale.click();
		tagsSearchStale.sendKeys("a");

	}
}