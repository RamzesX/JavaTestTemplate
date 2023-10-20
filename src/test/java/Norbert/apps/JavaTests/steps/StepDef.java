package Norbert.apps.JavaTests.steps;

import Norbert.apps.JavaTests.Components.Component1;
import Norbert.apps.JavaTests.Components.ComponentOne;
import Norbert.apps.JavaTests.Components.ComponentTwo;
import Norbert.apps.JavaTests.auth.Auth;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

public class StepDef {
    @Autowired
    ComponentOne componentOne;
    @Autowired
    ComponentTwo componentTwo;
    @Autowired
    private Environment environment;

    @Autowired
    private Auth componentInterface;

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
}