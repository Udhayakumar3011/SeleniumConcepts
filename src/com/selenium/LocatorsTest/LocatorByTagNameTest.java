package com.selenium.LocatorsTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByTagNameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		int size = allLink.size();

		System.out.println("Total Link Size is" + " " + size);

		Iterator<WebElement> itr = allLink.iterator();
		while (itr.hasNext()) {
			WebElement value = (WebElement) itr.next();
			//System.out.println(value.getText());
			String str = value.getAttribute("href");
			System.out.println(str);
		}
	}

}
