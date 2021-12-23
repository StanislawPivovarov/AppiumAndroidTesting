package Appium_one;

import io.appium.java_client.android.AndroidDriver;

public class Authorization {
    AndroidDriver driver;
    public Authorization(AndroidDriver driver){
        this.driver = driver;
    }
    public void wait(int delay) throws  InterruptedException{
        synchronized (driver){
            driver.wait(delay);
        }
    }
    public void authVK() throws InterruptedException{
        driver.findElementById("com.vkontakte.android:id/login_button").click();
        wait(1000);
        driver.findElementById("com.vkontakte.android:id/email_or_phone").sendKeys("+79656067059");
        wait(1000);
        driver.findElementById("com.vkontakte.android:id/vk_password").sendKeys("Canon700d1509");
        wait(1000);
        driver.findElementById("com.vkontakte.android:id/continue_btn").click();
        wait(5000);
    }
}
