package Norbert.apps.JavaTests.steps;

import Norbert.apps.JavaTests.pages.LoginPage;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps {
    @Autowired
    LoginPage loginPage;

    @When("^the client open selenide page$")
    public void openSelenidePage(){
        loginPage.openPage();
    }
}
