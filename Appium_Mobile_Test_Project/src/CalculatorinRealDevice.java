import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorinRealDevice {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability("appPackage", "com.miui.calculator");
		dc.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		//URL url =new URL("http://localhost:4723/wd/hub");
        AndroidDriver driver= new AndroidDriver(url,dc);
       Thread.sleep(5000);
       driver.switchTo().parentFrame();
       WebElement agree = driver.findElement(By.id("android:id/button1"));
       agree.click();
       WebElement eight = driver.findElement(By.id("com.miui.calculator:id/btn_8_s"));
       eight.click();
       WebElement plus = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
       plus.click();
       WebElement four = driver.findElement(By.id("com.miui.calculator:id/btn_4_s"));
       four.click();
       driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
       Thread.sleep(5000);
       String res = driver.findElement(By.id("com.miui.calculator:id/expression")).getText();
       if(res.equals("12")) {
    	   System.out.println("Test Passed  "+ res);
       }else {
    	   System.out.println("Test Failed");
       }
       Thread.sleep(5000);
       driver.quit();
	}

}
