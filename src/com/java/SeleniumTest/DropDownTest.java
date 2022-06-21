package com.java.SeleniumTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		Utility.VcentryApp();

		WebElement dropdown = driver.findElement(By.id("element11"));
		dropdown.click();

		WebElement month = driver.findElement(By.id("month"));
		month.click();

		Select s = new Select(month);
		s.selectByIndex(1);
		Thread.sleep(3000);
	//	s.selectByValue("02");
		s.selectByVisibleText("Dharmapuri");
		month.sendKeys(Keys.ESCAPE);

		List<WebElement> totalDropDowns = s.getOptions();
		System.out.println(totalDropDowns.size());
		System.out.println(totalDropDowns.get(1).getText());
	}

}
