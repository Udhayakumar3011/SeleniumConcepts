package com.java.SeleniumTest;

import java.util.Date;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://www.google.com/");

		// driver.manage().deleteAllCookies();

		Set<Cookie> cook = driver.manage().getCookies();
		for (Cookie cookie : cook) {
			//System.out.println("Cookies" + " " + cookie);
			String domain = cookie.getDomain();
			Date expiry = cookie.getExpiry();
			String name = cookie.getName();
			String path = cookie.getPath();
			String value = cookie.getValue();

			System.out.println(domain + " " + expiry + " " + name + " " + path + " " + value);
		}
	}

}
