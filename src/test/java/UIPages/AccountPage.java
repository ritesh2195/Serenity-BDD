package UIPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AccountPage extends PageObject {

    public void isLogoVisible(){

        shouldBeVisible(By.className("logo"));
    }

    public String doSearch(String text, String ProductName){

        typeInto($("#search_query_top"), text);

        waitForTextToAppear(ProductName);

        clickOn($("//li[text()='"+ProductName+"']"));

        return $(By.tagName("h1")).getText();
    }

}
