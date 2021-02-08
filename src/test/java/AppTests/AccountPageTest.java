package AppTests;

import Steps.AccountPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Steps.LoginPageSteps;

@RunWith(SerenityRunner.class)
public class AccountPageTest extends BaseTest {

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    AccountPageSteps accountPageSteps;

    @Before
    public void setUp(){

        loginPageSteps.isOnLoginPage();

        loginPageSteps.loginAsUser();

    }

    @Test
    public void accLogoTest(){

        accountPageSteps.verifyLogo();
    }

    @Test
    public void searchTest(){

        String productName = accountPageSteps.searchProduct("dress","T-shirts > Faded Short Sleeve T-shirts");

        Assert.assertEquals("Faded Short Sleeve T-shirts", productName);
    }
}
