package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Helper {

    public void scrollIntoView(WebElement element ) {
        ((JavascriptExecutor) MyWebDriver.getMyWebDriver()).executeScript("arguments[0].scrollIntoView()", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void scrollIntoView(WebElement element ,boolean alignToTop) {
        ((JavascriptExecutor) MyWebDriver.getMyWebDriver()).executeScript("arguments[0].scrollIntoView("+alignToTop+")", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
