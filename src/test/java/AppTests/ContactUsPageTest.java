package AppTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import Steps.LoginPageSteps;
import Steps.ContactUsPageSteps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ContactUsPageTest extends BaseTest {

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    ContactUsPageSteps contactUsPageSteps;

    @Before
    public void setUp(){

        loginPageSteps.isOnLoginPage();

        loginPageSteps.navigateToContactUsPage();
    }

    @Test
    public void contactUsPageTest(){

        String msg = contactUsPageSteps.fillContactUs();

        String expMsg = "Your message has been successfully sent to our team.";

        Assert.assertEquals(expMsg, msg);
    }
}
