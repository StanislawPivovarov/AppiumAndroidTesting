package Appium_one;

import io.appium.java_client.android.AndroidDriver;

public class LogOut {
    AndroidDriver driver;
    public LogOut(AndroidDriver driver){
        this.driver = driver;
    }
    public void wait(int delay) throws  InterruptedException {
        synchronized (driver) {
            driver.wait(delay);
        }
    }

    public void LoggingOut() throws InterruptedException{
        driver.findElementByAccessibilityId("Settings").click();
        wait(2000);
        driver.swipe(844, 1916, 871, 987, 500);
        wait(2000);
        driver.findElementById("com.vkontakte.android:id/logout").click();
        wait(2000);
        driver.findElementById("android:id/button1").click();
        wait(2000);
        driver.findElementByAccessibilityId("Settings").click();
        wait(2000);
        driver.findElementByAccessibilityId("Clear account data").click();
        wait(2000);
        driver.findElementById("android:id/button1").click();
        wait(5000);
    }
}
