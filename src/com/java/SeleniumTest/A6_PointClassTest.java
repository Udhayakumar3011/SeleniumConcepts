package com.java.SeleniumTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6_PointClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		Thread.sleep(3000);
		Dimension d = new Dimension(500, 700);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p = new Point(500, 0);

		driver.manage().window().setPosition(p);
	}

}
