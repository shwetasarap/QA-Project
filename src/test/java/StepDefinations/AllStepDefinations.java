package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.BaseClass;


public class AllStepDefinations  {


    private String browser;


    @Then("Verify user able to successfully able to login in the application")
    public void verifyUserAbleToSuccessfullyAbleToLoginInTheApplication() {
    }

    @When("User enter the <username> and <password> on login page")
    public void userEnterTheUsernameAndPasswordOnLoginPage() {

    }

    @Given("User want to go to Application <browser>")
    public void userWantToGoToApplicationBrowser() {
        System.out.println("hello");
        BaseClass baseClass = new BaseClass();
        baseClass.setUp(browser);
        baseClass.tearDown();
    }
}
