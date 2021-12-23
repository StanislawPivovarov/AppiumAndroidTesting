package Appium_one;

import io.appium.java_client.android.AndroidDriver;
import org.apache.tools.ant.taskdefs.condition.And;

public class Main {
    AndroidDriver driver;


    public Main(AndroidDriver driver){
        this.driver = driver;
    }
    public void wait(int delay) throws  InterruptedException {
        synchronized (driver) {
            driver.wait(delay);
        }
    }
    public void Messeges() throws InterruptedException {
        driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Messenger\"]/android.widget.ImageView").click();
        wait(5000);
        driver.swipe(705, 2125, 755, 391, 500);
        wait(2000);
        driver.swipe(569, 2199, 670, 434, 500);
        wait(2000);
    }
    public void toDark() throws InterruptedException{
        driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.ImageView").click();
        driver.findElementByAccessibilityId("Open menu").click();
        driver.findElementByAccessibilityId("Switch modes").click();
        wait(5000);
    }
}
