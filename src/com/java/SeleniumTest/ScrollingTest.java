package com.java.SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://www.spicinemas.in/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement privacy = driver.findElement(By.xpath("//a[contains (text(),'Privacy Policy')]"));
		// privacy.click();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,400)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView()", privacy);

	}

}
