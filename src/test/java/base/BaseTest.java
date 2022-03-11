package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    public WebDriver getWebDriver(){
        return MyWebDriver.getMyWebDriver();
    }
    public WebDriverWait getWait(){
        return MyWait.getMyWait();
    }
    public  WebElement waitForElement(WebElement element) {
        return getWait().withMessage("Element cant be located " + element)
                .until(ExpectedConditions.visibilityOf(element));
    }

}
