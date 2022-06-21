package com.java.SeleniumTest;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableHandlingTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver = Utility.LaunchBrowser();
		WebDriver driver = Utility.customBrowser();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// tr--Row
		// th--column
		// td--Each Cell

		//// th//following::tr//td[4]---Column Wise

		// table[@class='dataTable']---Entire table
		List<WebElement> li = driver.findElements(By.tagName("tr"));
		System.out.println(li.size());

		Iterator<WebElement> itr = li.iterator();
		while (itr.hasNext()) {
			WebElement value = (WebElement) itr.next();
			System.out.println(value.getText());
		}

	}

}
