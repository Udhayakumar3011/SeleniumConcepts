package com.java.Selenium.ActionsTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.SeleniumTest.Utility;

public class SortableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.switchTo().frame(0);

		List<WebElement> li = driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		Actions a = new Actions(driver);

		WebElement fromPosition = li.get(3);
		WebElement toPosition = li.get(0);
		a.clickAndHold(fromPosition).moveToElement(toPosition).release(toPosition).build().perform();
	}

}
