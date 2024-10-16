package pages.AdditionPage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestingApp {

    public AppiumDriver driver;


    By  menuBar = By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
    By New_list = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout[6]/android.widget.TextView\n");
    By MenuPage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView\n");
    By textFild = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.EditText");
    By Cretae = By.id("android:id/button1");


    public TestingApp(AppiumDriver driver) {
        this.driver = driver;
    }


    public WebElement menubar() {return driver.findElement(menuBar);}

    public WebElement New_list() {return driver.findElement(New_list);}

    public WebElement  MenuPage(){return driver.findElement(MenuPage);}
    public WebElement  textFild(){return driver.findElement(textFild);}
    public WebElement  Create(){return driver.findElement(Cretae);}

}
