package UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageObject {

    @FindBy(id = "email")
    WebElement email;

    @FindBy(css = "#id_order")
    WebElement orderRef;

    @FindBy(css = "#message")
    WebElement message;

    By heading = By.id("id_contact");

    By fileUpload = By.id("fileUpload");

    By submit  = By.id("submitMessage");

    By successMessage = By.className("alert-success");

    public String fillContactUsPage(){

        email.sendKeys("rrm@gmail.com");

        orderRef.sendKeys("12552");

        message.sendKeys("please look into this issue");

        element(heading).selectByVisibleText("Webmaster");

        upload("E:\\Ritesh\\abc.txt").to(find(fileUpload));

        element(submit).click();

        return element(successMessage).getText();
    }
}
