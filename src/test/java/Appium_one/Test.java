package Appium_one;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    public static Authorization authorization;
    public static Main main;
    public static LogOut logOut;
    public AndroidDriver driver;
    @BeforeMethod
    public void setUp() throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("appPackage", "com.vkontakte.android");
        capabilities.setCapability("appActivity", "com.vkontakte.android.MainActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        authorization = new Authorization(driver);
        main = new Main(driver);
        logOut = new LogOut(driver);
    }

    @org.testng.annotations.Test
    public void mainTest() throws InterruptedException{
        authorization.authVK();
        main.Messeges();
        main.toDark();
        logOut.LoggingOut();
    }
    @AfterMethod
    public void down(){
        driver.quit();
    }
}
