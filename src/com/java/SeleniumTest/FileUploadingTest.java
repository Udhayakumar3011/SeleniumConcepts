package com.java.SeleniumTest;

import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileUploadingTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.customBrowser();
		driver.get("http://djangovinoth.pythonanywhere.com/FileUploadDownload/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@class='btn btn-info']"));

		Actions a = new Actions(driver);
		a.moveToElement(chooseFile).click().build().perform();
		Thread.sleep(3000);

		// C:\Users\LENOVO\Desktop\fileupload.exe
		Runtime.getRuntime().exec("C:\\Users\\LENOVO\\Desktop\\fileupload.exe");
		
		
		
	}

}
