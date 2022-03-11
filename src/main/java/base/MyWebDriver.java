package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyWebDriver {
    private static WebDriver myWebDriver;


    public static void setMyWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver.exe");
        myWebDriver = new ChromeDriver();
    }
    public static WebDriver getMyWebDriver(){
        if (myWebDriver==null){
            setMyWebDriver();
        }
        return myWebDriver;
    }
}
