package my.qa.step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my.qa.page.MainPage;

import java.util.List;

public class MainStepdefs {

    private MainPage mainPage;

    public MainStepdefs() {
        this.mainPage = new MainPage();
    }

    @Given("User is on the main page")
    public void userIsOnTheMainPage() {
        mainPage.loaded();
    }

    @When("User opens search dialog")
    public void userOpensSearchDialog() {
        mainPage.openSearchDialog();
    }

    @And("User puts search query {string}")
    public void userPutsSearchQuery(String arg0) {
        mainPage.putSearchQuery(arg0);
    }

    @When("User navigates to categories page")
    public void userNavigatesToCategoriesPage() {
        mainPage.showServiceCategories();
    }

    @When("User checks personal debt")
    public void userChecksPersonalDebt() {
        mainPage.checkPersonalDebt();
    }

    @Then("User has no personal debt")
    public void userHasNoPersonalDebt() {
        mainPage.noPersonalDebt();
    }
}
