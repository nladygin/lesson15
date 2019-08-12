package my.qa.step;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my.qa.page.MainPage;


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
