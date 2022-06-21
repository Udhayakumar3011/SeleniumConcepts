package com.java.Selenium.ActionsTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.SeleniumTest.Utility;

public class SelectableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.switchTo().frame(0);

		List<WebElement> li = driver.findElements(By.xpath("//ol[@id='selectable']//li"));
		Actions a = new Actions(driver);

		a.keyDown(Keys.CONTROL);
		// a.click(li.get(0));
		// a.click(li.get(1));
		// a.click(li.get(2));
		// a.build().perform();

		// Another Method
		a.clickAndHold(li.get(0));
		a.clickAndHold(li.get(1));

		a.build().perform();
	}

}
