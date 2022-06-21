package com.java.SeleniumTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullScreenShotTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nl3ne2922_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486387378181&hvpos=&hvnetw=g&hvrand=14204673576202530807&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061892&hvtargid=kwd-115149184&hydadcr=14452_2154371&gclid=Cj0KCQjwpcOTBhCZARIsAEAYLuV89Ew9NRPripCJ4rf3JkbyNgUBZ0w77cToD9DB6PGHVL7dZbAO0e8aAs6SEALw_wcB");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		Thread.sleep(3000);
		Screenshot screen = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);

		ImageIO.write(screen.getImage(), "jpg", new File("D:\\jq.jpg"));
		
	}

}
