package DriverManagement;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseDriver {

public AndroidDriver driver;


  public  AndroidDriver initAndroidDriver() throws MalformedURLException {
       driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),getDesiredCapabalities());

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      return driver;
  }

    private static DesiredCapabilities getDesiredCapabalities()
    {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("appium:platformVersion", "13");
        capabilities.setCapability("appium:automationName", "UIAutomator2");
        capabilities.setCapability("platformName", "Android");

        //capabilities.setCapability("appPackage","com.android.settings");
        //capabilities.setCapability("appActivity","com.android.settings.Settings");

       capabilities.setCapability("app",System.getProperty("user.dir")+"/src/main/resources/App/AmazonIndia.apk");
        //capabilities.setCapability("appPackage","com.android.settings");
        //capabilities.setCapability("appActivity","com.android.settings.Settings");
        capabilities.setCapability("newCommandTimeout",120);
        return capabilities;
    }

    public void quitDriver()
    {
        driver.quit();
    }

}
