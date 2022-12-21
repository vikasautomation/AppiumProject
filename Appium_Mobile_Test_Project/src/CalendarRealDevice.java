import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalendarRealDevice {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability("appPackage", "com.xiaomi.calendar");
		dc.setCapability("appActivity", "com.android.calendar.homepage.AllInOneActivity");
		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		//URL url =new URL("http://localhost:4723/wd/hub");
        AndroidDriver driver= new AndroidDriver(url,dc);
       Thread.sleep(5000);

      
	}

}
