package ExternalTasks;

import java.io.File;
import java.io.IOException;

import ImpMics.DriverInit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenSimpleCast extends DriverInit {

	public static void getScreenCast() throws IOException {
		System.out.println(nameMySnap());

		File Screencast = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(Screencast, new File(".//ScreenShot" + nameMySnap() + ".png"));
		System.out.println("Crossing the loop");

	}

}
