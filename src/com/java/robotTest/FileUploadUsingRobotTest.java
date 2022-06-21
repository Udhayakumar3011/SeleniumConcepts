package com.java.robotTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.SeleniumTest.Utility;

public class FileUploadUsingRobotTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = Utility.LaunchBrowser();
		driver.get("http://djangovinoth.pythonanywhere.com/FileUploadDownload/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@class='btn btn-info']"));

		Actions a = new Actions(driver);
		a.moveToElement(chooseFile).click().build().perform();
		Thread.sleep(3000);

		StringSelection selection = new StringSelection("D:\\images.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
