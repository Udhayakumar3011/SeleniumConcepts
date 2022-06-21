package com.java.SeleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);

		WebElement tagsSearch = driver.findElement(By.id("tags"));
		tagsSearch.click();
		tagsSearch.sendKeys("a");
	//	Thread.sleep(4000);

		// driver.switchTo().defaultContent();
		// driver.switchTo().frame(1);

		List<WebElement> li = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		int size = li.size();
		System.out.println("Total Size is:" + " " + size);
		li.get(1).click();

	}

}
