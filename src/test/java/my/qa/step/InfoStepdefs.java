package my.qa.step;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my.qa.page.InfoPage;

public class InfoStepdefs {

    private InfoPage infoPage;

    public InfoStepdefs() {
        this.infoPage = new InfoPage();
    }

    @When("User navigates to personal page")
    public void userNavigatesToPersonalPage() {
        infoPage.open();
    }

    @Then("User should be on the personal page")
    public void userShouldBeOnThePersonalPage() {
        infoPage.verify();
    }

}
