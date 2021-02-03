package Steps;

import UIPages.AccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class AccountPageSteps {


    private AccountPage accountPage;

    @Step
    public void verifyLogo(){

        accountPage.isLogoVisible();
    }

    public String searchProduct(String serach, String ProductName){

        return accountPage.doSearch(serach, ProductName);
    }
}
