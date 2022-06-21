package com.java.Selenium.ChromeOptionsTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.setHeadless(true);
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(0);

		WebElement tagsSearch = driver.findElement(By.id("tags"));
		tagsSearch.click();
		tagsSearch.sendKeys("a");
		Thread.sleep(3000);

		// driver.switchTo().defaultContent();
		// driver.switchTo().frame(1);

		List<WebElement> li = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		int size = li.size();
		System.out.println("Total Size is:" + " " + size);
		li.get(1).click();
		
		
	}

}
