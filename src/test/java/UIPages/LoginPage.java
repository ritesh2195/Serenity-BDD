package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

//@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {

    public void doLogin() {

        $("#email").sendKeys("rrm@gmail.com");

        $("#passwd").sendKeys("qwerty");

        $("#SubmitLogin").click();

    }

    public String AccountPageIsVisible(){

        return $("//div[@id='center_column']//h1").getText();
    }

    public void goToContactUsPage(){

        $("//a[text()='Contact us']").click();
    }
}