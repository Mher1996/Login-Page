package test;

import base.BaseTest;
import base.Helper;
import dataProvider.InputsDataProvider;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pages.LoginPage;
import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        getWebDriver().get("https://www.demo.guru99.com/V4/");
        loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
    }


    @Test(priority = 1, testName = "Login test with invalid data", dataProvider = "Inputs", dataProviderClass = InputsDataProvider.class)
    public void loginTestInvalid(String userID, String password) {
        final String expectedAlertText = "User or Password is not valid";
        loginPage.setUserID(userID);
        loginPage.setPassword(password);
        loginPage.setLoginButton();
        Alert alert=getWebDriver().switchTo().alert();
        final String actualAlertText = alert.getText();
        alert.accept();
        assertEquals(actualAlertText,expectedAlertText);



    }

    @Test(priority = 0, testName = "Login with valid data", dataProvider = "Inputs", dataProviderClass = InputsDataProvider.class)
    public void loginTestValid(String userID, String password) {
        final String expectedPageTittleText="Guru99 Bank Manager HomePage";
        loginPage.setUserID(userID);
        loginPage.setPassword(password);
        loginPage.setLoginButton();
        final String actualPageTittleText=getWebDriver().getTitle();
        assertEquals(actualPageTittleText,expectedPageTittleText);

    }
    @AfterClass(alwaysRun = true)
    public void tearDown(){
        getWebDriver().quit();
    }


}


