package tests;

import DriverManagement.BaseDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class BaseTest extends BaseDriver {

    AndroidDriver driver;

    @BeforeMethod
    public void initalise() throws MalformedURLException {
        driver=initAndroidDriver();
        System.out.println("In initialise  BaseTests");
    }

    @AfterMethod
    public void tearDown() {
        quitDriver();
        System.out.println("In tearDown  BaseTests");
    }
}
