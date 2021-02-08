package Steps;

import UIPages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginPageSteps {

    private LoginPage loginPage;

    @Step
    public void isOnLoginPage(){

        loginPage.open();
    }

    @Step
    public void loginAsUser(){

        loginPage.doLogin();
    }

    @Step
    public void verifyLogin(){

        String text = loginPage.AccountPageIsVisible();

        Assert.assertEquals("MY ACCOUNT",text);
    }

    @Step
    public void navigateToContactUsPage(){

        loginPage.goToContactUsPage();
    }
}
