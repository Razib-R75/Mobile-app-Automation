package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public AppiumDriver driver;

    public AppiumDriver AppiumDriverManager() throws MalformedURLException {
        // Set up desired capabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixl3");
        cap.setCapability("deviceVersion", "10");
        cap.setCapability("platformName", "Android");
       // cap.setCapability("appPackage", "com.mdev.tododo");
       // cap.setCapability("appActivity", "com.mdev.tododo.widget.ToDoListWidgetConfigureActivity");

        // Specify the full path to your APK file
        cap.setCapability("app", "C:/Users/Lenovo/Documents/Downloads/ToDodo_ To Do List & Reminder_1.8.6_Apkpure.apk");

        // Set ADB execution timeout (in milliseconds)
        cap.setCapability("adbExecTimeout", 60000); // Adjust as needed

        // Specify the Appium server URL
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        // Initialize the Appium driver
        driver = new AppiumDriver(url, cap);

        // Print a message to indicate the application is started
        System.out.println("Application is started...");

        return driver;
    }

    public void startAppiumService(String portNumber) {
        AppiumDriverLocalService service;
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(Integer.parseInt(portNumber));
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        System.out.println("Service has been started with port number: " + portNumber);
    }
}
