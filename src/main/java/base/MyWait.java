package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWait {
    private static WebDriverWait myWait;

    public static WebDriverWait getMyWait(){
        if (myWait==null){
        myWait=new WebDriverWait(MyWebDriver.getMyWebDriver(),10,1000);
        }
        return myWait;
    }

}
