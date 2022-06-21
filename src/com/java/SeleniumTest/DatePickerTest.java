package com.java.SeleniumTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();
		// datePicker.sendKeys("05/09/2022" + Keys.ENTER);
		// datePicker.sendKeys("05/09/2022" + Keys.ENTER);
		// datePicker.sendKeys("05/09/2022" + Keys.ENTER);
		// datePicker.sendKeys("05/09/2022" + Keys.ENTER);

		List<WebElement> allDates = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		// allDates.get(1).click();
		System.out.println(allDates.size());
		Iterator<WebElement> itr = allDates.iterator();
		while (itr.hasNext()) {
			WebElement value = (WebElement) itr.next();
			// String selectdate="12";
			DateFormat df = new SimpleDateFormat("d");
			Date date = new Date();
			String todayDate = df.format(date);
			System.out.println(todayDate);
			System.out.println("All Dates" + " " + value.getText());
			if (value.getText().trim().equalsIgnoreCase(todayDate)) {
				value.click();
				break;
			}
		}

	}

}
