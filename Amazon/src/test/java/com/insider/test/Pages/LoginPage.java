package com.insider.test.Pages;

import com.insider.test.Base.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super (driver);
    }
    public HomePage login(String email, String password) throws InterruptedException {
        actionsSelector ("div[class='nav-line-1-container']>span");
        clickCssSelector ("div[id='nav-signin-tooltip']>a>span");
        setSelector ("div[class='a-row a-spacing-base']>input",email);
        TimeUnit.SECONDS.sleep (2);
        clickId ("continue");
        TimeUnit.SECONDS.sleep (2);
        setId ("ap_password",password);
        clickId ("signInSubmit");
        return new HomePage (driver);
    }

}
