package Norbert.apps.JavaTests.steps;

import Norbert.apps.JavaTests.components.ComponentTwo;
import Norbert.apps.JavaTests.auth.Auth;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class StepDef {
    @Autowired
    ComponentTwo componentTwo;
    @Autowired
    Auth componentInterface;

    @When("^the client calls$")
    public void the_client_issues_GET_version() throws Throwable {
        System.out.println(componentTwo.getMessage());
        System.out.println(componentInterface.getName());
    }

    @Then("^the client receives status code of$")
    public void the_client_receives_status_code_of() throws Throwable {
    }

    @And("^the client receives server version$")
    public void the_client_receives_server_version_body() throws Throwable {
    }

    @Before
    public void setUpDriver() {
        Selenide.open();
    }

    @After
    public void closeDriver() {
        Selenide.closeWebDriver();
    }
}