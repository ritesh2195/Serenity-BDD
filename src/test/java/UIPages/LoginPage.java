package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {

    public void doLogin() {

        $("#email").sendKeys("sameer21@gmail.com");

        $("#passwd").sendKeys("qwerty");

        $("#SubmitLogin").click();

    }

    public String AccountPageIsVisible(){

        return $("//div[@id='center_column']//h1").getText();
    }
}