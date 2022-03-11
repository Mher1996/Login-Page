package pages;

import base.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(css = "[name='uid']")
    private WebElement userID;
    @FindBy(css = "[name='password']")
    private WebElement password;
    @FindBy(css = "[name='btnLogin']")
    private WebElement loginButton;
    @FindBy(css = "[name='btnReset']")
    private WebElement resetButton;
    Helper helper=new Helper();


    public void setUserID(String userIdText){
        helper.scrollIntoView(userID);
        userID.clear();
        userID.sendKeys(userIdText);
    }
    public void setPassword(String passwordText){
        helper.scrollIntoView(password);
        password.clear();
        password.sendKeys(passwordText);
    }
    public void setLoginButton(){
        helper.scrollIntoView(loginButton);
        loginButton.click();
    }
}
